package com.udacity.gradle.builditbigger.backend;

import com.example.avajokes.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        Jokes jokes = new Jokes();
        return jokes.TellJoke();
    }

    public void setData(String data) {
        myData = data;
    }
}