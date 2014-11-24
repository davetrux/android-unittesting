package com.hp.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by truxall on 4/10/2014.
 */
@RunWith(RobolectricTestRunner.class)
public class SimpleTest {

    @Test
    public void testNothing(){
        final int expected = 1;
        final int reality = 1;
        assertEquals(expected, reality);
    }
}
