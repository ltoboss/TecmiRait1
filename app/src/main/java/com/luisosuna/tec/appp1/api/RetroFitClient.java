package com.luisosuna.tec.appp1.api;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String API_URL) {
        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
