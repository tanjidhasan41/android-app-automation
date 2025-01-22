package testrunner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screen.CalculatorScreen;
import setup.Setup;

public class CalculatorTestRunner extends Setup {

    @Test(priority = 1)
    public void doSum() throws InterruptedException {

        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        int actualResult = calculatorScreen.doSeries(1, 0, 0, 1, 0, 5, 1, 0, 6, 0);
        System.out.println(actualResult);
        int expectedResult = 100;
        Assert.assertEquals(actualResult, expectedResult);

        Thread.sleep(3000);

    }

    @AfterMethod
    public void clear() {

        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        calculatorScreen.btnClear.click();

    }

}
