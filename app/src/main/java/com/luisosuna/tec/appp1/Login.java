package com.luisosuna.tec.appp1;

import java.util.ArrayList;

public class Login {
    private int number;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

  /*  public void setUrl(String url) {
        this.password = url;
    }

    public int getNumber() {
        String[] urlPartes = url.split("/");
        return Integer.parseInt(urlPartes[urlPartes.length - 1]);
    }*/

    public void setNumber(int number) {
        this.number = number;
    }
}
