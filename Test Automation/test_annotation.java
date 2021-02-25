import java.util.ArrayList;
import java.util.Set;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class test_annotation {

    String base_URL = "https://www.amazon.in/";
  //  String driverpath = "webdriver.chrome.driver\", \"D:\\ChromeDriver\\chromedriver.exe";
    WebDriver chromedriver;

    @BeforeTest
    public void launchBrowser() {
       // System.setProperty("webdriver.chrome.driver", driverpath);
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        chromedriver = new ChromeDriver();
        chromedriver.get(base_URL);
        chromedriver.manage().window().maximize();
    }

    @Test(priority=0)
    public void SearchFiled() {
        WebElement Search_field = chromedriver.findElement(By.id("twotabsearchtextbox"));
        Search_field.sendKeys("oneplus 8t 12gb ram 256gb mobile aquamarine green");

    }
    @Test(priority=1)
    public void click_To_SearchButton() {
        WebElement searchButton = chromedriver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

    }

    @Test(priority=2)
    public void click_To_Article() {
        WebElement Click_on_product = chromedriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
        Click_on_product.click();
    }

    @Test(priority=3)
    public void Move_To_AnotherTab() {
        Set<String> listOfTabs = chromedriver.getWindowHandles();
        ArrayList<String> arr = new ArrayList<String>(listOfTabs);
        chromedriver.switchTo().window(arr.get(1));

        System.out.println("Move to another window !");
    }

    @Test(priority=4)
    public void ValidateArticle() {
        WebElement Product_Description = chromedriver.findElement(By.id("productTitle"));
        String check = Product_Description.getText();
        System.out.println("check " + check);

        assertNotNull(check);
        System.out.println("The Product Description is not null !");

        assertTrue(check.contentEquals(check));
        System.out.println("assert true");
    }

    @AfterTest
    public void Quite() {
        chromedriver.quit();
    }
}
