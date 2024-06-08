package Assignment5TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginAccountPageLogout {
    @Parameters({"Username_2","Password_2"})
    @Test
    public void AcctPageLogout(String UN2, String PW2) throws InterruptedException {
        WebDriver wd4 = new ChromeDriver();
        wd4.get("https://demo.evershop.io/account/login");
        wd4.findElement(By.xpath("//input[@name ='email']")).sendKeys(UN2);
        wd4.findElement(By.xpath("//input[@name ='password']")).sendKeys(PW2);
        wd4.findElement(By.xpath("//button[@type ='submit']")).click();
        wd4.manage().window().maximize();
        Thread.sleep(5000);
        wd4.findElement(By.xpath("//a[@href='/account']")).click();
        String UserValidAcctPage =wd4.findElement(By.xpath("//div[text()='Rahul Choudhary']")).getText();
        Thread.sleep(5000);
        wd4.findElement(By.xpath("(//a[@class='text-interactive'])[2]")).click();
        Thread.sleep(5000);
        wd4.findElement(By.xpath("//div[@class='self-center']//a")).click();
        String LoginScreen = wd4.findElement(By.xpath("//h1[text()='Login']")).getText();

        SoftAssert softassert3 = new SoftAssert();
        softassert3.assertEquals(wd4.getCurrentUrl(), "https://demo.evershop.io/account/login");
        softassert3.assertEquals(UserValidAcctPage, "Rahul Choudhary");
        softassert3.assertEquals(LoginScreen,"Login");
    }
}