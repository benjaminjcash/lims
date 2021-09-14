package managers;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.CustomerBean;

public class LoginManagerTest {

	@Test
	public void testValidLogin() {
		System.out.println("starting testValidLogin");
		CustomerBean customer = new CustomerBean();
		customer.setUsername("ffrank");
		customer.setPassword("you_tube99");
		LoginManager manager = new LoginManager();
		Boolean success = manager.authenticate(customer);
		assertTrue(success);
		System.out.println("testValidLogin passed!");
	}
	
	@Test
	public void testInvalidLogin() {
		System.out.println("starting testInvalidLogin");
		CustomerBean customer = new CustomerBean();
		customer.setUsername("ssteve");
		LoginManager manager = new LoginManager();
		Boolean success = manager.authenticate(customer);
		assertFalse(success);
		System.out.println("testInvalidLogin passed!");
	}

}
