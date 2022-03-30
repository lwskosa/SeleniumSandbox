package main.java.aspiration.objects;

import org.openqa.selenium.By;

public interface SpendAndSaveElements {

    // PLAN PERKS LIST
    By planPerksListLocator = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li");


    By planBaseLocator = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[1]/div[1]/span");
    By planPlusLocator = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[1]/span");
    By planPlusMonthlyfeeLocator = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]/p[1]");
    By planPlusAnnualfeeLocator  = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]/p[2]");


    String planBaseLabelText = "ASPIRATION";
    String planPlusLabelText = "ASPIRATION PLUS";

    String planPlusMonthlyFeeLabelText = "$7.99/mo";
    String planPlusAnnualFeeLabelText = "$5.99/mo";


    String planPerkLine01LabelText = "APY on your savings with $1000/month spend, terms apply*";
    String planPerkLine02LabelText = "Cash back on Conscience Coalition purchases";
    String planPerkLine03LabelText = "Deposits won't fund fossil fuel exploration or production";
    String planPerkLine04LabelText = "Get paid up to 2 days early";
    String planPerkLine05LabelText = "$10 minimum opening deposit";
    String planPerkLine06LabelText = "55,000 free in-network ATMs";
    String planPerkLine07LabelText = "Option to plant a tree with every card swipe";
    String planPerkLine08LabelText = "Personal impact score to help you shop to match your values";
    String planPerkLine09LabelText = "Automatic offsets for the negative climate impact of driving your car with Planet Protection";
    String planPerkLine10LabelText = "One out-of-network ATM reimbursement monthly";
    String planPerkLine11LabelText = "Purchase Assurance provides coverage for items that are damaged or stolen within 90 days";

    String planPerkLine01AspirationBaseLabelText = "3.00%";
    String planPerkLine01AspirationPlusLabelText = "5.00%";
    String planPerkLine02AspirationBaseLabelText = "Up to 3-5%";
    String planPerkLine02AspirationPlusLabelText = "10%";

    String aspireBasePlanCheckmarkSRC = "https://images.ctfassets.net/ejg6grzpbbxj/7utCq7OpXxIYzMRgW6QGJl/f80647e2ed6f83958daa873e2beffacf/decorative-checkmark.png";
    String aspirePlusPlanCheckmarkSRC = "https://images.ctfassets.net/ejg6grzpbbxj/1a5bJjzix620gM0psm2SG6/17c0aa4dd4354bd942a6c2d1f1fe1368/aplus-checkmark.png";



    // Pattenr format for listed Perks
    String perkFormat = "//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[%d]/div[1]/div[%d]";

}
