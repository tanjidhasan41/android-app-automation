package screen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreenForSeriesData {

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnAdd;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;

    @FindBy(id = "com.google.android.calculator:id/op_pow")
    WebElement btnPower;

    @FindBy(id = "com.google.android.calculator:id/const_pi")
    WebElement btnPi;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement result;

    AndroidDriver driver;

    public CalculatorScreenForSeriesData(AndroidDriver driver) {

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public double doCSVSeries(String expression) {

        String[] specialChars = expression.split("(?=[-+*/^])|(?<=[-+*/^])");

        for (String specialChar : specialChars) {
            switch (specialChar) {
                case "+":
                    btnAdd.click();
                    break;
                case "-":
                    btnSub.click();
                    break;
                case "/":
                    btnDiv.click();
                    break;
                case "*":
                    btnMul.click();
                    break;
                case "^":
                    btnPower.click();
                    break;
                case "pi":
                    btnPi.click();
                    break;
                default:
                    for (char num : specialChar.toCharArray()) {
                        if (Character.isDigit(num)) {
                            driver.findElement(By.id("com.google.android.calculator:id/digit_" + num)).click();
                        }
                    }
                    break;
            }
        }

        btnEqual.click();

        String resultText = result.getText();
        return Double.parseDouble(resultText);

    }

}
