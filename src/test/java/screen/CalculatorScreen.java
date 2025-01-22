package screen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreen {

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnAdd;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement result;

    @FindBy(id = "com.google.android.calculator:id/clr")
    public WebElement btnClear;

    AndroidDriver driver;

    public CalculatorScreen(AndroidDriver driver) {

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public int doSeries(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num0) {

        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num2)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num3)).click();
        btnDiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num4)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num5)).click();
        btnMul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num6)).click();
        btnSub.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num7)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num8)).click();
        btnAdd.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num9)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num0)).click();
        btnEqual.click();
        return Integer.parseInt(result.getText());

    }

}
