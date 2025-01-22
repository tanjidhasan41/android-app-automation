package testrunner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screen.CalculatorScreen;
import screen.CalculatorScreenForSeriesData;
import setup.SeriesDataSet;
import setup.Setup;

public class SeriesDataSetTestRunner extends Setup {

    @Test(dataProvider = "SeriesData", dataProviderClass = SeriesDataSet.class)
    public void doSeries(String expression, double expectedResult) throws InterruptedException {

        CalculatorScreenForSeriesData calculatorScreen = new CalculatorScreenForSeriesData(driver);
        double actualResult = calculatorScreen.doCSVSeries(expression);
        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectedResult);

        Thread.sleep(3000);

    }

    @AfterMethod
    public void clear() {

        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        calculatorScreen.btnClear.click();

    }

}
