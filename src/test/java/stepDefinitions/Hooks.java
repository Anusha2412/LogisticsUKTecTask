package stepDefinitions;

import cucumber.api.java.Before;
import drivers.DriversFactory;

public class Hooks {


    DriversFactory df = new DriversFactory();

    @Before
    public void setUpBrowser(){

        df.openBrowser();
        df.maxBrowser();
        df.openUrl("https://logistics.org.uk/");
        df.applyImplicitWait();
    }




     /*   @After
        public void tearDown(){
            df.closeBrowser();
        }

      */

}


