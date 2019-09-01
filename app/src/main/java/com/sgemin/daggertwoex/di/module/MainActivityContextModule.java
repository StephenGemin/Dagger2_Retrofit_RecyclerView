package com.sgemin.daggertwoex.di.module;

import android.content.Context;
import com.sgemin.daggertwoex.di.qualifier.ActivityContext;
import com.sgemin.daggertwoex.di.scopes.ActivityScope;
import com.sgemin.daggertwoex.ui.MainActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Stephen Gemin on 9/1/2019
 */
@Module
public class MainActivityContextModule {
    private MainActivity mainActivity;
    public Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }
}
