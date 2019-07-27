package com.nanodegree.android.stevenson.bakingapp.di;

import com.nanodegree.android.stevenson.bakingapp.ui.MainActivity;
import com.nanodegree.android.stevenson.bakingapp.ui.recipes.RecipesFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ViewBuildersModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector
    abstract RecipesFragment contributeRecipesFragment();
}
