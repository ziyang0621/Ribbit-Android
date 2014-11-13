package com.example.ziyang0621.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by ziyang0621 on 11/12/14.
 */
public class RibbitApplication extends Application {

    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "iqh692x7NwGaINMXFFluiqxlmYFLYJTmXORmjCm6", "E2znbE6bvQEAJnNGzRzsnWkgiWRSjGRYhCJ7ToEi");
    }
}
