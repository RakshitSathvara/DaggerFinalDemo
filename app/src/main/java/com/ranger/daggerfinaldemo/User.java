package com.ranger.daggerfinaldemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rakshit on 16-03-2017 at 21:15.
 */

@Singleton
@Component(modules = AppModule.class)
public interface User {
    void inject(MainActivity mainActivity);
}
