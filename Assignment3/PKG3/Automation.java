package Assignment3.PKG3;

public class Automation {
    public static void main(String[] args) {
        ChromeDriver cd = new ChromeDriver();
        FirefoxDriver fd = new FirefoxDriver();
        cd.get();
        cd.OpenDevtools();
        fd.get();
        fd.OpenInspect();
    }
}
