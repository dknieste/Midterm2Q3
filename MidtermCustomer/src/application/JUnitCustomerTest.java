package application;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitCustomerTest extends customerController{

	
	@Test
	public void testFirst() {
		Customer testC = new Customer("John", "J", "Johnson", "Male", "123 Street Rd.", "City Name", "AL", "12345");
		assertEquals("Should be John", testC.getFirstName(), "John");
	}
	
	@Test
	public void testMiddle() {
		Customer testC = new Customer("John", "J", "Johnson", "Male", "123 Street Rd.", "City Name", "AL", "12345");
		assertEquals("Should be J", testC.getMiddleI(), "J");
	}
	
	@Test
	public void testLast() {
		Customer testC = new Customer("John", "J", "Johnson", "Male", "123 Street Rd.", "City Name", "AL", "12345");
		assertEquals("Should be Johnson", testC.getLastName(), "Johnson");
	}
	
	@Test
	public void testGender() {
		Customer testC = new Customer("John", "J", "Johnson", "Male", "123 Street Rd.", "City Name", "AL", "12345");
		assertEquals("Should be Male", testC.getGender(), "Male");
	}
	
	@Test
	public void testAddress() {
		Customer testC = new Customer("John", "J", "Johnson", "Male", "123 Street Rd.", "City Name", "AL", "12345");
		assertEquals("Should be 123 Street Rd.", testC.getAddress(), "123 Street Rd.");
	}
	
	@Test
	public void testCity() {
		Customer testC = new Customer("John", "J", "Johnson", "Male", "123 Street Rd.", "City Name", "AL", "12345");
		assertEquals("Should be City Name", testC.getCity(), "City Name");
	}
	
	@Test
	public void testState() {
		Customer testC = new Customer("John", "J", "Johnson", "Male", "123 Street Rd.", "City Name", "AL", "12345");
		assertEquals("Should be AL", testC.getState(), "AL");
	}
	
	@Test
	public void testZip() {
		Customer testC = new Customer("John", "J", "Johnson", "Male", "123 Street Rd.", "City Name", "AL", "12345");
		assertEquals("Should be 12345", testC.getZipCode(), "12345");
	}
	
	
	

}
