package com.programmerscuriosity;

import com.sun.org.glassfish.gmbal.Description;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by marom on 27/09/16.
 * https://programmerscuriosity.com/2016/09/27/simple-jersey-example-with-intellij-idea-ultimate-and-tomcat/
 */
@Path("myresource")
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent
	 * to the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it!";
	}

	@GET
	@Path("/getMore")
	public String getPartialAccrualSchedule(
					@QueryParam("val") String request)
	{
		System.out.println(request);
		return "hi";
	}

}
