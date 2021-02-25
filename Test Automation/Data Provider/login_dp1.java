//login to amazon.in using data provider in different class

import java.util.ArrayList;
import java.util.Set;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class login_dp2 {
    String base_URL = "https://www.amazon.in/";
    WebDriver chromedriver;

    @BeforeTest
    public void launchBrowser() {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        chromedriver = new ChromeDriver();
        chromedriver.get(base_URL);
        chromedriver.manage().window().maximize();
    }
    @Test(priority=0)
    public void find_signin(){
        WebElement signin = chromedriver.findElement(By.id("nav-link-accountList-nav-line-1"));
        signin.click();
    }

    @Test(priority=1,dataProvider = "login data-provider", dataProviderClass = data_provider2.class)
    public void enter_email(String id, String password){
        WebElement email = chromedriver.findElement(By.id("ap_email"));
        email.sendKeys(id);
    }

    @Test(priority=2)
    public void continue_signin(){
        WebElement continue1 = chromedriver.findElement(By.id("continue"));
        continue1.click();
    }

    @Test(priority=3,dataProvider = "login data-provider", dataProviderClass = data_provider2.class)
    public void enter_password(String id, String password){
        WebElement email = chromedriver.findElement(By.id("ap_password"));
        email.sendKeys(password);
    }

    @Test(priority=4)
    public void submit_signin(){
        WebElement submit = chromedriver.findElement(By.id("signInSubmit"));
        submit.click();
    }

    @AfterTest
    public void Quite() {
        chromedriver.quit();
    }


}
