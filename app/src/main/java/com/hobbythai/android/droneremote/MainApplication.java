package com.hobbythai.android.droneremote;

import android.app.Application;
import android.content.Context;

import com.secneo.sdk.Helper;

public class MainApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Helper.install(MainApplication.this);
    }
}
