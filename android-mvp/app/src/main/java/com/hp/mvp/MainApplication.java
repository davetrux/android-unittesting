package com.hp.mvp;

import android.app.Application;

import dagger.ObjectGraph;

/**
 * Created by david on 11/23/14.
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
