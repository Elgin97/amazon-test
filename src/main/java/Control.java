import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Control {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();

        //Anasayfadaki butonlara tek tek tıklayarak kontrol ettik.
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Satış Yap']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Çok Satanlar']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Günün Fırsatları']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Müşteri Hizmetleri']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Moda']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Yeni Çıkanlar']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Elektronik']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Kitap']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Outlet Reyonu']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Bilgisayar']")).click();

    }
}
