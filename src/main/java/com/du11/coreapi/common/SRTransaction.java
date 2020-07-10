package com.du11.coreapi.common;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Transactional(value = "srTransactionManager", propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public @interface SRTransaction {
}
