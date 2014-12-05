package com.quantumfin.daori.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daori on 12/3/14.
 */
public class RegisterResponse {
    @SerializedName("client_id")
    private String clientId;
    @SerializedName("client_secret")
    private String clientSecret;
    @SerializedName("expire_at")
    private int expireAt;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public int getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(int expireAt) {
        this.expireAt = expireAt;
    }
}
