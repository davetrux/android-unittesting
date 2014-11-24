package com.hp.es.usps.testable.testableapp;

import com.hp.es.usps.testable.mock.MockModule;

import org.robolectric.TestLifecycleApplication;

import java.lang.reflect.Method;

import dagger.ObjectGraph;

/**
 * Created by david on 11/23/14.
 */
public class TestMainApplication extends MainApplication implements TestLifecycleApplication {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        objectGraph = ObjectGraph.create(new MockModule());
    }

    public ObjectGraph getObjectGraph() {
        return this.objectGraph;
    }

    @Override
    public void beforeTest(Method method) {

    }

    @Override
    public void prepareTest(Object test) {

    }

    @Override
    public void afterTest(Method method) {

    }
}
