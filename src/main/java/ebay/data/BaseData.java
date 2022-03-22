package main.java.ebay.data;

import main.java.ebay.objects.BaseElements;
import org.testng.annotations.DataProvider;

import static main.java.ebay.objects.BaseElements.ebayNavBusinessPodFooterURL;

public class BaseData {

    @DataProvider
    public Object[][] verifyBaseNavigation(){
//       Workaround eBay's behavior...not elegant, but gets it done without having to create a new, almost identical Dataset...
//       Exception, not the rule :)
        Object [][] temp = verifyBaseHREFs();


        temp[56][1] = ebayNavBusinessPodFooterURL;
        temp[58][1] = BaseElements.eulaNavLegalURL;
        temp[59][1] = BaseElements.privacyNavLegalURL;
        temp[60][1] = BaseElements.cookiesNavLegalURL;

        return temp;
    }

    @DataProvider
    public Object[][] verifyBaseHREFs(){
        return new Object[][]{
//                       mainBy,                       expectedHREF,                 isHidden,clickToShow, parentBy
// -------- HEADER
                // ---- MAIN
                {BaseElements.signInLinkLocator,      BaseElements.signInURLNoCaptcha,    false,     false,      null },
                {BaseElements.registerLinkLocator,    BaseElements.registerHeaderURL,     false,     false,      null },
                {BaseElements.dailyDealsLinkLocator,  BaseElements.dailyDealsHeaderURL,   false,     false,      null },
                {BaseElements.helpContactLinkLocator, BaseElements.helpContactHeaderURL,  false,     false,      null },
                {BaseElements.brandOutletLinkLocator, BaseElements.brandOutletHeaderURL,  false,     false,      null },
                {BaseElements.sellLinkLocator,        BaseElements.sellHeaderURL,         false,     false,      null },
                // ---- Watchlist
                {BaseElements.watchListSignInLinkLocator,    BaseElements.watchListHeaderURL,        true,      true,         BaseElements.watchListLinkLocator },
//                       mainBy,                                  expectedHREF,         isHidden  clickToShow     parentBy
                // ---- MY EBAY
                {BaseElements.myEbayLinkLocator,             BaseElements.myEbayHeaderURL,             false,     false,      null  },
                {BaseElements.myESummaryLinkLocator,         BaseElements.myESummaryHeaderURL,         true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myERecentsLinkLocator,         BaseElements.myERecentsHeaderURL,         true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEBidsOffersLinkLocator,      BaseElements.myEBidsOffersHeaderURL,      true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEWatchlistLinkLocator,       BaseElements.myEWatchlistHeaderURL,       true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEPurchaseHistoryLinkLocator, BaseElements.myEPurchaseHistoryHeaderURL, true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEBuyAgainLinkLocator,        BaseElements.myEBuyAgainHeaderURL,        true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myESellingLinkLocator,         BaseElements.myESellingHeaderURL,         true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myESavedSearchesLinkLocator,   BaseElements.myESavedSearchesHeaderURL,   true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myESavedSellersLinkLocator,    BaseElements.myESavedSellersHeaderURL,    true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEMyGarageLinkLocator,        BaseElements.myEMyGarageHeaderURL,        true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEMessagesLinkLocator,        BaseElements.myEMessagesHeaderURL,        true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myECollectionLinkLocator,      BaseElements.myECollectionHeaderURL,      true,      false,      BaseElements.myEbayLinkLocator  },
// -------- FOOTER
                // ---- BUY COLUMN
                {BaseElements.buyFooterLinkLocator,          BaseElements.buyFooterURL,          false,      false,      null  },
                {BaseElements.registrationFooterLinkLocator, BaseElements.registrationFooterURL, false,      false,      null  },
                {BaseElements.moneyBackFooterLinkLocator,    BaseElements.moneyBackFooterURL,    false,      false,      null  },
                {BaseElements.bidBuyHelpFooterLinkLocator,   BaseElements.bidBuyHelpFooterURL,   false,      false,      null  },
                {BaseElements.storesFooterLinkLocator,       BaseElements.storesFooterURL,       false,      false,      null  },
                {BaseElements.forCharityFooterLinkLocator,   BaseElements.forCharityFooterURL,   false,      false,      null  },
                {BaseElements.charityShopFooterLinkLocator,  BaseElements.charityShopFooterURL,  false,      false,      null  },
                // ---- SELL COLUMN
                {BaseElements.sellFooterLinkLocator,         BaseElements.sellFooterURL,         false,      false,      null  },
                {BaseElements.startSellingFooterLinkLocator, BaseElements.startSellingFooterURL,         false,      false,      null  },
                {BaseElements.howTosellFooterLinkLocator,    BaseElements.howTosellFooterURL,    false,      false,      null  },
                {BaseElements.businessSellFooterLinkLocator, BaseElements.businesSellFooterURL,  false,      false,      null  },
                {BaseElements.affiliatesFooterLinkLocator,   BaseElements.affiliatesFooterURL,   false,      false,      null  },
                // ---- TOOLS & APPS COLUMN
                {BaseElements.developersFooterLinkLocator,   BaseElements.developersFooterURL,   false,      false,      null  },
                {BaseElements.secuCenterFooterLinkLocator,   BaseElements.secuCenterFooterURL,   false,      false,      null  },
                {BaseElements.siteMapFooterLinkLocator,      BaseElements.siteMapFooterURL,      false,      false,      null  },
                // ---- STAY CONNECTED COLUMN
                {BaseElements.faceBookFooterLinkLocator,     BaseElements.facebookFooterURL,     false,      false,      null  },
                {BaseElements.twitterFooterLinkLocator,      BaseElements.twitterFooterURL,      false,      false,      null  },
                // ---- ABOUT EBAY COLUMN
                {BaseElements.aboutEbayFooterLinkLocator,       BaseElements.aboutEbayFooterURL,      false,      false,      null  },
                {BaseElements.companyInfoFooterLinkLocator,     BaseElements.companyInfoFooterURL,    false,      false,      null  },
                {BaseElements.newsFooterLinkLocator,            BaseElements.newsFooterURL,           false,      false,      null  },
                {BaseElements.investorsFooterLinkLocator,       BaseElements.investorsFooterURL,      false,      false,      null  },
                {BaseElements.careersFooterLinkLocator,         BaseElements.careersFooterURL,        false,      false,      null  },
                {BaseElements.diversityFooterLinkLocator,       BaseElements.diversityFooterURL,      false,      false,      null  },
                {BaseElements.globalImpactFooterLinkLocator,    BaseElements.globalImpactFooterURL,   false,      false,      null  },
                {BaseElements.governmentRelFooterLinkLocator,   BaseElements.governmentRelFooterURL,  false,      false,      null  },
                {BaseElements.advertiseWithUsFooterLinkLocator, BaseElements.advertiseWithUsFooterURL,false,      false,      null  },
                {BaseElements.policiesFooterLinkLocator,        BaseElements.policiesFooterURL,       false,      false,      null  },
                {BaseElements.veroFooterLinkLocator,            BaseElements.veroFooterURL,           false,      false,      null  },
                {BaseElements.eclLicenseFooterLinkLocator,      BaseElements.eCLLicenseFooterURL,     false,      false,      null  },
                // ---- HELP & CONTACT COLUMN
                {BaseElements.helpContactFooterLinkLocator,     BaseElements.helpContactFooterURL,    false,      false,      null  },
                {BaseElements.sellerCenterFooterLinkLocator,    BaseElements.sellerCenterFooterURL,   false,      false,      null  },
                {BaseElements.contactUsFooterLinkLocator,       BaseElements.contactUsFooterURL,      false,      false,      null  },
                {BaseElements.eBayReturnsFooterLinkLocator,     BaseElements.eBayReturnsFooterURL,    false,      false,      null  },
                // ---- COMMUNITY COLUMN
                {BaseElements.communityFooterLinkLocator,      BaseElements.communityFooterURL,       false,      false,      null  },
                {BaseElements.announcementsFooterLinkLocator,  BaseElements.announcementsFooterURL,   false,      false,      null  },
                {BaseElements.eBayCommunityFooterLinkLocator,  BaseElements.eBayCommunityFooterURL,       false,      false,      null  },
                {BaseElements.ebayBusinessPodFooterLinkLocator,BaseElements.ebayHREFBusinessPodFooterURL, false,      false,      null  },
                // ---- LEGAL SECTION
                {BaseElements.accessibilityLegalLinkLocator,   BaseElements.accessibilityLegalURL, false,      false,      null  },
                {BaseElements.eulaLegalLinkLocator,            BaseElements.eulaHREFLegalURL,          false,      false,      null  },
                {BaseElements.privacyLegalLinkLocator,         BaseElements.privacyHREFLegalURL,       false,      false,      null  },
                {BaseElements.cookiesLegalLinkLocator,         BaseElements.cookiesHREFLegalURL,       false,      false,      null  },
                {BaseElements.doNotSellInfoLegalLinkLocator,   BaseElements.doNotSellInfoLegalURL, false,      false,      null  },
                {BaseElements.adChoiceLegalLinkLocator,        BaseElements.adChoiceLegalURL,      false,      false,      null  }
        };
    }
    @DataProvider
    public Object[][] verifyBaseLabelTexts(){
        return new Object[][]{
//                       mainBy,                       expectedHREF,                 isHidden,clickToShow, parentBy
// -------- HEADER
                // ---- MAIN
                {BaseElements.signInLinkLocator,      BaseElements.signInHeaderLabelText,       false,     false,      null },
                {BaseElements.registerLinkLocator,    BaseElements.registerHeaderLabelText,     false,     false,      null },
                {BaseElements.dailyDealsLinkLocator,  BaseElements.dailyDealsHeaderLabelText,   false,     false,      null },
                {BaseElements.brandOutletLinkLocator, BaseElements.brandOutletHeaderLabelText,  false,     false,      null },
                {BaseElements.helpContactLinkLocator, BaseElements.helpContactHeaderLabelText,  false,     false,      null },
                {BaseElements.sellLinkLocator,        BaseElements.sellHeaderLabelText,         false,     false,      null },
                // ---- Watchlist
                {BaseElements.watchListLinkLocator,   BaseElements.watchListHeaderLabelText,            true,      true,         BaseElements.watchListLinkLocator },
                {BaseElements.watchListSignInLinkLocator,    BaseElements.watchListSignInHeaderLabelText,true,      true,         BaseElements.watchListLinkLocator },
//                       mainBy,                                  expectedHREF,                            isHidden  clickToShow     parentBy
                // ---- MY EBAY
                {BaseElements.myEbayLinkLocator,             BaseElements.myEbayHeaderLabelText,             false,     false,      null  },
                {BaseElements.myESummaryLinkLocator,         BaseElements.myESummaryHeaderLabelText,         true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myERecentsLinkLocator,         BaseElements.myERecentsHeaderLabelText,         true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEBidsOffersLinkLocator,      BaseElements.myEBidsOffersHeaderLabelText,      true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEWatchlistLinkLocator,       BaseElements.myEWatchlistHeaderLabelText,       true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEPurchaseHistoryLinkLocator, BaseElements.myEPurchaseHistoryHeaderLabelText, true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEBuyAgainLinkLocator,        BaseElements.myEBuyAgainHeaderLabelText,        true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myESellingLinkLocator,         BaseElements.myESellingHeaderLabelText,         true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myESavedSearchesLinkLocator,   BaseElements.myESavedSearchesHeaderLabelText,   true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myESavedSellersLinkLocator,    BaseElements.myESavedSellersHeaderLabelText,    true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEMyGarageLinkLocator,        BaseElements.myEMyGarageHeaderLabelText,        true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myEMessagesLinkLocator,        BaseElements.myEMessagesHeaderLabelText,        true,      false,      BaseElements.myEbayLinkLocator  },
                {BaseElements.myECollectionLinkLocator,      BaseElements.myECollectionHeaderLabelText,      true,      false,      BaseElements.myEbayLinkLocator  },
// -------- FOOTER
                // ---- BUY COLUMN
                {BaseElements.buyFooterLinkLocator,          BaseElements.buyFooterLabelText,          false,      false,      null  },
                {BaseElements.registrationFooterLinkLocator, BaseElements.registrationFooterLabelText, false,      false,      null  },
                {BaseElements.moneyBackFooterLinkLocator,    BaseElements.moneyBackFooterLabelText,    false,      false,      null  },
                {BaseElements.bidBuyHelpFooterLinkLocator,   BaseElements.bidBuyHelpFooterLabelText,   false,      false,      null  },
                {BaseElements.storesFooterLinkLocator,       BaseElements.storesFooterLabelText,       false,      false,      null  },
                {BaseElements.forCharityFooterLinkLocator,   BaseElements.forCharityFooterLabelText,   false,      false,      null  },
                {BaseElements.charityShopFooterLinkLocator,  BaseElements.charityShopFooterLabelText,  false,      false,      null  },
                // ---- SELL COLUMN
                {BaseElements.sellFooterLinkLocator,         BaseElements.sellFooterLabelText,         false,      false,      null  },
                {BaseElements.startSellingFooterLinkLocator, BaseElements.startSellFooterLabelText,         false,      false,      null  },
                {BaseElements.howTosellFooterLinkLocator,    BaseElements.howTosellFooterLabelText,    false,      false,      null  },
                {BaseElements.businessSellFooterLinkLocator,  BaseElements.businesSellFooterLabelText,  false,      false,      null  },
                {BaseElements.affiliatesFooterLinkLocator,   BaseElements.affiliatesFooterLabelText,   false,      false,      null  },
                // ---- TOOLS & APPS COLUMN
                {BaseElements.toolsAppsFooterLinkLocator,    BaseElements.toolsAppsFooterLabelText,    false,      false,      null  },
                {BaseElements.developersFooterLinkLocator,   BaseElements.developersFooterLabelText,   false,      false,      null  },
                {BaseElements.secuCenterFooterLinkLocator,   BaseElements.secuCenterFooterLabelText,   false,      false,      null  },
                {BaseElements.siteMapFooterLinkLocator,      BaseElements.siteMapFooterLabelText,      false,      false,      null  },
                // ---- STAY CONNECTED COLUMN
                {BaseElements.stayConnectedFooterLinkLocator,BaseElements.stayConnectedFooterLabelText,false,      false,      null  },
                {BaseElements.faceBookFooterLinkLocator,     BaseElements.facebookFooterLabelText,     false,      false,      null  },
                {BaseElements.twitterFooterLinkLocator,      BaseElements.twitterFooterLabelText,      false,      false,      null  },
                // ---- ABOUT EBAY COLUMN
                {BaseElements.aboutEbayFooterLinkLocator,       BaseElements.aboutEbayFooterLabelText,      false,      false,      null  },
                {BaseElements.companyInfoFooterLinkLocator,     BaseElements.companyInfoFooterLabelText,    false,      false,      null  },
                {BaseElements.newsFooterLinkLocator,            BaseElements.newsFooterLabelText,           false,      false,      null  },
                {BaseElements.investorsFooterLinkLocator,       BaseElements.investorsFooterLabelText,      false,      false,      null  },
                {BaseElements.careersFooterLinkLocator,         BaseElements.careersFooterLabelText,        false,      false,      null  },
                {BaseElements.diversityFooterLinkLocator,       BaseElements.diversityFooterLabelText,      false,      false,      null  },
                {BaseElements.globalImpactFooterLinkLocator,    BaseElements.globalImpactFooterLabelText,   false,      false,      null  },
                {BaseElements.governmentRelFooterLinkLocator,   BaseElements.governmentRelFooterLabelText,  false,      false,      null  },
                {BaseElements.advertiseWithUsFooterLinkLocator, BaseElements.advertiseWithUsFooterLabelText,false,      false,      null  },
                {BaseElements.policiesFooterLinkLocator,        BaseElements.policiesFooterLabelText,       false,      false,      null  },
                {BaseElements.veroFooterLinkLocator,            BaseElements.veroFooterLabelText,           false,      false,      null  },
                {BaseElements.eclLicenseFooterLinkLocator,      BaseElements.eCLLicenseFooterLabelText,     false,      false,      null  },
                // ---- HELP & CONTACT COLUMN
                {BaseElements.helpContactFooterLinkLocator,     BaseElements.helpContactFooterLabelText,   false,      false,      null  },
                {BaseElements.sellerCenterFooterLinkLocator,    BaseElements.sellerCenterFooterLabelText,  false,      false,      null  },
                {BaseElements.contactUsFooterLinkLocator,       BaseElements.contactUsFooterLabelText,     false,      false,      null  },
                {BaseElements.eBayReturnsFooterLinkLocator,     BaseElements.eBayReturnsFooterLabelText,   false,      false,      null  },
                // ---- COMMUNITY COLUMN
                {BaseElements.communityFooterLinkLocator,      BaseElements.communityFooterLabelText,       false,      false,      null  },
                {BaseElements.announcementsFooterLinkLocator,  BaseElements.announcementsFooterLabelText,   false,      false,      null  },
                {BaseElements.eBayCommunityFooterLinkLocator,  BaseElements.eBayCommunityFooterLabelText,   false,      false,      null  },
                {BaseElements.ebayBusinessPodFooterLinkLocator,BaseElements.ebayBusinessPodFooterLabelText, false,      false,      null  },
                // ---- LEGAL SECTION
                {BaseElements.footerLegalTextLocator,          BaseElements.LegalLabelText,              false,      false,      null  },
                {BaseElements.accessibilityLegalLinkLocator,   BaseElements.accessibilityLegalLabelText, false,      false,      null  },
                {BaseElements.eulaLegalLinkLocator,            BaseElements.eulaLegalLabelText,          false,      false,      null  },
                {BaseElements.privacyLegalLinkLocator,         BaseElements.privacyLegalLabelText,       false,      false,      null  },
                {BaseElements.cookiesLegalLinkLocator,         BaseElements.cookiesLegalLabelText,       false,      false,      null  },
                {BaseElements.doNotSellInfoLegalLinkLocator,   BaseElements.doNotSellInfoLegalLabelText, false,      false,      null  },
                {BaseElements.adChoiceLegalLinkLocator,        BaseElements.adChoiceLegalLabelText,      false,      false,      null  }
        };
    }
}
