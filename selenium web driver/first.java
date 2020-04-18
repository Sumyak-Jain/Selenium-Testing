import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
  
public class first {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
          
    // Click on the search text box and send value  
    driver.findElement(By.name("q")).sendKeys("DEVOPS");  
          
    // Click on the search button  
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.linkText("Images")).click();
    
	      

      
    }  
  
}  
