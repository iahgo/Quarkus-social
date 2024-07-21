package org.acme.rest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;

import org.acme.dto.CreateUserRequest;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON) // vai consumir json
@Produces(MediaType.APPLICATION_JSON) // vai retornar json
public class UserResource {

    @POST
    public Response createUser(CreateUserRequest userRequest) {
        System.out.println("post executado");        
        System.out.println(userRequest);
        return Response.ok(userRequest).build();
    }

    @GET
    public Response listAllUserResponse() {
        return Response.ok().build();
    }
}
