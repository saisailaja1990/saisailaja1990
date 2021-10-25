package Base_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.client5.http.impl.routing.SystemDefaultRoutePlanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dummy
{
    @Test
    public void test()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement Admin= driver.findElement(By.id("txtUsername"));
        Admin.sendKeys("Admin");
       WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        WebElement loginbutton= driver.findElement(By.id("btnLogin"));
        loginbutton.click();
        String URL= driver.getCurrentUrl();

        Assert.assertEquals(URL,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");


        WebElement myinfo= driver.findElement(By.id("menu_pim_viewMyDetails"));
        myinfo.click();
        WebElement Edit= driver.findElement(By.id("btnSave"));
        Edit.click();




    }
}
