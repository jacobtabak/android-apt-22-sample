package com.example.myapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 18)
public class MyTest {
  @Test
  public void testSomething() throws Exception {
    assertTrue(true);
  }
}