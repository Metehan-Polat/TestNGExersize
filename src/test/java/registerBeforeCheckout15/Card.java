package registerBeforeCheckout15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Card {

    public void cart(WebDriver driver, WebElement element, Actions actions)
    {
        element=driver.findElement(By.xpath("//input[@name='name_on_card']"));
        actions=new Actions(driver);
        actions.click(element).sendKeys("Metehan Polat").sendKeys(Keys.TAB).sendKeys("5348587987")
                .sendKeys(Keys.TAB).sendKeys("443").sendKeys(Keys.TAB).sendKeys("12").sendKeys(Keys.TAB)
                .sendKeys("1196").perform();


    }
    public void payCon(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
}
