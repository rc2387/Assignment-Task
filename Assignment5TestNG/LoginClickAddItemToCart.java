package Assignment5TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LoginClickAddItemToCart{
 WebDriver wd2 = new ChromeDriver();
 //WebDriver wd3;
 //WebDriverWait wait = new WebDriverWait(wd3 , Duration.ofSeconds(5));
 @Parameters({"Username","Password"})
 @Test
 public void LoginSetupAddToCart(String UN, String PW) throws InterruptedException {

  wd2.get("https://demo.evershop.io/account/login");
  wd2.findElement(By.xpath("//input[@name ='email']")).sendKeys(UN);
  wd2.findElement(By.xpath("//input[@name ='password']")).sendKeys(PW);
  wd2.findElement(By.xpath("//button[@type ='submit']")).click();
  wd2.manage().window().maximize();
  Thread.sleep(5000);
  wd2.findElement(By.xpath("//a[@href='/account']")).click();
  Thread.sleep(5000);
  String Uservalid =wd2.findElement(By.xpath("//div[text()='Rahul Choudhary']")).getText();
  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class = 'nav-link hover:underline'])[1]")));
  SoftAssert softassert = new SoftAssert();
  softassert.assertEquals(wd2.getCurrentUrl(),"https://demo.evershop.io/account/login");
  softassert.assertEquals(Uservalid,"Rahul Choudhary");
  //softassert.assertEquals(PW,"Newuser2387");

 }
@Parameters ({"ProductCty","Product","QTY","ProdSize","ProdCol"})
@Test
    public void AddItemToCart(int ProductCategory,int ProductItem,String Qty, int Size, int colour) throws InterruptedException {
     String ProdCategoryXpath = "(//a[@class ='nav-link hover:underline'])["+ProductCategory+"]";
     //String CategoryName = wd2.findElement(By.xpath(ProdCategoryXpath)).getText();
     wd2.findElement(By.xpath(ProdCategoryXpath)).click();
     String CategoryName = wd2.findElement(By.xpath("//h1[text() ='Men']")).getText();
     String ProductXpath = "(//a[@class ='font-bold hover:underline h5'])["+ProductItem+"]";
     wd2.findElement(By.xpath(ProductXpath)).click();
     String ProdName =wd2.findElement(By.xpath("//span[text() ='Nike React Phantom Run Flyknit 2']")).getText();
     wd2.findElement(By.xpath("//input[@name = 'qty']")).clear();
     wd2.findElement(By.xpath("//input[@name = 'qty']")).sendKeys(Qty);
     Thread.sleep(5000);
     String ProdSizeXpath = "(//a[@href= '#'])["+Size+"]";
     wd2.findElement(By.xpath(ProdSizeXpath)).click();
     String ProdSize =wd2.findElement(By.xpath("//a[text() ='S']")).getText();
     Thread.sleep(5000);
     String ProdColourXpath = "(//a[@href= '#'])["+colour+"]";
     wd2.findElement(By.xpath(ProdColourXpath)).click();
     String ProdColour = wd2.findElement(By.xpath("//a[text()= 'Black']")).getText();
     Thread.sleep(5000);
     wd2.findElement(By.xpath("//button[@class = 'button primary outline']")).click();
     Thread.sleep(5000);
     wd2.findElement(By.xpath("//a[@class = 'add-cart-popup-continue text-center underline block']")).click();

     SoftAssert softassert1 = new SoftAssert();
     softassert1.assertEquals(CategoryName,"Men");
     softassert1.assertEquals(ProdName,"Nike React Phantom Run Flyknit 2");
     softassert1.assertEquals(Qty,"2");
     softassert1.assertEquals(ProdSize,"S");
     softassert1.assertEquals(ProdColour,"Black");

    }
}