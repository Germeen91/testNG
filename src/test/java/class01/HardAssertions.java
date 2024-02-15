package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertions {

    public static WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void  precondition(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(groups = "smoke")
    public void verifyTheLoginFunctionality(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();


        WebElement dashBoard= driver.findElement(By.xpath("//h1[text()='Dashboard']"));
        String actualText=dashBoard.getText();
        String expectedText="Dashboard";  // make it   "Dashboard Admin"

        //verification
        //Assertion to valid test case because without assert will give us always green pass
        Assert.assertEquals(expectedText,actualText);  // 1 Assertion
        System.out.println("A B C ");

        //assert that it is displayed
        boolean stateOfDashBoardText= dashBoard.isDisplayed();
        Assert.assertTrue(stateOfDashBoardText);  // 2 Assertion


        // if first assertion failed will not check the rest of assertions [called hard assertion]
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }


}


