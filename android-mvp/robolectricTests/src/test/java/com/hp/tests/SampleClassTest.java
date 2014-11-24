package com.hp.tests;

import com.hp.RobolectricGradleTestRunner;
import com.hp.mvp.SampleClass;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
public class SampleClassTest {
    @Before
    public void setup() {
        //do whatever is necessary before every test
    }

    @Test
    public void testSampleClass() throws Exception {
        SampleClass sampleClass = new SampleClass();
        assertTrue(sampleClass.sampleFunction() == 1);
    }
}