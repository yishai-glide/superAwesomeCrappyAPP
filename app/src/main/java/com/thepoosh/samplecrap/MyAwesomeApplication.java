package com.thepoosh.samplecrap;

import android.app.Application;
import android.util.Log;

/**
 * Created by thepoosh on 04/01/2017.
 */

public class MyAwesomeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("yishai", "application has started");
    }
}
