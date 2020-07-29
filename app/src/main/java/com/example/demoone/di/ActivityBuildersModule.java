package com.example.demoone.di;

import com.example.demoone.di.auth.AuthViewModelsModule;
import com.example.demoone.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class})
    abstract AuthActivity contributeAuthActivity();
}
