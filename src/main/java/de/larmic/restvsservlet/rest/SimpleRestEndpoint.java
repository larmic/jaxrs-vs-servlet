package de.larmic.restvsservlet.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/simpleRestEndpoint")
public class SimpleRestEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        System.out.println("simple REST endpoint GET called");
        return "simple REST endpoint GET called";
    }

    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String put() {
        System.out.println("simple REST endpoint PUT called");
        return "simple REST endpoint PUT called";
    }
}