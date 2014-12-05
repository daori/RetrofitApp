package com.quantumfin.daori.retrofitapp;

import com.quantumfin.daori.retrofitapp.model.Register;
import com.quantumfin.daori.retrofitapp.model.RegisterResponse;
import com.quantumfin.daori.retrofitapp.model.Users;

import java.util.List;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by daori on 12/3/14.
 */
public interface NetzMeAPI {

    @POST("/api/client/register")
    void register(@Body Register register, Callback<RegisterResponse> cb);
}
