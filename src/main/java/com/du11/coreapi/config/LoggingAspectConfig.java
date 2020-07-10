package com.du11.coreapi.config;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfig {

    private static final String PACKAGE_NAME = "com.du11.coreapi.config.LoggingAspectConfig";

    public static final String POINTCUT_CONTROLLER = PACKAGE_NAME + "controllerLayerPointcut()";
    public static final String POINTCUT_SERVICE = PACKAGE_NAME + "serviceLayerPointcut()";
    public static final String POINTCUT_REPOSITORY = PACKAGE_NAME + "repositoryLayerPointcut()";

    @Pointcut("execution (* com.du11.*.controller..*(..)))")
    public void controllerLayerPointcut() {}

    @Pointcut("execution (* com.du11.*.service..*(..)))")
    public void serviceLayerPointcut() {}

    @Pointcut("execution (* com.du11.*.repository..*(..)))")
    public void repositoryLayerPointcut() {}

}
