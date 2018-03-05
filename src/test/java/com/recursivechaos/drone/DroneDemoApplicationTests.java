package com.recursivechaos.drone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class DroneDemoApplicationTests {

	@Test
	public void testBuildMethod() {
        String greeting = DroneDemoApplication.buildGreeting("Dave");
        assertEquals("that the correct greeting was returned", "Hello Dave", greeting);
    }

}
