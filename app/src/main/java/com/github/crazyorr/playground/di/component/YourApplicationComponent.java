package com.github.crazyorr.playground.di.component;

import com.github.crazyorr.playground.YourApplication;
import com.github.crazyorr.playground.di.module.MainActivityModule;
import com.github.crazyorr.playground.di.module.UserModule;
import com.github.crazyorr.playground.di.module.YourActivityModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class, YourActivityModule.class, MainActivityModule.class, UserModule.class})
@Singleton
public interface YourApplicationComponent {
    void inject(YourApplication yourApplication);
}
