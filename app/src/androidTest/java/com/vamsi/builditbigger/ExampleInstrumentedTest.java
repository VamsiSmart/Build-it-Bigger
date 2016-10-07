package com.vamsi.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest implements GCEPointsAsynTask.JsonGetTaskListener {

    GCEPointsAsynTask downloader;
    CountDownLatch signal;

    @Before
    protected void setUp() throws Exception {

        signal = new CountDownLatch(1);
        //downloader = new GCEPointsAsynTask(getClass());
    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.vamsi.builditbigger", appContext.getPackageName());
    }

    @Override
    public void onComplete(String jsonString, Exception e) {

    }
}