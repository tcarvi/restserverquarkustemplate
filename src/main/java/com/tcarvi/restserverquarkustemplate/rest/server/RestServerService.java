package com.tcarvi.restserverquarkustemplate.rest.server;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.logging.Logger;

import io.vertx.core.json.JsonObject;

@ApplicationScoped
public class RestServerService {

    private static final Logger LOG = Logger.getLogger(RestServerService.class);

    public JsonObject exec() {
        try {
            Thread.sleep(70L); // A executar algo na Thread.
        } catch (InterruptedException ex) {
            // Lide com a exceção ou throws ex
            LOG.info(ex.getMessage());
        } finally {
            // Execução necessária por causa do código do try-catch anterior.
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("message", "restServer Simple Service Execution");
        return jsonObject;
       
    }

    public JsonObject exec(String name) {
        try {
            Thread.sleep(70L); // A executar algo na Thread.
        } catch (InterruptedException ex) {
            // Lide com a exceção ou throws ex
            LOG.info(ex.getMessage());
        } finally {
            // Execução necessária por causa do código do try-catch anterior.
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("message", "restServer Simple Service Execution");
        jsonObject.put("parameter", name);
        return jsonObject;    
    }

}
