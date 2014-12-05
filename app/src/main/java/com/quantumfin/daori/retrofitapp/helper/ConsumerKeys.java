package com.quantumfin.daori.retrofitapp.helper;

import android.content.Context;

import com.quantumfin.daori.retrofitapp.model.RegisterResponse;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by daori on 12/5/14.
 */
public class ConsumerKeys {
    private static final String CONSUMER_KEYS_FILE_NAME = "consumer_keys.json";
    private RegisterResponse registerResponse;
    private Context context;

    public ConsumerKeys(RegisterResponse registerResponse, Context context) {
        this.registerResponse = registerResponse;
        this.context = context;
    }

    public static boolean isConsumerKeysExist() {
        return false;
    }


}
