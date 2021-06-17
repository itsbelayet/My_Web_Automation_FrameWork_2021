package com.ebay.data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "getDataForSearchTest")
    public Object[][] getDataForTest() {
        return new Object[][]{
                {"Java Books"},
                {"dslr camera"},
                {"iPhone"}
        };
    }

    @DataProvider(name = "getUserForCreateAccountTest")
    public Object[][] getUserForAccountTest() {
        return new Object[][]{
                {"mohammed", "hossain", "mohammed@gmail.com", "testpass0"},
                {"belayet", "hossain", "belayet@gmail.com", "testpass2"},
                {"mamunur", "rashid", "mamun@gmail.com", "testpass2"}
        };
    }
}
