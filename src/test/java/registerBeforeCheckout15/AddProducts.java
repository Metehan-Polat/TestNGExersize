package registerBeforeCheckout15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class AddProducts {

    public void addProduct(WebDriver driver, WebElement element) {
        element = driver.findElement(By.xpath("//a[@data-product-id='1']"));
        element.click();

    }

    public void viewCard(WebDriver driver, WebElement element) throws InterruptedException {
        element = driver.findElement(By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a"));
        System.out.println(element.getText());
        ;
        element.click();


        element = driver.findElement(By.xpath("//*[text()='Shopping Cart']"));
        String b = element.getText();
        String a = "Shopping Cart";
        Assert.assertEquals(a, b);
        Thread.sleep(2000);
        element = driver.findElement(By.partialLinkText("Proceed "));
        element.click();
    }

    public void addresControl(WebDriver driver, List<WebElement> element) {
        //YOUR DELIVERY ADDRESS
        element = driver.findElements(By.xpath("//ul[@id='address_delivery']"));
        List<String> liste = new ArrayList<>();

        for (WebElement e : element) {
            liste.add(e.getText());
        }

        // YOUR BILLING ADDRESS

        element = driver.findElements(By.xpath("  //ul[@id='address_invoice']"));
        List<String> liste1 = new ArrayList<>();

        for (WebElement e1 : element) {
            liste1.add(e1.getText());

        }
            liste1.remove(0);
            liste.remove(0);
            Assert.assertEquals(liste1,liste);

    }


    public void description(WebElement element, WebDriver driver, Actions actions) throws InterruptedException {
        element=driver.findElement(By.xpath("//textarea"));
        element.sendKeys("Thanks");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/payment']")).click();
    }


}
