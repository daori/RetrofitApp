package com.quantumfin.daori.retrofitapp.model;

import com.quantumfin.daori.retrofitapp.GithubAPI;
import com.quantumfin.daori.retrofitapp.NetzMeAPI;

import retrofit.RestAdapter;

/**
 * Created by daori on 12/5/14.
 */
public class GithubRestClient {
    private static final String GITHUB_URL = "https://api.github.com";

    public static GithubAPI getGithubAPI(){
        return new RestAdapter.Builder()
                .setEndpoint(GITHUB_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build().create(GithubAPI.class);
    }
}
