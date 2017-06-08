package com.github.crazyorr.playground.di.module;

import com.github.crazyorr.playground.model.Location;

import dagger.Module;
import dagger.Provides;

@Module
public class LocationModule {
    @Provides
    static Location providesLocation() {
        return new Location("Shanghai");
    }
}
