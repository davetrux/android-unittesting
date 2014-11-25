package com.hp.tests;

import android.widget.ListView;

import com.hp.mvp.MainActivity;
import com.hp.mvp.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(RobolectricGradleTestRunner.class)
public class ApplicationTest {
    @Before
    public void setUp()
    {


    }

    @Test
    public void testNumberOfRows(){

        final int Expected_Rows = 3;

        MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().visible().get();

        ListView list = (ListView)activity.findViewById(R.id.taskList);

        assertNotNull(list);

        int count = list.getAdapter().getCount();

        assertEquals(Expected_Rows, count);
    }
}