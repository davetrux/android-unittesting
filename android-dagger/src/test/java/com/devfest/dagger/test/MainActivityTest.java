package com.devfest.dagger.test;

import android.widget.ListView;
import com.devfest.dagger.app.MainActivity;
import com.devfest.dagger.app.R;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by david on 4/28/14.
 */


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

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
