package main.java.target.data;

import org.testng.annotations.DataProvider;

public class SearchData {

    @DataProvider
    public static Object[][] searchProducts(){
        return new Object[][]{
                {"iphone"},
                {"samsung"},
                {"board game"}
        };
    }
}
