package com.quantumfin.daori.retrofitapp.model;

/**
 * Created by daori on 12/3/14.
 */
public class RegisterResponse {
    private String client_id;
    private String client_secret;
    private int expire_at;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public int getExpire_at() {
        return expire_at;
    }

    public void setExpire_at(int expire_at) {
        this.expire_at = expire_at;
    }
}
