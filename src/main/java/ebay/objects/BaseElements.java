package main.java.ebay.objects;

import org.openqa.selenium.By;

public interface BaseElements {

// -------- HEADER ELEMENTS

    By signInLinkLocator     = By.xpath("//*[@id=\"gh-ug\"]/a");
    By registerLinkLocator   = By.xpath("//*[@id=\"gh-ug-flex\"]/a");
    By dailyDealsLinkLocator = By.xpath("//*[@id=\"gh-p-1\"]/a");
    By brandOutletLinkLocator= By.xpath("//*[@id=\"gh-p-4\"]/a");
    By helpContactLinkLocator= By.xpath("//*[@id=\"gh-p-3\"]/a");
    By sellLinkLocator       = By.xpath("//*[@id=\"gh-p-2\"]/a");
    By watchListLinkLocator  = By.xpath("//*[@id=\"gh-wl-click\"]/div/a[1]");
    By watchListSignInLinkLocator  = By.xpath("//*[@id=\"gh-wl-click-body\"]/div/div/div/a");
    By myEbayLinkLocator                = By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]");
        By myESummaryLinkLocator        = By.xpath("//*[@id=\"gh-ul-nav\"]/li[1]/a");
        By myERecentsLinkLocator        = By.xpath("//*[@id=\"gh-ul-nav\"]/li[2]/a");
        By myEBidsOffersLinkLocator     = By.xpath("//*[@id=\"gh-ul-nav\"]/li[3]/a");
        By myEWatchlistLinkLocator      = By.xpath("//*[@id=\"gh-ul-nav\"]/li[4]/a");
        By myEPurchaseHistoryLinkLocator= By.xpath("//*[@id=\"gh-ul-nav\"]/li[5]/a");
        By myEBuyAgainLinkLocator       = By.xpath("//*[@id=\"gh-ul-nav\"]/li[6]/a");
        By myESellingLinkLocator        = By.xpath("//*[@id=\"gh-ul-nav\"]/li[7]/a");
        By myESavedSearchesLinkLocator  = By.xpath("//*[@id=\"gh-ul-nav\"]/li[8]/a");
        By myESavedSellersLinkLocator   = By.xpath("//*[@id=\"gh-ul-nav\"]/li[9]/a");
        By myEMyGarageLinkLocator       = By.xpath("//*[@id=\"gh-ul-nav\"]/li[10]/a");
        By myEMessagesLinkLocator       = By.xpath("//*[@id=\"gh-ul-nav\"]/li[11]/a");
        By myECollectionLinkLocator     = By.xpath("//*[@id=\"gh-ul-nav\"]/li[12]/a");
    By notificationButton = By.id("gh-eb-Alerts");
    By shoppingCartButton = By.id("gh-gh-minicart-hover-i");

