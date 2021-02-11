import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class search {
    public static void main(String[] args){
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        System.out.println("1");

        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
        search.sendKeys("oneplus 8t 12gb ram 256gb mobile aquamarine green");
        System.out.println("2");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        System.out.println("3");


        WebElement image = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img"));
        image.isDisplayed();
        System.out.println("image is displayed");

        WebElement price = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/a/span/span[2]/span[1]"));
        price.isDisplayed();
        System.out.println("price is there");

        WebElement name = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
        name.click();
        System.out.println("4");

        ArrayList<String> noOftabs= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(noOftabs.get(1));
        System.out.println("tabs are"+ noOftabs);

        WebElement buy_now = driver.findElement(By.id("buy-now-button"));
        buy_now.isDisplayed();
        System.out.println("buy now is there");

        WebElement days = driver.findElement(By.xpath("//*[@id=\"icon-farm-container\"]/div/div[1]/span/div[1]/img"));
        days.isDisplayed();
        System.out.println("7 Days Replacement logo is there");

    }
}
