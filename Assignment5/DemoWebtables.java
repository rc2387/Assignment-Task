package PkgSelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class DemoWebtables {
      //ChromeOptions option = new ChromeOptions();
      WebDriver wd = null;
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
       /* WebDriver wd;
        ChromeOptions option = new ChromeOptions();
        wd = new RemoteWebDriver((new URL("http://localhost:4444/")), new ChromeOptions());*/

        DemoWebtables w1 = new DemoWebtables();
        w1.BasicSetup();
        w1.login();
        w1.Webtables();
        w1.Rowcount();
        w1.Rowsremoved("Nizza trefoil shoes");
        w1.AfterRemoveRowsCount();


    }
        public void BasicSetup() throws MalformedURLException {
            wd = new RemoteWebDriver((new URL("http://localhost:4444/")), new ChromeOptions());
        }
        public void login() throws InterruptedException {
            wd.navigate().to("https://demo.evershop.io/account/login");
            wd.manage().window().maximize();
            //des.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
            wd.findElement(By.xpath("//input[@name='email']")).sendKeys("rchoudhary1187@gmail.com");
            wd.findElement(By.xpath("//input[@name='password']")).sendKeys("Newuser2387");
            wd.findElement(By.xpath("//button[contains(@class,'button')]")).click();
            Thread.sleep(5000);
        }
        public void ClickItem() {
            wd.findElement(By.xpath("(//a[contains(@class,'nav-link')])[1]")).click();
            wd.findElement(By.xpath("(//a[contains(@class,'font-bold')])[1]")).click();
        }
        public void Fillitemcart() throws InterruptedException {
            wd.findElement(By.xpath("//input[@name='qty']")).clear();
            wd.findElement(By.xpath("//input[@name='qty']")).sendKeys("2");
            wd.findElement(By.xpath("(//a[@href ='#'])[6]")).click();
            wd.findElement(By.xpath("(//a[@href ='#'])[9]")).click();
            Thread.sleep(5000);
            wd.findElement(By.xpath("//button[contains(@class,'button')]")).click();
            Thread.sleep(5000);
            wd.findElement((By.xpath("//a[contains(@class,'add-cart-popup-continue')]"))).click();
            wd.findElement(By.xpath("(//a[contains(@class,'text')])[2]")).click();
            wd.findElement(By.xpath("(//a[contains(@class,'font-bold')])[2]")).click();
            wd.findElement(By.xpath("(//a[@href='#'])[7]")).click();
            wd.findElement(By.xpath("(//a[@href='#'])[9]")).click();
            Thread.sleep(5000);
            wd.findElement(By.xpath("//button[contains(@class,'button')]")).click();
            Thread.sleep(2000);
            wd.findElement(By.xpath("(//a[contains(@class, 'add-cart-popup')])[1]")).click();
            //System.out.println(des.findElement(By.xpath("//div[contains(@class,'variant-validate')]")).getText());
            String Item1 = wd.findElement(By.xpath("(//a[contains(@class, 'name font-semibold')])[1]")).getText();
            String Item2 = wd.findElement(By.xpath("(//a[contains(@class, 'name font-semibold')])[2]")).getText();
            System.out.println("Items" + Item1 + "and" + Item2 + "are added successfully in Cart");
            //des.quit();
        }
        public void Webtables() {
            wd.navigate().to("https://demo.evershop.io/cart");
            List<WebElement> ColumnElements = wd.findElements(By.xpath("//table[contains(@class, items-table)]/thead/tr/td"));
            Iterator<WebElement> it1 = ColumnElements.iterator();
            while (it1.hasNext()) {
                System.out.print(it1.next().findElement(By.xpath("span")).getText());

                System.out.println();
            }
            List<WebElement> RowElements = wd.findElements(By.xpath("//table[contains(@class,'items-table')]/tbody/tr"));
            Iterator<WebElement> it2 = RowElements.iterator();
            while (it2.hasNext()) {
                System.out.println(it2.next().findElement(By.xpath("(//a[contains(@class,'name font-semibold')])[1]")).getText());
                System.out.println(it2.next().findElement(By.xpath("(//a[contains(@class,'name font-semibold')])[2]")).getText());
                System.out.println(it2.next().findElement(By.xpath("(//a[contains(@class,'name font-semibold')])[3]")).getText());
            }
        }
        public void Rowcount(){
              int Rowcountoftable = wd.findElements(By.xpath("//table[contains(@class,'items-table')]/tbody/tr")).size();
              //return Rowcountoftable;
              System.out.println("The total number of Row in Webtable is " + Rowcountoftable);
    }
     public void Rowsremoved(String Name) throws InterruptedException {

        List<WebElement> Allrows = wd.findElements(By.xpath("//table[contains(@class,'items-table')]/tbody/tr"));
         System.out.println(Allrows);
             for (WebElement e : Allrows){
                 if(e.getText().contains(Name)) {
                     int index = Allrows.indexOf(e);
                     String val = e.getText();
                     System.out.println(val);
                     String RemoveButton = "(//a[contains(@class,'text-textSubdued')])[" + (index + 1) + "]";
                     wd.findElement(By.xpath(RemoveButton)).click();
                     Thread.sleep(5000);
                     System.out.println("Item " + Name + " is Removed");
                     break;
                     // String val = e.getText();
                     //wd.findElement()
                 }
                 else {
                         System.out.println("Item not Found");
                     }

                 }

             }
             public void AfterRemoveRowsCount(){

             int FinalCount = wd.findElements(By.xpath("//table[contains(@class,'items-table')]/tbody/tr")).size();
                 System.out.println("After Remove The Item Final count in WebTable is " + FinalCount);

             }
     }

