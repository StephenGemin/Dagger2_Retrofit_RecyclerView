package com.sgemin.daggertwoex.di.component;

import android.content.Context;
import com.sgemin.daggertwoex.di.module.AdapterModule;
import com.sgemin.daggertwoex.di.qualifier.ActivityContext;
import com.sgemin.daggertwoex.di.scopes.ActivityScope;
import com.sgemin.daggertwoex.ui.MainActivity;
import dagger.Component;

/**
 * Created by Stephen Gemin on 9/1/2019
 */
@ActivityScope
@Component(modules = AdapterModule.class, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
Context getContext();

    void injectMainActivity(MainActivity mainActivity);
}
