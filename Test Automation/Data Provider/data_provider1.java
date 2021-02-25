//data provider and test in same class

import org.testng.annotations.DataProvider;
import org.testng.annotations.*;
import org.openqa.selenium.By;
public class data_provider1 {
    @DataProvider(name="data-provider")
    public Object[][]dpmethod(){
        return new Object[][]{{"First Value"},{"Second Value"}};
    }
@Test (dataProvider = "data-provider")
public void mytest (String val){
        System.out.println("passed value is: "+val);
}


}
