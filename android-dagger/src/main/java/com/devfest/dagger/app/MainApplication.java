package com.devfest.dagger.app;

import android.app.Application;

import com.devfest.dagger.data.DataProvider;
import com.devfest.dagger.data.SqlLiteProvider;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by truxall on 4/28/2014.
 */
public class MainApplication extends Application {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        objectGraph = ObjectGraph.create(new DataModule(this));
    }

    public ObjectGraph getObjectGraph() {
        return this.objectGraph;
    }
}
