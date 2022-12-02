package com.wipro.test;
import com.wipro.task.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestStringConcat {
	@Test
	public void testDoStringConcat() {
	DailyTask dt = new DailyTask();
	assertEquals("apple fruit",dt.doStringConcat("apple","fruit"));

}
}
