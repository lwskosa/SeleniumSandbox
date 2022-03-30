package main.java.aspiration.data;

import main.java.aspiration.objects.SpendAndSaveElements;
import org.testng.annotations.DataProvider;

public class SpendAndSaveData {

    @DataProvider
    public Object[][] verifyPerkLabels() {

        return new Object[][]{
                {1, 1, SpendAndSaveElements.planPerkLine01LabelText, false,true},
                {2, 1, SpendAndSaveElements.planPerkLine02LabelText, false,true},
                {3, 1, SpendAndSaveElements.planPerkLine03LabelText, false,true},
                {4, 1, SpendAndSaveElements.planPerkLine04LabelText, false,true},
                {5, 1, SpendAndSaveElements.planPerkLine05LabelText, false,true},
                {6, 1, SpendAndSaveElements.planPerkLine06LabelText, false,true},
                {7, 1, SpendAndSaveElements.planPerkLine07LabelText, false,true},
                {8, 1, SpendAndSaveElements.planPerkLine08LabelText, false,true},
                {9, 1, SpendAndSaveElements.planPerkLine09LabelText, false,true},
                {10,1, SpendAndSaveElements.planPerkLine10LabelText, false,true},
                {11,1, SpendAndSaveElements.planPerkLine11LabelText, false,true},

                {1, 2, SpendAndSaveElements.planPerkLine01AspirationBaseLabelText, false,true},
                {2, 2, SpendAndSaveElements.planPerkLine02AspirationBaseLabelText, false,true},
                {3, 2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,true},
                {4, 2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,true},
                {5, 2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,true},
                {6, 2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,true},
                {7, 2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,true},
                {8, 2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,true},
                {9, 2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,false },
                {10,2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,false },
                {11,2, SpendAndSaveElements.aspireBasePlanCheckmarkSRC, true,false },

                {1, 3, SpendAndSaveElements.planPerkLine01AspirationPlusLabelText,  false,true},
                {2, 3, SpendAndSaveElements.planPerkLine02AspirationPlusLabelText,  false,true},
                {3, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,             true, true},
                {4, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,             true, true},
                {5, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,             true, true},
                {6, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,             true, true},
                {7, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,             true, true},
                {8, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,             true, true},
                {9, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,             true, true},
                {10, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,            true, true},
                {11, 3, SpendAndSaveElements.aspirePlusPlanCheckmarkSRC,            true, true},
        };
    }



}// CLASS END
// //*[@id="__next"]/div/section[7]/div/div[1]/ul/li[8]/div[1]/div[2]
// //*[@id="__next"]/div/section[7]/div/div[1]/ul/li[8]/div[1]/div[2]