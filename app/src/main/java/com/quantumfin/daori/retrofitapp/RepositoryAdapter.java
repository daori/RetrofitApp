package com.quantumfin.daori.retrofitapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.quantumfin.daori.retrofitapp.model.Repository;

import java.util.List;

/**
 * Created by daori on 12/5/14.
 */
public class RepositoryAdapter extends ArrayAdapter<Repository>{
    private List<Repository> items;
    private Context context;
    private int resource;
    private Repository repository;

    public RepositoryAdapter(Context context, int resource, List<Repository> items) {
        super(context, resource, items);
        this.items = items;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.list_repo_item, null);

            ViewHolder holder = new ViewHolder();
            holder.repoName = (TextView) row.findViewById(R.id.repo_name);
            holder.fullName= (TextView) row.findViewById(R.id.fullname);
            row.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) row.getTag();
        Repository repo = items.get(position);
        holder.repoName.setText(repo.getName());
        holder.fullName.setText(repo.getFullName());

        return row;

    }

    public class ViewHolder{
        public TextView repoName,fullName;
    }
}
