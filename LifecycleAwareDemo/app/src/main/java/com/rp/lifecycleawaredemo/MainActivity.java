package com.rp.lifecycleawaredemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

//This App is based on https://youtu.be/QMvSvU7ADf0 Lifecycle Owner and Observer
public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "From Observer onCreateEvent: on Create is Called");
        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: Owner");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: Owner");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: Owner");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: Owner");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: Owner");
    }
}