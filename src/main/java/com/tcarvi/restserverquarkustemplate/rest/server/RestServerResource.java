package com.tcarvi.restserverquarkustemplate.rest.server;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.vertx.core.json.JsonObject;

import org.jboss.resteasy.reactive.PartType;
import org.jboss.resteasy.reactive.RestForm;
import org.jboss.resteasy.reactive.multipart.FileUpload;

import org.jboss.resteasy.reactive.RestPath;

@Path("/restServer")
public class RestServerResource {

    @Inject
    RestServerService restServerService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject restServerResourceExecution(){
        return restServerService.exec();
    }

    @GET
    @Path("/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getName(@RestPath String name) {
        return restServerService.exec(name);
    }

    @GET
    @Path("/name-async/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getNameAsync(@RestPath String name) {
        return restServerService.exec(name);
    }

    @GET
    @Path("/name-uni/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getNameMutiny(@RestPath String name) {
        return restServerService.exec(name);
    }

    @POST
    @Path("/file/{filne}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getFileUploaded(@RestPath String name) {
        return restServerService.exec(name);
    }


}
