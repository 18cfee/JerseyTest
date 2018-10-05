package com.programmerscuriosity;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Application;
//https://www.logicbig.com/tutorials/java-ee-tutorial/jax-rs/jax-rs-unit-testing.html
public class OrderServiceTest extends JerseyTest {

	@Override
	protected Application configure() {
		return new ResourceConfig(OrderService.class);
	}

	@Test
	public void ordersPathParamTest() {
		String response = target("orders/453").request().get(String.class);
		Assert.assertTrue("orderId: 453".equals(response));
	}

	@Test
	public void ordersFixedPathTest() {
		String response = target("orders/summary").request().get(String.class);
		Assert.assertTrue("orders summary".equals(response));
	}
}
