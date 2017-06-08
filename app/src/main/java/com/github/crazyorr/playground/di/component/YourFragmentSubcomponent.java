package com.github.crazyorr.playground.di.component;

import com.github.crazyorr.playground.di.module.LocationModule;
import com.github.crazyorr.playground.fragment.YourFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {LocationModule.class})
public interface YourFragmentSubcomponent extends AndroidInjector<YourFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<YourFragment> {
    }
}
