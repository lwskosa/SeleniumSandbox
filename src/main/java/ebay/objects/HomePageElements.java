package main.java.ebay.objects;

import org.openqa.selenium.By;

public interface HomePageElements {
    By searchField   = By.id("gh-ac");
    By searchButton  = By.id("gh-btn");
    By searchResults = By.xpath("//*[@id=\"srp-river-results\"]/ul/li");

}
