package Utilities;

import drivers.DriversFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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
}
