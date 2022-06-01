import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/inc14/Documents/Selenium/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();//Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mi note7 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();//Thread.sleep(2000);
        driver.findElement(By.linkText("Sony Xperia 5 II Unlocked Smartphone")).click();
        driver.findElement(By.id("landingImage")).click();//Thread.sleep(2000);
        driver.findElement(By.id("ivImage_1")).click();Thread.sleep(2000);driver.findElement(By.id("ivImage_5")).click();Thread.sleep(2000);driver.findElement(By.id("ivImage_7")).click();
//        driver.navigate().back();
//        driver.findElement(By.id("twotabsearchtextbox")).clear();driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi earbuds");
//        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}