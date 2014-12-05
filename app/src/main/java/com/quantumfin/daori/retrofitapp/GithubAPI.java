package com.quantumfin.daori.retrofitapp;

import com.quantumfin.daori.retrofitapp.model.Repository;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by daori on 12/5/14.
 */
public interface GithubAPI {
    @GET("/users/{user}/repos")
    void repositories(
            @Path("user") String username,
            Callback<List<Repository>> callback
    );
}
