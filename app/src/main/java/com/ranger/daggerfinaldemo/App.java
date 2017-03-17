package com.ranger.daggerfinaldemo;

import android.app.Application;

/**
 * Created by Rakshit on 16-03-2017 at 21:14.
 */

public class App extends Application {

    private User user;

    @Override
    public void onCreate() {
        super.onCreate();
        user = DaggerUser.builder()
                .appModule(new AppModule(this))
                .build();

    }

    public User getUser() {
        return user;
    }
}
