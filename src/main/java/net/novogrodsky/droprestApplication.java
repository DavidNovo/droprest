package net.novogrodsky;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class droprestApplication extends Application<droprestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new droprestApplication().run(args);
    }

    @Override
    public String getName() {
        return "droprest";
    }

    @Override
    public void initialize(final Bootstrap<droprestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final droprestConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
