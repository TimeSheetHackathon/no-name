package com.intentfilter.mytimesheet;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class TimesheetApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
