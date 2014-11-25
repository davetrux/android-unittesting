package com.hp.tests;

import com.hp.mvp.MainApplication;
import com.hp.tests.mock.MockModule;
import org.robolectric.TestLifecycleApplication;
import java.lang.reflect.Method;
import dagger.ObjectGraph;

/**
 * Created by trux on 11/23/14.
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
