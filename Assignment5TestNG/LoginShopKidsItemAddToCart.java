package Assignment5TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginShopKidsItemAddToCart {
    WebDriver wd3 = new ChromeDriver();

    @Parameters({"Username_1","Password_1"})
    @Test
    public void LoginSetupShopKids(String UN1, String PW1) throws InterruptedException {

        wd3.get("https://demo.evershop.io/account/login");
        wd3.findElement(By.xpath("//input[@name ='email']")).sendKeys(UN1);
        wd3.findElement(By.xpath("//input[@name ='password']")).sendKeys(PW1);
        wd3.findElement(By.xpath("//button[@type ='submit']")).click();
        wd3.manage().window().maximize();
        Thread.sleep(5000);
        wd3.findElement(By.xpath("//a[@href='/account']")).click();
        String UserValidShopKIds =wd3.findElement(By.xpath("//div[text()='Rahul Choudhary']")).getText();
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class = 'nav-link hover:underline'])[1]")));
        SoftAssert softassert2 = new SoftAssert();
        softassert2.assertEquals(wd3.getCurrentUrl(), "https://demo.evershop.io/account/login");
        softassert2.assertEquals(UserValidShopKIds, "Rahul Choudhary");
        //softassert2.assertEquals(PW1, "Newuser2387");
    }
        @Parameters({"P_HomePage","P_ShopCat","P_kidsColChk","P_PkidsSizeChk","P_PkidsItems","P_PkidsQty","P_PkidsSize","P_PkidsCol"})
        @Test
        public void ShopKidsItemsToCart (int HomePage,int ShopCat,int PkidsColChk,int PkidsSizeChk,int PkidsItems,String PkidsQty,int PkidsSize, int PkidsCol) throws InterruptedException {
            String HomePageXpath = "(//a[@class ='text-interactive'])["+HomePage+"]";
            //String CategoryName = wd2.findElement(By.xpath(ProdCategoryXpath)).getText();
            wd3.findElement(By.xpath(HomePageXpath)).click();
            Thread.sleep(5000);
            String ShopCatXpath = "(//a[contains(@class,'button primary')])["+ShopCat+"]";
            wd3.findElement(By.xpath(ShopCatXpath)).click();
            String ShopKidsBtn =wd3.findElement(By.xpath("//h1[text()='Kid']")).getText();
            Thread.sleep(5000);
            String ProdKidsColXpath = "(//span[@class='filter-option'])["+PkidsColChk+"]";
            wd3.findElement(By.xpath(ProdKidsColXpath)).click();
            String ProdColourChk =wd3.findElement(By.xpath("//span[text()='White']")).getText();
            Thread.sleep(5000);
            String ProdKidsSizeXpath = "(//span[@class='filter-option'])["+PkidsSizeChk+"]";
            wd3.findElement(By.xpath(ProdKidsSizeXpath)).click();
            String ProdSizeChk =wd3.findElement(By.xpath("//span[text()='XL']")).getText();
            Thread.sleep(5000);
            String ProdKidsItemXpath = "(//a[@class='font-bold hover:underline h5'])["+PkidsItems+"]";
            wd3.findElement(By.xpath(ProdKidsItemXpath)).click();
            Thread.sleep(5000);
            String ProdItems = wd3.findElement(By.xpath("//span[text()='CONTINENTAL 80 SHOES']")).getText();
            wd3.findElement(By.xpath("//input[@name='qty']")).clear();
            wd3.findElement(By.xpath("//input[@name='qty']")).sendKeys(PkidsQty);
            Dimension ProdQty = wd3.findElement(By.xpath("//input[@name='qty']")).getSize();
            Thread.sleep(5000);
            String PkidsSizeXpath = "(//a[@href='#'])["+PkidsSize+"]";
            wd3.findElement(By.xpath(PkidsSizeXpath)).click();
            Thread.sleep(5000);
            String ProdSize = wd3.findElement(By.xpath("//a[text()='XL']")).getText();
            String PkidsColXpath = "(//a[@href='#'])["+PkidsCol+"]";
            wd3.findElement(By.xpath(PkidsColXpath)).click();
            String ProdCol = wd3.findElement(By.xpath("//a[text()='Pink']")).getText();
            Thread.sleep(5000);
            wd3.findElement(By.xpath("//button[@type='button']")).click();
            Thread.sleep(5000);
            wd3.findElement(By.xpath("//a[@class='add-cart-popup-button']")).click();

            SoftAssert softassert3 = new SoftAssert();
            softassert3.assertEquals(ShopKidsBtn,"Kid");
            softassert3.assertEquals(ProdColourChk,"White");
            softassert3.assertEquals(ProdSizeChk,"XL");
            softassert3.assertEquals(ProdItems,"CONTINENTAL 80 SHOES");
            softassert3.assertEquals(ProdQty,"2");
            softassert3.assertEquals(ProdSize,"XL");
            softassert3.assertEquals(ProdCol,"Pink");

        }

    }