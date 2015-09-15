package com.github.superproxy.testdataprovider;

public interface DataProvider {
    Class getDataType();

    Object[][] getObjects(MethodContext methodContext);
}
