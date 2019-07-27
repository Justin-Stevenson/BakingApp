package com.nanodegree.android.stevenson.bakingapp.ui;

import android.os.Bundle;

import com.nanodegree.android.stevenson.bakingapp.R;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