//      FOOTER ELEMENTS
    // ---- BUY COLUMN
    By buyFooterLinkLocator         = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/h3/a");
    By registrationFooterLinkLocator= By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[2]/a");
    By moneyBackFooterLinkLocator   = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[3]/a");
    By bidBuyHelpFooterLinkLocator  = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[4]/a");
    By storesFooterLinkLocator      = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[5]/a");
    By forCharityFooterLinkLocator  = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[6]/a");
    By charityShopFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[7]/a");
    // ---- SELL COLUMN
    By sellFooterLinkLocator         = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[1]/h3/a");
    By startSellingFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[2]/a");
    By howTosellFooterLinkLocator    = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[3]/a");
    By businessSellFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[4]/a");
    By affiliatesFooterLinkLocator   = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[5]/a");
    // ---- TOOLS & APPS COLUMN
    By toolsAppsFooterLinkLocator    = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[6]/h3");
    By developersFooterLinkLocator   = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[7]/a");
    By secuCenterFooterLinkLocator   = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[8]/a");
    By siteMapFooterLinkLocator      = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[9]/a");
    // ---- STAY CONNECTED COLUMN
    By stayConnectedFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[1]/h3");
    By faceBookFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[2]/a");
    By twitterFooterLinkLocator  = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[3]/a");
    // ---- ABOUT EBAY COLUMN
    By aboutEbayFooterLinkLocator     = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[1]/h3/a");
    By companyInfoFooterLinkLocator   = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[2]/a");
    By newsFooterLinkLocator          = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[3]/a");
    By investorsFooterLinkLocator     = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[4]/a");
    By careersFooterLinkLocator       = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[5]/a");
    By diversityFooterLinkLocator     = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[6]/a");
    By globalImpactFooterLinkLocator  = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[7]/a");
    By governmentRelFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[8]/a");
    By advertiseWithUsFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[9]/a");
    By policiesFooterLinkLocator      = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[10]/a");
    By veroFooterLinkLocator          = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[11]/a");
    By eclLicenseFooterLinkLocator    = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[12]/a");
    // ---- HELP AND CONTACT COLUMN
    By helpContactFooterLinkLocator  = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[1]/h3/a");
    By sellerCenterFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[2]/a");
    By contactUsFooterLinkLocator    = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[3]/a");
    By eBayReturnsFooterLinkLocator  = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[4]/a");
    // ---- COMMUNITY COLUMN
    By communityFooterLinkLocator       = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[5]/h3/a");
    By announcementsFooterLinkLocator   = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[6]/a");
    By eBayCommunityFooterLinkLocator   = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[7]/a");
    By ebayBusinessPodFooterLinkLocator = By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[8]/a");
    // ---- LEGAL
    By footerLegalTextLocator =  By.xpath("//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]");
    By accessibilityLegalLinkLocator = By.xpath("//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]/a[1]");
    By eulaLegalLinkLocator    = By.xpath("//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]/a[2]");
    By privacyLegalLinkLocator = By.xpath("//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]/a[3]");
    By cookiesLegalLinkLocator = By.xpath("//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]/a[4]");
    By doNotSellInfoLegalLinkLocator = By.xpath("//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]/a[5]");
    By adChoiceLegalLinkLocator      = By.id("gf-AdChoice");


//    LABELS
    // ---- HEADER
    String signInHeaderLabelText = "Sign in";
    String registerHeaderLabelText    = "register";
    String dailyDealsHeaderLabelText  = "Daily Deals";
    String brandOutletHeaderLabelText = "Brand Outlet";
    String helpContactHeaderLabelText = "Help & Contact";
    String sellHeaderLabelText        = "Sell";

    String watchListHeaderLabelText         = "Watchlist";
    String watchListSignInHeaderLabelText   = "sign in";

    String myEbayHeaderLabelText       = "My eBay";
        String myESummaryHeaderLabelText         = "Summary";
        String myERecentsHeaderLabelText         = "Recently Viewed";
        String myEBidsOffersHeaderLabelText      = "Bids/Offers";
        String myEWatchlistHeaderLabelText       = "Watchlist";
        String myEPurchaseHistoryHeaderLabelText = "Purchase History";
        String myEBuyAgainHeaderLabelText        = "Buy Again";
        String myESellingHeaderLabelText         = "Selling";
        String myESavedSearchesHeaderLabelText   = "Saved Searches";
        String myESavedSellersHeaderLabelText    = "Saved Sellers";
        String myEMyGarageHeaderLabelText        = "My Garage";
        String myEMessagesHeaderLabelText        = "Messages";
        String myECollectionHeaderLabelText      = "Collection beta";
    // ---- BUY COLUMN
    String buyFooterLabelText          = "Buy";
    String registrationFooterLabelText = "Registration";
    String moneyBackFooterLabelText    = "eBay Money Back Guarantee";
    String bidBuyHelpFooterLabelText   = "Bidding & buying help";
    String storesFooterLabelText       = "Stores";
    String forCharityFooterLabelText   = "eBay for Charity";
    String charityShopFooterLabelText  = "Charity Shop";
    // ---- SELL COLUMN
    String sellFooterLabelText  = "Sell";
    String startSellFooterLabelText   = "Start selling";
    String howTosellFooterLabelText   = "How to sell";
    String businesSellFooterLabelText = "Business sellers";
    String affiliatesFooterLabelText  = "Affiliates";
    // ---- TOOLS AND APPS COLUMN
    String toolsAppsFooterLabelText   = "Tools & apps";
    String developersFooterLabelText  = "Developers";
    String secuCenterFooterLabelText  = "Security center";
    String siteMapFooterLabelText     = "Site map";
    // ---- STAY CONNECTED COLUMN
    String stayConnectedFooterLabelText = "Stay connected";
    String facebookFooterLabelText = "Facebook";
    String twitterFooterLabelText  = "Twitter";
    // ---- ABOUT EBAY COLUMN
    String aboutEbayFooterLabelText = "About eBay";
    String companyInfoFooterLabelText    = "Company info";
    String newsFooterLabelText = "News";
    String investorsFooterLabelText = "Investors";
    String careersFooterLabelText   = "Careers";
    String diversityFooterLabelText = "Diversity & Inclusion";
    String globalImpactFooterLabelText    = "Global Impact";
    String governmentRelFooterLabelText   = "Government relations";
    String advertiseWithUsFooterLabelText = "Advertise with us";
    String policiesFooterLabelText        = "Policies";
    String veroFooterLabelText = "Verified Rights Owner (VeRO) Program";
    String eCLLicenseFooterLabelText     = "eCI Licenses";
    // ---- HELP AND CONTACT COLUMN
    String helpContactFooterLabelText  = "Help & Contact";
    String sellerCenterFooterLabelText = "Seller Center";
    String contactUsFooterLabelText    = "Contact Us";
    String eBayReturnsFooterLabelText  = "eBay Returns";
    // ---- COMMUNITY COLUMN
    String communityFooterLabelText       = "Community";
    String announcementsFooterLabelText   = "Announcements";
    String eBayCommunityFooterLabelText   = "eBay Community";
    String ebayBusinessPodFooterLabelText = "eBay for Business Podcast";
    // ---- LEGAL FOOTER
    String LegalLabelText = "Copyright © 1995-2022 eBay Inc. All Rights Reserved. Accessibility, User Agreement, Privacy, Cookies, Do not sell my personal information and AdChoice";
    String accessibilityLegalLabelText = "Accessibility";
    String doNotSellInfoLegalLabelText = "Do not sell my personal information";
    String eulaLegalLabelText     = "User Agreement";
    String privacyLegalLabelText  = "Privacy";
    String cookiesLegalLabelText  = "Cookies";
    String adChoiceLegalLabelText = "AdChoice";

    // ---- FOOTER LEGAL





