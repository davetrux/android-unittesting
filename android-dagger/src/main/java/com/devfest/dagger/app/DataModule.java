package com.devfest.dagger.app;

import android.content.Context;

import com.devfest.dagger.data.DataProvider;
import com.devfest.dagger.data.SqlLiteProvider;

import dagger.*;
import javax.inject.*;

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
