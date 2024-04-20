package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SocialWebsite {
    public static void main(String[] args) throws InterruptedException {

       /* WebDriver YT = new ChromeDriver();
        String YtURL=  "https://www.youtube.com/";
        YT.get(YtURL);
        YT.findElement(By.xpath("//input[@id='search']")).sendKeys("rahul");*/
        //SocialWebsite YFT = new SocialWebsite();
        /*Youtube(); This will work if we make our Methods as static.
        Thread.sleep(5000);
        Facebook();
        Thread.sleep(5000);
        TOI();*/

        //Through Instance Creation then Method will be called.
        SocialWebsite YFT = new SocialWebsite();
        YFT.Youtube();
        Thread.sleep(5000);
        YFT.Facebook();
        Thread.sleep(5000);
        YFT.TOI();

    }

   public  void Youtube() throws InterruptedException {
        WebDriver YTdriver = new ChromeDriver();
        YTdriver.get("https://www.youtube.com/");
        YTdriver.manage().window().maximize();
        YTdriver.findElement(By.xpath("//input[@id='search']")).sendKeys("Podtest");
        YTdriver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(5000);
        YTdriver.quit();

    }

    public  void Facebook() throws InterruptedException {
        WebDriver FBdriver = new ChromeDriver();
        FBdriver.navigate().to("https://www.facebook.com/");
        FBdriver.manage().window().maximize();
        FBdriver.findElement(By.xpath("//input[@name='email']")).sendKeys("rchoudhary1187@gmail.com");
        FBdriver.findElement(By.xpath("//input[@name='pass']")).sendKeys("XXXXX");
        FBdriver.findElement(By.xpath("//button[@name='login']")).click();
        Thread.sleep(5000);
        FBdriver.quit();

    }
    public  void TOI(){
        WebDriver TOIdriver = new ChromeDriver();
        TOIdriver.get("https://timesofindia.indiatimes.com/");
        TOIdriver.manage().window().maximize();
        List<WebElement> countatag = TOIdriver.findElements(By.tagName("a"));
        System.out.println("The Total Number of a tag in TOI is" + countatag.size());

    }
}