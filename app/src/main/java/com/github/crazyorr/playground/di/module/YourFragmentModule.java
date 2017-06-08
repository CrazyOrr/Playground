package com.github.crazyorr.playground.di.module;

import android.support.v4.app.Fragment;

import com.github.crazyorr.playground.di.component.YourFragmentSubcomponent;
import com.github.crazyorr.playground.fragment.YourFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = YourFragmentSubcomponent.class)
public abstract class YourFragmentModule {
    @Binds
    @IntoMap
    @FragmentKey(YourFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    bindYourFragmentInjectorFactory(YourFragmentSubcomponent.Builder builder);
}
