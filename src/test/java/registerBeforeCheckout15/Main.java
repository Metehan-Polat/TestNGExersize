package registerBeforeCheckout15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.List;

public class Main extends BefAf {
    UrlCls urlCls=new UrlCls();
    AddProducts addProducts=new AddProducts();
    Card card=new Card();


    @BeforeClass
    @Parameters("browser")
    public void setUp(@Optional("browser") String browser)
    {
        this.firtMethod(browser);

    }
    @AfterClass

    public void tearDown()
    {
        this.lastMethod(driver);
    }

    @Test(priority = 0)
    public void testing()
    {
        this.urlCls.getUrl(driver);
    }
    @Test(priority = 1)
    public void sigUpLogin()
    {
        this.urlCls.singUpLogin(driver,element);
    }
    @Test(priority = 2)
    public void newU() throws InterruptedException {
        this.urlCls.newUser(driver,element,actions);
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void logK() throws InterruptedException {
        this.urlCls.EAccountInformation(driver,element,actions,select);
        this.urlCls.creacted(driver,element);
    }

    @Test(priority = 4)
    public void logAndUsername() throws InterruptedException {
        this.urlCls.logAndUser(element,driver);
    }
    @Test(priority = 5)
    public void addProViewCard() throws InterruptedException {
        this.addProducts.addProduct(driver,element);
        this.addProducts.viewCard(driver,element);
        this.addProducts.addresControl(driver, (List<WebElement>) element);
        this.addProducts.description(element,driver,actions);
    }

    @Test(priority = 6)
    public void cardDetails()
    {
        this.card.cart(driver,element,actions);
        this.card.payCon(driver);
    }
}
