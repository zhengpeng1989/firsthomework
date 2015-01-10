package org.nightschool;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NightSchoolApplication extends Application<NightSchoolConfiguration> {

    public static void main(String[] args) throws Exception {
        new NightSchoolApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<NightSchoolConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/webapp","/webapp"));
        // nothing to do yet
    }

    @Override
    public void run(NightSchoolConfiguration configuration,
                    Environment environment) {
        final SayingResources resource = new SayingResources(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        environment.jersey().register(resource);
        environment.jersey().register(new DiskController());
        environment.jersey().register(new CartController());
    }

}