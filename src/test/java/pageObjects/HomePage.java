package pageObjects;

import drivers.DriversFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends DriversFactory {


    //WebElements

    @FindBy(xpath = "//span[@class=\"search-text\"]")
    WebElement SearchBtn;

    @FindBy(xpath = "//input[@id=\"txtWord\"]")
    WebElement textBox;

    @FindBy(xpath = "//input[@value=\"Search\"]")
    WebElement SEARCHBtn;

    @FindBy(xpath = "//a[contains(text(), 'Read more')]")
    List<WebElement> ReadMorebtn;

    @FindBy(xpath = "//div[@class=\"row search-result-item\"]")
    List<WebElement>ResultsList;







    //Action methods

    public void clickSearchbtn(){
        SearchBtn.click();
    }

    public void enterSearchCriteria(String searchItem){
        textBox.sendKeys(searchItem);
    }

    public String getSearchItem(){
      return   textBox.getText();
    }

    public void clickSEARCHbtn(){
        SEARCHBtn.click();
    }




}
