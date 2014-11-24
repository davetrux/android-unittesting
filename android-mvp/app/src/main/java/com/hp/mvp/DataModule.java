package com.hp.mvp;


import android.content.Context;


import com.hp.mvp.data.DataProvider;
import com.hp.mvp.data.SqlLiteProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by david on 5/4/14.
 */

@Module(
        injects = {
                MainActivity.class
        }
)

public class DataModule {

    private MainApplication application;
    private Context context;

    public DataModule(MainApplication app){
        this.application = app;
        this.context = this.application.getApplicationContext();
    }

    @Provides
    @Singleton
    DataProvider provideDataProvider(){
        return new SqlLiteProvider(context);
    }
}