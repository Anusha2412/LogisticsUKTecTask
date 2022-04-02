package Utilities;

import drivers.DriversFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Helper extends DriversFactory{

  /* // DriversFactory df = new DriversFactory();

    public void ScrollDown(WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("(“arguments[0].scrollInToView(); ele");
    }

   */

    public static void ScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", " ");
    }

    public String getRandomAlphanumeric(int x){
       return RandomStringUtils.randomAlphanumeric(5, 15);

    }
}
