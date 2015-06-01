package com.jamindy.rest;

import com.jamindy.model.Friend;
import com.jamindy.mongo.JongoClient;
import org.jongo.Jongo;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by admin on 15-5-31.
 */
@Component
@Path("/hello")
public class HelloRS {

    private Jongo jongo = JongoClient.getInstance();

    @GET
    public String sayHelloWord(){
        return "hello, world";
    }

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name){
        return "hello, "+name;
    }

    @GET
    @Path("/friend")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Friend> getFriends(){
        return jongo.getCollection("friend").find().as(Friend.class);
    }
}
