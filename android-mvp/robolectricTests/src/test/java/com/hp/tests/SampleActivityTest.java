package com.hp.tests;

import android.app.Activity;

import com.hp.RobolectricGradleTestRunner;
import com.hp.mvp.SampleActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
import static org.robolectric.Robolectric.buildActivity;

@RunWith(RobolectricGradleTestRunner.class)
public class SampleActivityTest {
    @Before
    public void setup() {
        //do whatever is necessary before every test
    }

    @Test
    public void testActivityCreated() throws Exception {
        Activity activity = buildActivity(SampleActivity.class).create().get();
        assertTrue(activity != null);
    }
}