package com.eric.junit5.sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @DisplayName("Test App.hello()")
    @Test
    public void testHello() {
        assertEquals("Hello World", App.hello());
    }
}
