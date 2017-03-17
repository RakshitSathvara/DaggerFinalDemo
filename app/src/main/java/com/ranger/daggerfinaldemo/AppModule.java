package com.ranger.daggerfinaldemo;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rakshit on 16-03-2017 at 21:16.
 */

@Module
public class AppModule {

    Application application;

    public AppModule(Application application) {
        application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }
}
