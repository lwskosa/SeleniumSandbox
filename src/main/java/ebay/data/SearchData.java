package main.java.ebay.data;

import org.testng.annotations.DataProvider;

public class SearchData {

    @DataProvider
    public Object[][] searchProducts(){
        return new Object[][]{
                {"iphone"},
                {"gtx 3080"},
                {"summer decoration"}
        };
    }
}
