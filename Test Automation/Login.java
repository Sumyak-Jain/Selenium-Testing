//	Login to amazon.in


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // Launch Website
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        System.out.println("1");
        WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
                signin.click();
        System.out.println("2");
        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("***********");
        System.out.println("3");
        WebElement continu = driver.findElement(By.id("continue"));
        continu.click();
        System.out.println("4");
        WebElement pswd = driver.findElement(By.id("ap_password"));
        pswd.sendKeys("******");
        System.out.println("5");
        WebElement signin1 = driver.findElement(By.id("signInSubmit"));
        signin1.click();
        System.out.println("6");
        
    }
}
