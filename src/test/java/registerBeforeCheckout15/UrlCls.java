package registerBeforeCheckout15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UrlCls   {



    public void getUrl(WebDriver driver)
    {
        driver.get("https://www.automationexercise.com/");
    }


    public void singUpLogin(WebDriver driver, WebElement element)
    {
        element=driver.findElement(By.xpath("//a[@href='/login']"));
        element.click();
    }
    public void newUser(WebDriver driver, WebElement element, Actions actions)
    {
        actions=new Actions(driver);
        element=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        actions.click(element)
                .sendKeys("Metehan Polat")
                .sendKeys(Keys.TAB)
                .sendKeys("mmetehan"+Math.random()+"polat@gmail.com")
                .sendKeys(Keys.TAB)
                .perform();
        element=driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        element.click();

    }

    public void EAccountInformation(WebDriver driver, WebElement element, Actions actions, Select select) throws InterruptedException {
        actions=new Actions(driver);
            element=driver.findElement(By.xpath("//input[@id='id_gender1']"));
            actions.click(element)
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB).sendKeys("Mm"+Math.random()+".").perform();
            element=driver.findElement(By.xpath("//select[@id='days']"));
            select=new Select(element);
            select.selectByValue("5");
            Thread.sleep(1000);

            element=driver.findElement(By.xpath("//select[@id='months']"));

            select=new Select(element);
            select.selectByValue("12");
            Thread.sleep(1000);

            element=driver.findElement(By.xpath("//select[@id='years']"));
            select=new Select(element);
            select.selectByValue("1996");
        Thread.sleep(1000);

            element=driver.findElement(By.xpath("//input[@id='newsletter']"));
            element.click();

            element=driver.findElement(By.xpath("//input[@id='optin']"));
            element.click();
            Thread.sleep(3000);

            element=driver.findElement(By.xpath("//input[@data-qa='first_name']"));
            actions.click(element).sendKeys("Metehan").sendKeys(Keys.TAB).sendKeys("Polat").sendKeys(Keys.TAB).sendKeys("Poll").sendKeys(Keys.TAB)
                    .sendKeys("Sivas").sendKeys(Keys.TAB).sendKeys("Sivas").perform();
            Thread.sleep(1000);
            element=driver.findElement(By.xpath("//select[@name='country']"));
            select=new Select(element);
            select.selectByValue("Canada");
            element=driver.findElement(By.xpath("//input[@data-qa='state']"));
            actions.click(element).sendKeys("Sivas").sendKeys(Keys.TAB).sendKeys("Sivas").sendKeys(Keys.TAB).sendKeys("38110").sendKeys(Keys.TAB).
                    sendKeys("5383946352").perform();
            Thread.sleep(1000);
            element=driver.findElement(By.xpath("//button[@data-qa='create-account']"));
            element.click();
        }
            public void creacted(WebDriver driver,WebElement element)
            {
                element=driver.findElement(By.xpath("//*[text()='Account Created!']"));
                String e=element.getText();
                String ae="ACCOUNT CREATED!";
                Assert.assertEquals(ae,e);

                driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
            }
            public void logAndUser(WebElement element,WebDriver driver) throws InterruptedException {
                element=driver.findElement(By.partialLinkText("Logged "));
                String log=element.getText();

                Thread.sleep(4000);



                String kel="Logged in as Metehan Polat";

                Assert.assertEquals(kel,log);


            }

}