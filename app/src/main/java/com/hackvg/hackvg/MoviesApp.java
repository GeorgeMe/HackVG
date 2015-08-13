package com.hackvg.hackvg;
import android.app.Application;

import com.hackvg.hackvg.di.components.AppComponent;
import com.hackvg.hackvg.di.components.DaggerAppComponent;
import com.hackvg.hackvg.di.modules.ApplicationModule;
import com.hackvg.hackvg.di.modules.DomainModule;
/**
 * Created by George on 2015/8/13.
 */
public class MoviesApp extends Application {

    private AppComponent mAppComponent;

    @Override public void onCreate() {
        super.onCreate();
        this.initializeDependencyInjector();
    }

    private void initializeDependencyInjector() {

        mAppComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .domainModule(new DomainModule())
                .build();
    }

    public AppComponent getAppComponent() {

        return mAppComponent;
    }
}
