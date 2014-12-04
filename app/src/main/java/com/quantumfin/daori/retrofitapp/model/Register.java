package com.quantumfin.daori.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daori on 12/3/14.
 */
public class Register {
    private String type;
    @SerializedName("application_type")
    private String applicationType;
    @SerializedName("application_name")
    private String applicationName;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
