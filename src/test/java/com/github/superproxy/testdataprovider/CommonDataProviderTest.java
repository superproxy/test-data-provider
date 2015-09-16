package com.github.superproxy.testdataprovider;

import com.github.superproxy.testdataprovider.entry.testng.CommonDataProvider;
import com.github.superproxy.testdataprovider.support.csv.Csv;
import com.github.superproxy.testdataprovider.support.json.Json;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

@Test
public class CommonDataProviderTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonDataProviderTest.class);

    @Test(dataProvider = "genData", dataProviderClass = CommonDataProvider.class)
    @Json("/com/github/superproxy/testdataprovider/3.json")
    public void test3(TestModel user, int real) {
        assertNotNull(user);
        assertNotNull(real);
    }

    @Test(dataProvider = "genData", dataProviderClass = CommonDataProvider.class)
    @Json("/com/github/superproxy/testdataprovider/2.json")
    public void test1(TestModel user, TestModel user1, int expected) {
        LOGGER.debug("user:{}, user1:{}", user, user1);
        assertNotNull(user);
        assertNotNull(user1);
        assertNotNull(expected);
    }


    @Test(dataProvider = "genData", dataProviderClass = CommonDataProvider.class)
    @Csv(value = "/com/github/superproxy/testdataprovider/2.csv", encoding = "utf-8")
    public void test4(String userName, String password, String expected) {
        assertNotNull(userName);
        assertNotNull(password);
        assertNotNull(expected);
    }

    @Test(dataProvider = "genData", dataProviderClass = CommonDataProvider.class)
    @Csv(value = "/com/github/superproxy/testdataprovider/中文.csv")
//    @Csv(value = "src/test/resources/com/github/superproxy/testdataprovider/中文.csv", encoding = "gbk")
    public void test5(String userName, String password, String expected) {
        assertNotNull(userName);
        assertNotNull(password);
        assertNotNull(expected);
    }
}