//    URL HREFS
// ---- HEADER
    String signInURLNoCaptcha = "https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F";
    String registerHeaderURL    = "https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F";
    String dailyDealsHeaderURL  = "https://www.ebay.com/deals";
    String brandOutletHeaderURL = "https://www.ebay.com/b/Brand-Outlet/bn_7115532402";
    String helpContactHeaderURL = "https://ocsnext.ebay.com/ocs/home";
    String sellHeaderURL        = "https://www.ebay.com/sl/sell";
    String watchListHeaderURL   = "https://www.ebay.com/mye/myebay/watchlist";
    String myEbayHeaderURL      = "https://www.ebay.com/mys/home?source=GBH";
    String myESummaryHeaderURL         = "https://www.ebay.com/myb/Summary";
    String myERecentsHeaderURL         = "https://www.ebay.com/mye/myebay/rvi";
    String myEBidsOffersHeaderURL      = "https://www.ebay.com/myb/BidsOffers";
    String myEWatchlistHeaderURL       = "https://www.ebay.com/mye/myebay/watchlist";
    String myEPurchaseHistoryHeaderURL = "https://www.ebay.com/mye/myebay/purchase";
    String myEBuyAgainHeaderURL        = "https://www.ebay.com/mye/buyagain";
    String myESellingHeaderURL         = "https://www.ebay.com/mys/home?CurrentPage=MyeBayAllSelling&ssPageName=STRK:ME:LNLK:MESX&source=GBH";
    String myESavedSearchesHeaderURL   = "https://www.ebay.com/myb/SavedSearches";
    String myESavedSellersHeaderURL    = "https://www.ebay.com/myb/SavedSellers";
    String myEMyGarageHeaderURL        = "https://www.ebay.com/g/mygarage";
    String myEMessagesHeaderURL        = "https://mesg.ebay.com/mesgweb/ViewMessages/0";
    String myECollectionHeaderURL      = "https://www.ebay.com/collection/hub";
