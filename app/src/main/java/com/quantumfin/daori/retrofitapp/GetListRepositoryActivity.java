package com.quantumfin.daori.retrofitapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.quantumfin.daori.retrofitapp.model.Register;
import com.quantumfin.daori.retrofitapp.model.Repository;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class GetListRepositoryActivity extends Activity {

    private ListView listRepository;
    private List<Repository> list = new ArrayList<Repository>();
    private GithubAPI netzmeAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_list_repository);

        listRepository = (ListView) findViewById(R.id.list_repos);

        getGitHubAPI().repositories("daori",new Callback<List<Repository>>() {
            @Override
            public void success(List<Repository> repositories, Response response) {
                RepositoryAdapter adapter = new RepositoryAdapter
                        (GetListRepositoryActivity.this,
                                R.layout.list_repo_item, repositories);
                listRepository.setAdapter(adapter);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    private GithubAPI getGitHubAPI(){
        if(netzmeAPI == null){
            netzmeAPI = NetzMeRestClient.getGithubService();
        }
        return netzmeAPI;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.get_list_repository, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.action_post :
                this.startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.action_get :
                this.startActivity(new Intent(this, GetListRepositoryActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
