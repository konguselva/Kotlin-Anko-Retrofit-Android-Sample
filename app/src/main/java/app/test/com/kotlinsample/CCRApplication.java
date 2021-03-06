package app.test.com.kotlinsample;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class CCRApplication extends Application {

    public static final String TAG = CCRApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }

    @Override
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);

    }


}
