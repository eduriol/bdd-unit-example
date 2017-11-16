import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bdd.retail.entities.Customer;

public class WhenSigningUpANewCustomer {

	@Test
	public void the_customer_should_be_correctly_set_up() {
		Customer customer = new Customer("123456789", "Marty", "McFly");
		assertEquals("Marty", customer.getName());
		assertEquals("McFly", customer.getSurname());
		assertEquals("123456789", customer.getCustomerNumber());
	}
	
	@Test
	public void the_customer_should_receive_100_points_when_set_up() {
		Customer customer = new Customer("123456789", "Marty", "McFly");
		assertEquals(100, customer.getPoints());
	}

}