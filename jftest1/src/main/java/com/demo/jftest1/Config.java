package com.demo.jftest1;

import com.demo.jftest1.web.IndexController;
import com.jfinal.config.*;
import com.jfinal.template.Engine;

/**
 * Created by zhenyu on 2018/8/15.
 */
public class Config extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }
    @Override
    public void configRoute(Routes me) {
        me.add("/", IndexController.class);
    }
    @Override
    public void configEngine(Engine me) {}
    @Override
    public void configPlugin(Plugins me) {}
    @Override
    public void configInterceptor(Interceptors me) {}
    @Override
    public void configHandler(Handlers me) {}
}
