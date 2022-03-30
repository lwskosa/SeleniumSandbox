package main.java.aspiration.objects;

import org.openqa.selenium.By;

public interface BaseElements {

// Get Stqrted Header
    By openAccountButtonLocator     = By.xpath("//*[@id=\"__next\"]/div/header/ul[2]/li[2]/button");
    By modalLetsGetStartedLocator   = By.xpath("/html/body/div[4]/div/div/div/div[2]/div/span");
    By modalEmailGetStartedLocator  = By.xpath("/html/body/div[4]/div/div/div/div[2]/h5");
    By modalEmailInputLocator       = By.name("email");
    By modalEmailButtonLocator      = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[2]/button");
    By modalDisclaimerLocator       = By.xpath("/html/body/div[4]/div/div/div/div[2]/p");

    String modalLetsGetStartedLabelText     = "LET'S GET STARTED";
    String modalEmailGetStartedLabelText    = "Enter your email to get started";
    String modalEmailInputPlaceholderText   = "Email Address";
    String modalEmailButtonLabelText        = "GET STARTED";
    String modalDisclaimerLabelText         = "We respect your privacy and will never sell or lease your email for any reason.";
    // Pattern format for Header links
    String headerLinksFormat = "//*[@id=\"__next\"]/div/header/ul[1]/li[%d]/a";
    // Expected destinations for header navigation
    String logoURL          = "https://www.aspiration.com/";
    String SpendAndSaveURL  = "https://www.aspiration.com/spendandsave";
    String CreditURL        = "https://www.aspiration.com/credit";
    String enterpriseURL    = "https://www.aspiration.com/business";
    String whoweareURL      = "https://www.aspiration.com/who-we-are";
    String impactURL        = "https://www.aspiration.com/impact";
}
