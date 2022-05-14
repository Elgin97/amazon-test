import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UrunEkleSil {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com.tr/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();

            //Arama kutusuna Mouse yazdık.
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mouse");

            //Arattık.
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            driver.findElement(By.linkText("HP İki Modlu Kablosuz Bluetooth Mouse, Siyah, 6CR71AA")).click();

            //Ürünü sepete ekledik.
            driver.findElement(By.xpath("//input[@value='Sepete Ekle']")).click();

            //Sepete gittik
            driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
            Thread.sleep(2000);

            //Ürünü sildik.
            driver.findElement(By.xpath("//input[@value='Sil']")).click();

    }
}
