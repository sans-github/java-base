package com.java;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreetTest {

    private Greet greet;

    @Before
    public void setUp() {
        greet = new Greet();
    }

    @Test
    public void testGreetings() {
        assertThat(greet.getGreetings(), is("Hello there"));

    }
}
