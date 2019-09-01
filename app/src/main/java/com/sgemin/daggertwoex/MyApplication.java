package com.sgemin.daggertwoex;

import android.app.Activity;
import android.app.Application;
import com.sgemin.daggertwoex.di.component.ApplicationComponent;
import com.sgemin.daggertwoex.di.component.DaggerApplicationComponent;
import com.sgemin.daggertwoex.di.module.ContextModule;

/**
 * Created by Stephen Gemin on 9/1/2019
 */
public class MyApplication extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
        applicationComponent.injectApplication(this);

    }

    public static MyApplication get(Activity activity){
        return (MyApplication) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
