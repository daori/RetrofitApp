package com.quantumfin.daori.retrofitapp;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by daori on 12/2/14.
 */
public interface GitHubService {
    @GET("/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(
            @Path("owner") String owner,
            @Path("repo") String repo
    );
}
