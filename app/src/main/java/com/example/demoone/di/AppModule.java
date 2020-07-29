package com.example.demoone.di;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String someString() {
        return "this is a test";
    }
}
