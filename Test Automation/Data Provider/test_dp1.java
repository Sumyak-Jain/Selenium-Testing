// test in another class

import org.testng.annotations.Test;

public class test_dp1 {
    @Test (dataProvider = "data-provider", dataProviderClass = data_provider1.class)
    public void myTest (String val) {
        System.out.println("Current Status : " + val);
    }
}
