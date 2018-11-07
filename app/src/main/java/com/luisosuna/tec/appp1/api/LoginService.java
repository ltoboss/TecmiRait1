package com.luisosuna.tec.appp1.api;

import com.luisosuna.tec.appp1.models.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface LoginService   {

    @GET("me")
    Call<User> getLoginInfo(
        @Header("Authorization") String authkey
    );

}
