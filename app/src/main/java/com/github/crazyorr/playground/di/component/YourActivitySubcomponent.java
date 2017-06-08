package com.github.crazyorr.playground.di.component;

import com.github.crazyorr.playground.activity.YourActivity;
import com.github.crazyorr.playground.di.module.UserModule;
import com.github.crazyorr.playground.di.module.YourFragmentModule;

import javax.inject.Singleton;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {YourFragmentModule.class, UserModule.class})
@Singleton
public interface YourActivitySubcomponent extends AndroidInjector<YourActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<YourActivity> {
    }
}
