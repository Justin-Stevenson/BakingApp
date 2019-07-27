package com.nanodegree.android.stevenson.bakingapp.di;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String testString() {
        return "This is a test string";
    }
}
