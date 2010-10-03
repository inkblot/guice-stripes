package org.movealong.stripes;

import com.google.inject.Inject;
import com.google.inject.Injector;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.controller.NameBasedActionResolver;

/**
 * Created by IntelliJ IDEA.
 * User: inkblot
 * Date: Oct 3, 2010
 * Time: 3:29:23 PM
 */
public class GuiceActionResolver extends NameBasedActionResolver {
    @Inject
    public static Injector injector;

    @Override
    protected ActionBean makeNewActionBean(Class<? extends ActionBean> type, ActionBeanContext context) throws Exception {
        return injector.getInstance(type);
    }
}
