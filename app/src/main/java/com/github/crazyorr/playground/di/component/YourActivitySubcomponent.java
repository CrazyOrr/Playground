package com.github.crazyorr.playground.di.component;

import com.github.crazyorr.playground.activity.YourActivity;
import com.github.crazyorr.playground.di.module.YourFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {YourFragmentModule.class})
public interface YourActivitySubcomponent extends AndroidInjector<YourActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<YourActivity> {
    }
}
