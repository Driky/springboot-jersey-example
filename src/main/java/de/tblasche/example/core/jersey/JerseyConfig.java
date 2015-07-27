package de.tblasche.example.core.jersey;

import de.tblasche.example.Application;
import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Named;

/**
 * Configures Jersey for use with Spring Boot.
 */
@Named
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages(Application.class.getPackage().toString());
    }
}
