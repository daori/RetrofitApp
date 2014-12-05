package com.quantumfin.daori.retrofitapp;

import retrofit.RestAdapter;

/**
 * Created by daori on 12/3/14.
 */
    public class NetzMeRestClient {
    private static final String API_URL = "http://10.0.0.140";
    private static final String GITHUB_API_URL = "https://api.github.com";

    public static NetzMeAPI getService(){
        return new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build().create(NetzMeAPI.class);
    }

    public static GithubAPI getGithubService(){
        return new RestAdapter.Builder()
                .setEndpoint(GITHUB_API_URL)
                .build().create(GithubAPI.class);
    }
}
