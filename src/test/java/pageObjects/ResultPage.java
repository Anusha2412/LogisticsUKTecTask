package pageObjects;

import Utilities.Helper;
import drivers.DriversFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends DriversFactory {


    //WebElements

    @FindBy(xpath = "//div[@class=\"col-xs-12\"]/h1")
    WebElement SearchResultsHeading;

    @FindBy(xpath = "//div[@class=\"media-listing search-results\"]//h2")
    WebElement SearchTitleHeading;

    @FindBy(xpath = "//div[@class=\"media-listing search-results\"]//h3")
    WebElement NumberOfResultsTitle;

    @FindBy(xpath = "//div[@class=\"checkbox\"]//label")
    List<WebElement> FilterOptions;

    @FindBy(xpath = "//p[contains(text(),'No results were found.')]")
    WebElement CommentTitle;








    //Actions

    public String getSearchHeading(){
        return SearchResultsHeading.getText();
    }

    public String getSearchTitle(){
        return SearchTitleHeading.getText();
    }

    public String getNoOfSearchResults(){
        return NumberOfResultsTitle.getText();
    }

    public void ClickAnyFilterOption(String Option) throws InterruptedException {

        for(WebElement individualOption :FilterOptions){
            Helper.ScrollDown();
            Thread.sleep(1000);
           String OptionName=  individualOption.getText();

           if(OptionName.equalsIgnoreCase(Option)){

               individualOption.click();
               break;
           }


        }

    }

    public String getComment(){
        return CommentTitle.getText();
    }




}
