package knowyourtown.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by matteo on 10/05/17.
 */

@ApplicationPath("knowyourtown-process-centric")
public class Configuration extends ResourceConfig {
    public Configuration() {
        packages("knowyourtown.rest");
    }
}
