package com.programmerscuriosity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("orders")
public class OrderService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got order service to work!";
	}

	@GET
	@Path("{orderId}")
	public String getOrders(@PathParam("orderId") String orderId) {
		return "orderId: " + orderId;
	}

	@GET
	@Path("summary")
	public String getOrdersSummary() {
		return "orders summary";
	}
}
