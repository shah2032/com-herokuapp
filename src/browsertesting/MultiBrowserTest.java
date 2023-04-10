package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrowserTest {static String browser = "Edge";
    static String baseUrl = " http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if( browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")){
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new ChromeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        //Find the Login link element
        WebElement loginLink = driver.findElement((By.id("username")));
        //Click on login link element

        loginLink.click();
        // Find the username Field Element
        WebElement userName = driver.findElement(By.name("username"));
        //Type the username to username field element
        userName.sendKeys("Prime");

        driver.findElement(By.name("password")).sendKeys("Prime123");


    }
}


