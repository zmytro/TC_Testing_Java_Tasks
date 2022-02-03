
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.xpath;

public class TC1_Airport {

    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        //create chrome instance
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://airport.md/ru?checkin-warn");
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
        WebElement search = driver.findElement(xpath("//*[@class='search-trigger']/*[name()='svg']"));
        WebElement input = driver.findElement(By.xpath("//input[@type='search']"));
        sleep(50);
        search.click();
        input.sendKeys("12");
        input.sendKeys(Keys.ENTER);
    }
}