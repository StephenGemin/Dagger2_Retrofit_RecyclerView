package com.sgemin.daggertwoex.di.module;

import com.sgemin.daggertwoex.adapter.RecyclerViewAdapter;
import com.sgemin.daggertwoex.di.scopes.ActivityScope;
import com.sgemin.daggertwoex.ui.MainActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Stephen Gemin on 9/1/2019
 */
@Module(includes = {MainActivityContextModule.class})
public class AdapterModule {

    @Provides
    @ActivityScope
    public RecyclerViewAdapter getStarWarsPeopleLIst(RecyclerViewAdapter.ClickListener clickListener) {
        return new RecyclerViewAdapter(clickListener);
    }

    @Provides
    @ActivityScope
    public RecyclerViewAdapter.ClickListener getClickListener(MainActivity mainActivity) {
        return mainActivity;
    }
}