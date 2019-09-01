package com.sgemin.daggertwoex.di.component;

import android.content.Context;
import com.sgemin.daggertwoex.MyApplication;
import com.sgemin.daggertwoex.di.module.ContextModule;
import com.sgemin.daggertwoex.di.module.RetrofitModule;
import com.sgemin.daggertwoex.di.qualifier.ApplicationContext;
import com.sgemin.daggertwoex.di.scopes.ApplicationScope;
import com.sgemin.daggertwoex.webutils.retrofit.APIInterface;
import dagger.Component;

/**
 * Created by Stephen Gemin on 9/1/2019
 */
@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {
    public APIInterface getApiInterface();

    @ApplicationContext
    public Context getContext();

    public void injectApplication(MyApplication myapplication);

}
