package com.github.crazyorr.playground.di.component;

import com.github.crazyorr.playground.YourApplication;
import com.github.crazyorr.playground.di.module.YourActivityModule;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class, YourActivityModule.class})
public interface YourApplicationComponent {
    void inject(YourApplication yourApplication);
}
