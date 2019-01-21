package com.example.dell.mvplogin.model;

public interface IUser {
    String getName();

    String getPasswd();

    int checkUserValidity(String name, String passwd);
}
