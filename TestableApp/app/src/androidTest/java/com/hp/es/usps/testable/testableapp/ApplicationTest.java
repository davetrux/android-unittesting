package com.hp.es.usps.testable.testableapp;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertEquals;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(RobolectricTestRunner.class)
public class ApplicationTest {
    @Test
    public void testInstantiation() {

        Activity activity = new Activity();

        TextView tv = new TextView(activity);
        tv.setText("e84");

        assertEquals("e84", tv.getText());


    }
}