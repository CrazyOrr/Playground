package com.github.crazyorr.playground.di.module;

import com.github.crazyorr.playground.model.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {
    @Provides
    @Singleton
    static User providesUser() {
        return new User("Lei", "Wang");
    }
}
