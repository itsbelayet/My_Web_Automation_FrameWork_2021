package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProvidersForTest {
    @DataProvider(name = "getDataForSearchTest")
    public Object[][] getDataForSearchTest() {
        return new Object[][]{
                {"Java Books"},
                {"Selenium Books"},
                {"Computer Books"},
                {"Novel"}
        };
    }

    @DataProvider(name = "getUserForCreateAccountTest")
    public Object[][] getUserForCreateAccountTest() {
        return new Object[][]{
                {"mohammed", "mohammed@gmail.com", "testpass0"},
                {"belayet",  "belayet@gmail.com",  "testpass2"},
                {"hossain",  "hossain@gmail.com",  "testpass2"}
        };
    }
}
