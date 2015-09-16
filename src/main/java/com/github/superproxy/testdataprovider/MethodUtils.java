package com.github.superproxy.testdataprovider;

import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;

import java.lang.reflect.Method;

public final class MethodUtils {
    private static final ParameterNameDiscoverer parameterNameDiscoverer
            = new LocalVariableTableParameterNameDiscoverer();


    /**
     * NOTE might go wrong if missing debug symbols
     * 1.8 jdk有问题
     */

    public static String[] getParameterNames(final Method method) {
        return parameterNameDiscoverer.getParameterNames(method);
    }
}