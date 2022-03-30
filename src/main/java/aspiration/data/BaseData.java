package main.java.aspiration.data;

import main.java.aspiration.objects.BaseElements;
import org.testng.annotations.DataProvider;

public class BaseData {

    @DataProvider
    public Object[][] verifyNavigation(){
        return new Object[][] {
                {1, BaseElements.SpendAndSaveURL},
        };
    }

    @DataProvider
    public Object[][] getStarted(){
        return new Object[][] {
                {BaseElements.modalLetsGetStartedLocator, BaseElements.modalLetsGetStartedLabelText, true},
                {BaseElements.modalEmailGetStartedLocator, BaseElements.modalEmailGetStartedLabelText, false},
                {BaseElements.modalEmailButtonLocator, BaseElements.modalEmailButtonLabelText, true},
                {BaseElements.modalDisclaimerLocator, BaseElements.modalDisclaimerLabelText, false},
        };
    }    @DataProvider
    public Object[][] verifyInput(){
        return new Object[][] {
                {BaseElements.modalEmailInputLocator, "test@gmail.com",      BaseElements.modalEmailInputPlaceholderText},
                {BaseElements.modalEmailInputLocator, "axzb1231@gmail.co$m", BaseElements.modalEmailInputPlaceholderText},
        };
    }

}
