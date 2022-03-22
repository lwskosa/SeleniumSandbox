package main.java.target.objects;

import org.openqa.selenium.By;

public interface BaseElements {

    By searchField  = By.id("search");
    By searchButton = By.xpath("/html/body/div[1]/div[2]/nav/div[2]/form/button");
    By searchButtonWPopup = By.xpath("/html/body/div[2]/div[2]/nav/div[2]/form/button");
    By searchMidBy  = By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div/div[13]");

    By searchResults = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div/div");
    By resultTitle   = By.xpath(".//div/div/div[2]/div/div/div[1]/div[1]/a");
    By resultPrice   = By.xpath(".//div/div/div[2]/div/div/div[2]/div[1]/div/div/span");


/*
    String searchField   = "search";
    String searchButton  = "/html/body/div[1]/div[2]/nav/div[2]/form/button";
    String searchButtonWSuggestions  = "/html/body/div[2]/div[2]/nav/div[2]/form/button";
    String searchResults = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div/div";

    String searchResultsButton = "select-custom-button-id";

    String productTitle = ".//div/div/div/div/div[2]/div/div/div[1]/div[1]/a";
    String productPrice = ".//div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/span";
*/
}