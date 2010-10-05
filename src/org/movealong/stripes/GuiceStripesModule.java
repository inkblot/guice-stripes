package org.movealong.stripes;

import com.google.inject.AbstractModule;

/**
 * Created by IntelliJ IDEA.
 * User: inkblot
 * Date: Sep 4, 2010
 * Time: 10:07:29 AM
 */
public class GuiceStripesModule extends AbstractModule {
    @Override
    protected void configure() {
        requestStaticInjection(GuiceActionResolver.class);
    }
}