//    String myECollectionHeaderURL2     = "https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2Fcollection%2Fhub";

    // ---- BUY COLUMN
    String buyFooterURL = "https://www.ebay.com/n/all-categories";
    String registrationFooterURL = "https://www.ebay.com/help/account/default/ebay-account?id=4188";
    String moneyBackFooterURL    = "https://pages.ebay.com/ebay-money-back-guarantee/";
    String bidBuyHelpFooterURL   = "https://www.ebay.com/help/buying";
    String storesFooterURL       = "https://www.ebay.com/b/Stores-HUB/bn_7004224522";
    String forCharityFooterURL   = "https://www.charity.ebay.com/";
    String charityShopFooterURL  = "https://www.ebay.com/b/Charity/bn_7114598164";

    // ---- SELL COLUMN
    String sellFooterURL = "https://www.ebay.com/sl/sell";
    String startSellingFooterURL = "https://www.ebay.com/sl/sell";
    String howTosellFooterURL    = "https://pages.ebay.com/seller-center/get-started/selling-basics.html?utm_source=gf-learn-to-sell&utm_medium=onsite";
    String businesSellFooterURL  = "https://pages.ebay.com/seller-center/listing-and-marketing/seller-hub.html";
    String affiliatesFooterURL   = "https://partnernetwork.ebay.com/";
    // ---- TOOLS AND APPS COLUMN
    String developersFooterURL  = "https://developer.ebay.com/";
    String secuCenterFooterURL  = "https://pages.ebay.com/securitycenter/index.html";
    String siteMapFooterURL     = "https://pages.ebay.com/sitemap.html";

    // ---- STAY CONNECTED COLUMN
    String facebookFooterURL = "https://www.facebook.com/ebay/";
    String twitterFooterURL  = "https://twitter.com/eBay";

    // ---- ABOUT EBAY COLUMN
    String aboutEbayFooterURL      = "https://www.ebayinc.com/";
    String companyInfoFooterURL    = "https://www.ebayinc.com/company/";
    String newsFooterURL           = "https://www.ebayinc.com/stories/news/";
    String investorsFooterURL      = "https://investors.ebayinc.com/overview/default.aspx";
    String careersFooterURL        = "https://careers.ebayinc.com/";
    String diversityFooterURL      = "https://www.ebayinc.com/company/diversity-equity-inclusion/";
    String globalImpactFooterURL   = "https://www.ebayinc.com/impact/";
    String governmentRelFooterURL  = "https://www.ebaymainstreet.com/";
    String advertiseWithUsFooterURL= "https://www.ebayads.com/";
    String policiesFooterURL       = "https://www.ebay.com/help/policies/default/ebays-rules-policies?id=4205";
    String veroFooterURL           = "https://pages.ebay.com/seller-center/listing-and-marketing/verified-rights-owner-program.html#what-is-the-vero-program";
    String eCLLicenseFooterURL     = "https://pages.ebay.com/ebayCommerce/mtl.html";

    // ---- HELP AND CONTACT COLUMN
    String helpContactFooterURL  = "https://www.ebay.com/help/home";
    String sellerCenterFooterURL = "https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite";
    String contactUsFooterURL    = "https://www.ebay.com/help/home";
    String eBayReturnsFooterURL  = "https://pages.ebay.com/returns/";

    // ---- COMMUNITY COLUMN
    String eBayCommunityFooterURL   = "https://community.ebay.com/";
    String announcementsFooterURL   = "https://community.ebay.com/t5/Announcements/bg-p/Announcements";
    String communityFooterURL       = "https://community.ebay.com/";
    String ebayHREFBusinessPodFooterURL = "https://community.ebay.com/t5/Episode-Library/bg-p/eBay_Podcast_GHblog-board";
    String ebayNavBusinessPodFooterURL  = "https://community.ebay.com/t5/eBay-for-Business-Podcast/bg-p/eBay_Podcast_GHblog-board";

    // ---- LEGAL FOOTER
    String accessibilityLegalURL = "https://www.ebayinc.com/accessibility/";
    String doNotSellInfoLegalURL = "https://www.ebay.com/adchoice/ccpa";
    String eulaHREFLegalURL      = "https://pages.ebay.com/help/policies/user-agreement.html";
    String eulaNavLegalURL       = "https://www.ebay.com/help/policies/member-behaviour-policies/user-agreement?id=4259";
    String privacyHREFLegalURL   = "https://pages.ebay.com/help/policies/privacy-policy.html";
    String privacyNavLegalURL    = "https://www.ebay.com/help/policies/member-behaviour-policies/user-privacy-notice-privacy-policy?id=4260";
    String cookiesHREFLegalURL   = "https://pages.ebay.com/help/account/cookies-web-beacons.html";
    String cookiesNavLegalURL    = "https://www.ebay.com/help/policies/member-behaviour-policies/ebay-cookie-notice?id=4267";
    String adChoiceLegalURL      = "https://www.ebay.com/adchoice";

}
