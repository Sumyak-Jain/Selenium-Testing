// array data provider for login in amazon.in
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

public class data_provider2 {
    @DataProvider(name="login data-provider")
    public Object[][]getdata(){
        Object[][] data = new Object[1][2];
        data[0][0]="email";
        data[0][1]="******";

        return data;
    }



}
