package stepDefinitions;

import Utilities.Helper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.DriversFactory;
import org.apache.logging.log4j.core.impl.ReusableLogEventFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.w3c.dom.ls.LSOutput;
import pageObjects.HomePage;
import pageObjects.ResultPage;

import static com.sun.tools.doclint.Entity.or;
import static javax.management.Query.or;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class Steps {
    HomePage hp = new HomePage();
    ResultPage rp =new ResultPage();
    Helper hpr = new Helper();


    @Given("^User is on Home page$")
    public void user_is_on_Home_page() throws InterruptedException {
        Thread.sleep(10000);

        String actual = hp.getCurrentUrl();
        System.out.println(actual);
        assertThat(actual, endsWith("org.uk/"));

    }

    @When("^User clicks search bar$")
    public void user_clicks_search_bar() {

        hp.clickSearchbtn();

    }

    @When("^User enters search item as \"([^\"]*)\" in the text-box and press enter or click search bar$")
    public void enters_search_item_as_in_the_text_box_and_press_enter_or_click_search_bar(String searchItem) throws InterruptedException {
        Thread.sleep(1000);
        hp.enterSearchCriteria(searchItem);
        hp.clickSEARCHbtn();
        Thread.sleep(1000);


    }

    @When("^User enter search item as \"([^\"]*)\"$")
    public void user_enter_search_item_as(String Training) throws InterruptedException {

        hp.enterSearchCriteria("Training");

        hp.clickSEARCHbtn();
        Thread.sleep(2000);

    }


    @Then("^User should be able to see all the related items\\.$")
    public void user_should_be_able_to_see_all_the_related_items() {

       String actual = rp.getSearchTitle();
        String expected= hp.getSearchItem();
      // String expected = "Training";
      //  String expected2 = "Cars";

       assertThat(actual, containsString(expected));


       System.out.println(rp.getNoOfSearchResults());

    }

    @When("^User select a filter options on right hand side$")
    public void user_select_a_filter_options_on_right_hand_side() throws InterruptedException {

        Thread.sleep(1000);
        rp.ClickAnyFilterOption("Events");

    }

    @Then("^User should see all the related items accordingly\\.$")
    public void user_should_see_all_the_related_items_accordingly() {

        String actual = rp.getSearchTitle();
        String expected = "Training";

        assertThat(actual, containsString(expected));

        System.out.println(rp.getNoOfSearchResults());
    }

}
