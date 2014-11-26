package com.devfest.dagger.app;

import com.devfest.dagger.test.mock.MockModule;
import dagger.ObjectGraph;
import org.robolectric.TestLifecycleApplication;

import java.lang.reflect.Method;

/**
 * Created by truxall on 5/14/2014.
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
