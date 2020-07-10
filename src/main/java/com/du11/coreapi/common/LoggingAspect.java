package com.du11.coreapi.common;

import com.du11.coreapi.config.LoggingAspectConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Slf4j
@Component
public class LoggingAspect {

    @Autowired
    ObjectMapper mapper;

    @Around(LoggingAspectConfig.POINTCUT_CONTROLLER +" || "+LoggingAspectConfig.POINTCUT_SERVICE
            + " || "+LoggingAspectConfig.POINTCUT_REPOSITORY)
    public Object logHeadAndTail(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();

        String className = methodSignature.getDeclaringType().getSimpleName();
        String method = methodSignature.getName();
        for (Object param : proceedingJoinPoint.getArgs()) {
            if (param instanceof Class) {
                log.info(String.format("[%s.%s] params value: %s", className, method, mapper.writeValueAsString(param)));
            } else if (null == param) {
                log.info(String.format("[%s.%s] params value: %s", className, method, "NULL"));
            } else {
                log.info(String.format("[%s.%s] params value: %s", className, method, param.toString()));
            }
        }

        log.info(String.format("[%s.%s] execution time: %s ms", className, method, stopWatch.getTotalTimeMillis()));
        if (!Repository.class.isAssignableFrom(methodSignature.getDeclaringType())) {
            log.info(String.format("[%s.%s] result: %s", className, method, mapper.writeValueAsString(result)));
        }

        return result;
    }
}
