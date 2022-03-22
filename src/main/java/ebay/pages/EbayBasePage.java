package main.java.ebay.pages;

import main.java.AttributeType;
import main.java.BaseTest;
import main.java.ebay.objects.BaseElements;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EbayBasePage {

//    HEADER NAVIGATION

    // NAIVE SOLUTION... impossible to scale up. kept for horror tales and reference what to avoid....
    public WebElement getSignInHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.signInLinkLocator);
    }

    public WebElement getRegisterHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.registerLinkLocator);
    }

    public WebElement getDailyDealsHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.dailyDealsLinkLocator);
    }

    public WebElement getBrandOutletHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.brandOutletLinkLocator);
    }

    public WebElement getHelpContactHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.helpContactLinkLocator);
    }

    public WebElement getSellHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.sellLinkLocator);
    }

    public WebElement getWatchlistHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.watchListLinkLocator);
    }

    public WebElement getWatchlistSignInHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.watchListSignInLinkLocator);
    }

    public WebElement getMyEbayHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myEbayLinkLocator);
    }
    public WebElement getMyEbaySummaryHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myESummaryLinkLocator);
    }

    public WebElement getMyEbayRecentlyViewedHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myERecentsLinkLocator);
    }

    public WebElement getMyEbayBidsOffersHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myEBidsOffersLinkLocator);
    }

    public WebElement getMyEbayWatchListHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myEWatchlistLinkLocator);
    }

    public WebElement getMyEbayPurchaseHistoryHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myEPurchaseHistoryLinkLocator);
    }

    public WebElement getMyEbayBuyAgainHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myEBuyAgainLinkLocator);
    }

    public WebElement getMyEbaySellingHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myESellingLinkLocator);
    }

    public WebElement getMyEbaySavedSearchesHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myESavedSearchesLinkLocator);
    }

    public WebElement getMyEbaySavedSellersHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myESavedSellersLinkLocator);
    }

    public WebElement getMyEbayMyGarageHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myEMyGarageLinkLocator);
    }

    public WebElement getMyEbayMessagesHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myEMessagesLinkLocator);
    }

    public WebElement getMyEbayCollectionHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.myECollectionLinkLocator);
    }

    public WebElement getNotificationsHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.notificationButton);
    }

    public WebElement getShoppingCartHeaderElement() {
        return BaseTest.driver.findElement(BaseElements.shoppingCartButton);
    }

    //        FooterElement NAVIGATION
    // ---- BUY COLUMN
    public WebElement getBuyFooterElement() {
        return BaseTest.driver.findElement(BaseElements.buyFooterLinkLocator);
    }

    public WebElement getRegistrationFooterElement() {
        return BaseTest.driver.findElement(BaseElements.registrationFooterLinkLocator);
    }

    public WebElement getMoneyBackFooterElement() {
        return BaseTest.driver.findElement(BaseElements.moneyBackFooterLinkLocator);
    }

    public WebElement getBiddingBuyingFooterElement() {
        return BaseTest.driver.findElement(BaseElements.bidBuyHelpFooterLinkLocator);
    }

    public WebElement getStoresFooterElement() {
        return BaseTest.driver.findElement(BaseElements.storesFooterLinkLocator);
    }

    public WebElement getEbayForCharityFooterElement() {
        return BaseTest.driver.findElement(BaseElements.forCharityFooterLinkLocator);
    }

    public WebElement getCharityShopFooterElement() {
        return BaseTest.driver.findElement(BaseElements.charityShopFooterLinkLocator);
    }

    // ----

    public WebElement getSellFooterElement() {
        return BaseTest.driver.findElement(BaseElements.sellFooterLinkLocator);
    }

    public WebElement getStartSellingFooterElement() {
        return BaseTest.driver.findElement(BaseElements.startSellingFooterLinkLocator);
    }

    public WebElement getHowToSellFooterElement() {
        return BaseTest.driver.findElement(BaseElements.howTosellFooterLinkLocator);
    }

    public WebElement getBusinessSellersFooterElement() {
        return BaseTest.driver.findElement(BaseElements.businessSellFooterLinkLocator);
    }

    public WebElement getAffiliatesFooterElement() {
        return BaseTest.driver.findElement(BaseElements.affiliatesFooterLinkLocator);
    }


    // ---- TOOLS AND APPS COLUMN
    public WebElement getDevelopersFooterElement() {
        return BaseTest.driver.findElement(BaseElements.developersFooterLinkLocator);
    }

    public WebElement getSecurityCenterFooterElement() {
        return BaseTest.driver.findElement(BaseElements.secuCenterFooterLinkLocator);
    }

    public WebElement getSiteMapFooterElement() {
        return BaseTest.driver.findElement(BaseElements.siteMapFooterLinkLocator);
    }


    // ---- STAY CONNECTED COLUMN
    public WebElement getFacebookFooterElement() {
        return BaseTest.driver.findElement(BaseElements.faceBookFooterLinkLocator);
    }

    public WebElement getTwitterFooterElement() {
        return BaseTest.driver.findElement(BaseElements.twitterFooterLinkLocator);
    }


    // ---- ABOUT EBAY COLUMN
    public WebElement getAboutEbayFooterElement() {
        return BaseTest.driver.findElement(BaseElements.aboutEbayFooterLinkLocator);
    }

    public WebElement getCompanyInfoFooterElement() {
        return BaseTest.driver.findElement(BaseElements.companyInfoFooterLinkLocator);
    }

    public WebElement getNewsFooterElement() {
        return BaseTest.driver.findElement(BaseElements.newsFooterLinkLocator);
    }

    public WebElement getInvestorsFooterElement() {
        return BaseTest.driver.findElement(BaseElements.investorsFooterLinkLocator);
    }

    public WebElement getCareersFooterElement() {
        return BaseTest.driver.findElement(BaseElements.careersFooterLinkLocator);
    }

    public WebElement getDiversityInclusionFooterElement() {
        return BaseTest.driver.findElement(BaseElements.diversityFooterLinkLocator);
    }

    public WebElement getGlobalImpactFooterElement() {
        return BaseTest.driver.findElement(BaseElements.globalImpactFooterLinkLocator);
    }

    public WebElement getGovernmentRelationsFooterElement() {
        return BaseTest.driver.findElement(BaseElements.governmentRelFooterLinkLocator);
    }

    public WebElement getAdvertiseWithUsFooterElement() {
        return BaseTest.driver.findElement(BaseElements.advertiseWithUsFooterLinkLocator);
    }

    public WebElement getPoliciesFooterElement() {
        return BaseTest.driver.findElement(BaseElements.policiesFooterLinkLocator);
    }

    public WebElement getVEROProgramFooterElement() {
        return BaseTest.driver.findElement(BaseElements.veroFooterLinkLocator);
    }

    public WebElement getECLLicenseFooterElement() {
        return BaseTest.driver.findElement(BaseElements.eclLicenseFooterLinkLocator);
    }

    // ---- HELP & CONTACT COLUMN
    public WebElement getHelpContactFooterElement() {
        return BaseTest.driver.findElement(BaseElements.helpContactFooterLinkLocator);
    }

    public WebElement getSellerCenterFooterElement() {
        return BaseTest.driver.findElement(BaseElements.sellerCenterFooterLinkLocator);
    }

    public WebElement getContactUsFooterElement() {
        return BaseTest.driver.findElement(BaseElements.contactUsFooterLinkLocator);
    }

    public WebElement getEbayReturnsFooterElement() {
        return BaseTest.driver.findElement(BaseElements.eBayReturnsFooterLinkLocator);
    }


    // ---- COMMUNITY COLUMN
    public WebElement getCommunityFooterElement() {
        return BaseTest.driver.findElement(BaseElements.communityFooterLinkLocator);
    }

    public WebElement getAnnouncementsFooterElement() {
        return BaseTest.driver.findElement(BaseElements.announcementsFooterLinkLocator);
    }

    public WebElement getEbayCommunityFooterElement() {
        return BaseTest.driver.findElement(BaseElements.eBayCommunityFooterLinkLocator);
    }

    public WebElement getEbayPodcastFooterElement() {
        return BaseTest.driver.findElement(BaseElements.ebayBusinessPodFooterLinkLocator);
    }


    // ---- LEGAL
    public WebElement getLegalElement() {
        return BaseTest.driver.findElement(BaseElements.footerLegalTextLocator);
    }
    public WebElement getAccessibilityLegalElement() {
        return BaseTest.driver.findElement(BaseElements.accessibilityLegalLinkLocator);
    }

    public WebElement getEULALegalElement() {
        return BaseTest.driver.findElement(BaseElements.eulaLegalLinkLocator);
    }

    public WebElement getPrivacyLegalElement() {
        return BaseTest.driver.findElement(BaseElements.privacyLegalLinkLocator);
    }

    public WebElement getCookiesLegalElement() {
        return BaseTest.driver.findElement(BaseElements.cookiesLegalLinkLocator);
    }

    public WebElement getDoNotSellPersonalInfoLegalElement() {
        return BaseTest.driver.findElement(BaseElements.doNotSellInfoLegalLinkLocator);
    }

    public WebElement getAdChoiceLegalElement() {
        return BaseTest.driver.findElement(BaseElements.adChoiceLegalLinkLocator);
    }





    public void navigateToSignInHeaderPage() {
        getSignInHeaderElement().click();
    }

    public void navigateToRegisterHeaderPage() {
        getRegisterHeaderElement().click();
    }

    public void navigateToDailyDealsHeaderPage() {
        getDailyDealsHeaderElement().click();
    }

    public void navigateToBrandOutletHeaderPage() {
        getBrandOutletHeaderElement().click();
    }

    public void navigateToHelpContactHeaderPage() {
        getHelpContactHeaderElement().click();
    }

    public void navigateToSellHeaderPage() {
        getSellHeaderElement().click();
    }

    public void navigateToWatchlistHeaderPage() {
        getWatchlistHeaderElement().click();
    }

    public void navigateToWatchlistSignInHeaderPage() {
        navigateToWatchlistHeaderPage();
        getWatchlistSignInHeaderElement().click();
    }
    public void navigateToMyEbayHeaderPage() {
        getMyEbayHeaderElement().click();
    }
    public void navigateToMyEbaySummaryHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbaySummaryHeaderElement().click();
    }

    public void navigateToMyEbayRecentlyViewedHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbayRecentlyViewedHeaderElement().click();
    }

    public void navigateToMyEbayBidsOffersHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbayBidsOffersHeaderElement().click();
    }

    public void navigateToMyEbayWatchListHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbayWatchListHeaderElement().click();
    }

    public void navigateToMyEbayPurchaseHistoryHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbayPurchaseHistoryHeaderElement().click();
    }

    public void navigateToMyEbayBuyAgainHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbayBuyAgainHeaderElement().click();
    }

    public void navigateToMyEbaySellingHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbaySellingHeaderElement().click();
    }

    public void navigateToMyEbaySavedSearchesHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbaySavedSearchesHeaderElement().click();
    }

    public void navigateToMyEbaySavedSellersHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbaySavedSellersHeaderElement().click();
    }

    public void navigateToMyEbayMyGarageHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbayMyGarageHeaderElement().click();
    }

    public void navigateToMyEbayMessagesHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbayMessagesHeaderElement().click();
    }

    public void navigateToMyEbayCollectionHeaderPage() {
        BaseTest.hoverElement(getMyEbayHeaderElement());
        getMyEbayCollectionHeaderElement().click();
    }

    public void navigateToNotificationsHeaderPage() {
        getNotificationsHeaderElement().click();
    }

    public void navigateToShoppingCartHeaderPage() {
        getShoppingCartHeaderElement().click();
    }

    //        FooterElement NAVIGATION
    // ---- BUY COLUMN
    public void navigateToBuyFooterPage() {
        getBuyFooterElement().click();
    }

    public void navigateToRegistrationFooterPage() {
        getRegistrationFooterElement().click();
    }

    public void navigateToMoneyBackFooterPage() {
        getMoneyBackFooterElement().click();
    }

    public void navigateToBiddingBuyingFooterPage() {
        getBiddingBuyingFooterElement().click();
    }

    public void navigateToStoresFooterPage() {
        getStoresFooterElement().click();
    }

    public void navigateToEbayForCharityFooterPage() {
        getEbayForCharityFooterElement().click();
    }

    public void navigateToCharityShopFooterPage() {
        getCharityShopFooterElement().click();
    }

    // ----

    public void navigateToSellFooterPage() {
        getSellFooterElement().click();
    }

    public void navigateToStartSellingFooterPage() {
        getStartSellingFooterElement().click();
    }

    public void navigateToHowToSellFooterPage() {
        getHowToSellFooterElement().click();
    }

    public void navigateToBusinessSellersFooterPage() {
        getBusinessSellersFooterElement().click();
    }

    public void navigateToAffiliatesFooterPage() {
        getAffiliatesFooterElement().click();
    }


    // ---- TOOLS AND APPS COLUMN
    public void navigateToDevelopersFooterPage() {
        getDevelopersFooterElement().click();
    }

    public void navigateToSecurityCenterFooterPage() {
        getSecurityCenterFooterElement().click();
    }

    public void navigateToSiteMapFooterPage() {
        getSiteMapFooterElement().click();
    }


    // ---- STAY CONNECTED COLUMN
    public void navigateToFacebookFooterPage() {
        getFacebookFooterElement().click();
    }

    public void navigateToTwitterFooterPage() {
        getTwitterFooterElement().click();
    }


    // ---- ABOUT EBAY COLUMN
    public void navigateToAboutEbayFooterPage() {
        getAboutEbayFooterElement().click();
    }

    public void navigateToCompanyInfoFooterPage() {
        getCompanyInfoFooterElement().click();
    }

    public void navigateToNewsFooterPage() {
        getNewsFooterElement().click();
    }

    public void navigateToInvestorsFooterPage() {
        getInvestorsFooterElement().click();
    }

    public void navigateToCareersFooterPage() {
        getCareersFooterElement().click();
    }

    public void navigateToDiversityInclusionFooterPage() {
        getDiversityInclusionFooterElement().click();
    }

    public void navigateToGlobalImpactFooterPage() {
        getGlobalImpactFooterElement().click();
    }

    public void navigateToGovernmentRelationsFooterPage() {
        getGovernmentRelationsFooterElement().click();
    }

    public void navigateToAdvertiseWithUsFooterPage() {
        getAdvertiseWithUsFooterElement().click();
    }

    public void navigateToPoliciesFooterPage() {
        getPoliciesFooterElement().click();
    }

    public void navigateToVEROProgramFooterPage() {
        getVEROProgramFooterElement().click();
    }

    public void navigateToECLLicenseFooterPage() {
        getECLLicenseFooterElement().click();
    }

    // ---- HELP & CONTACT COLUMN
    public void navigateToHelpContactFooterPage() {
        getHelpContactFooterElement().click();
    }

    public void navigateToSellerCenterFooterPage() {
        getSellerCenterFooterElement().click();
    }

    public void navigateToContactUsFooterPage() {
        getContactUsFooterElement().click();
    }

    public void navigateToEbayReturnsFooterPage() {
        getEbayReturnsFooterElement().click();
    }


    // ---- COMMUNITY COLUMN
    public void navigateToCommunityFooterPage() {
        getCommunityFooterElement().click();
    }

    public void navigateToAnnouncementsFooterPage() {
        getAnnouncementsFooterElement().click();
    }

    public void navigateToEbayCommunityFooterPage() {
        getEbayCommunityFooterElement().click();
    }

    public void navigateToEbayPodcastFooterPage() {
        getEbayPodcastFooterElement().click();
    }


    // ---- LEGAL
    public void navigateToLegalPage() {
        getLegalElement().click();
    }
    public void navigateToAccessibilityLegalPage() {
        getAccessibilityLegalElement().click();
    }

    public void navigateToEULALegalPage() {
        getEULALegalElement().click();
    }

    public void navigateToPrivacyLegalPage() {
        getPrivacyLegalElement().click();
    }

    public void navigateToCookiesLegalPage() {
        getCookiesLegalElement().click();
    }

    public void navigateToDoNotSellPersonalInfoLegalPage() {
        getDoNotSellPersonalInfoLegalElement().click();
    }

    public void navigateToAdChoiceLegalPage() {
        getAdChoiceLegalElement().click();
    }


    public String getInformation(WebElement element, AttributeType type){
        String info;
        switch(type){
            case TEXT:
                info = element.getText();
                break;
            case HREF:
                info = element.getAttribute("href");
                break;
            case TAG:
                info = element.getTagName();
                break;
            case SRC:
                info = element.getAttribute("src");
                break;
            case NAME:
                info = element.getAttribute("name");
                break;
            case VALUE:
                info = element.getAttribute("value");
                break;
            case ID:
                info = element.getAttribute("id");
                break;
            default:
                info = null;
        }
        if(info == null){
            Assert.fail(String.format("Unable to get information. Element does not contain Attribute: %s",type));
        }
        return info;
    }


}
