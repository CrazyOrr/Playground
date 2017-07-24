package com.github.crazyorr.playground.di.module;

import android.app.Activity;

import com.github.crazyorr.playground.activity.MainActivity;
import com.github.crazyorr.playground.di.component.MainActivitySubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainActivitySubcomponent.class)
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindYourActivityInjectorFactory(MainActivitySubcomponent.Builder builder);
}
