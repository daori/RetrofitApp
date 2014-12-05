package com.quantumfin.daori.retrofitapp;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.quantumfin.daori.retrofitapp.helper.ConsumerKeys;
import com.quantumfin.daori.retrofitapp.helper.SecretHelper;
import com.quantumfin.daori.retrofitapp.model.Register;
import com.quantumfin.daori.retrofitapp.model.RegisterResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends Activity {

    NetzMeAPI netzmeAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Register register = new Register();
        register.setType("client_associate");
        register.setApplicationName("native_android");
        register.setApplicationType("native");


        if(ConsumerKeys.isConsumerKeysExist()){
            //TODO use available key
        } else {
            getNetzMeAPI().register(register, new Callback<RegisterResponse>() {
                @Override
                public void success(RegisterResponse registerResponse, Response response) {
                    showToast("client_id : " + registerResponse.getClientId() + "\n" +
                                    "secret_key : " + registerResponse.getClientSecret()
                    );
                }

                @Override
                public void failure(RetrofitError error) {
                    showToast("Failed " + error.toString());
                }
            });
        }
    }

    private void showToast(String message){
        Toast.makeText(MainActivity.this, message,
                Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    private NetzMeAPI getNetzMeAPI(){
        if(netzmeAPI == null){
            netzmeAPI = NetzMeRestClient.getService();
        }
        return netzmeAPI;
    }

}
