package com.nanodegree.android.stevenson.bakingapp.di;

import android.app.Application;

import com.nanodegree.android.stevenson.bakingapp.BakingApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ViewBuildersModule.class
})
public interface AppComponent extends AndroidInjector<BakingApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
