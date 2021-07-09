package com.yahoo.data;

import org.testng.annotations.DataProvider;

public class YahooDataProviders {
    @DataProvider(name = "getPasswordForLogin")
    public Object[][] getDataForSearchTest() {
        return new Object[][]{
                {"mis081171"},
                {"mis071072"},
                {"mominul"},
                {"Mominul"},
                {"mominul71"},
                {"Mominul71"},
                {"mominul72"},
                {"Mominul72"},
                {"mominul1971"},
                {"mominul1972"},
                {"mominul81171"},
                {"mominul71072"},
                {"mominul081171"},
                {"mominul071072"},
                {"islam"},
                {"Islam"},
                {"islam71"},
                {"Islam71"},
                {"islam72"},
                {"Islam72"},
                {"islam1971"},
                {"islam1972"},
                {"islam81171"},
                {"islam71072"},
                {"islam081171"},
                {"islam071072"},
                {"sangram"},
                {"Sangram"},
                {"sangram71"},
                {"Sangram71"},
                {"sangram72"},
                {"Sangram72"},
                {"sangram1971"},
                {"sangram1972"},
                {"sangram81171"},
                {"sangram71072"},
                {"sangram081171"},
                {"sangram071072"},
                {"8111971"},
                {"08111971"},
                {"7101972"},
                {"07101972"},
                {"misangram"},
                {"mi_sangram"}
        };
    }

    @DataProvider(name = "getCredentialForLogin")
    public Object[][] getUserForCreateAccountTest() {
        return new Object[][]{
                {"Labonyo Shahid", "labonyo123 "},
                {"Labonyo Shahid", "labonyo456 "},
                {"Labonyo Shahid", "labonyo789 "},
                {"Labonyo Shahid", "labonyo101 "},
                {"Labonyo Shahid", "labonyo102 "},
                {"Labonyo Shahid", "google.com "},
                {"Labonyo Shahid", "labonyo104 "},
                {"Labonyo Shahid", "labonyo105 "}
        };
    }
}
