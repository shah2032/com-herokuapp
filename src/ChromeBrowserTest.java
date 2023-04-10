import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = " http://the-internet.herokuapp.com/login";

        // launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

        //Find the Login link element
        WebElement loginLink = driver.findElement((By.id("username")));
        //Click on login link element

        loginLink.click();
        // Find the username Field Element
        WebElement userName = driver.findElement(By.name("username"));
        //Type the username to username field element
        userName.sendKeys("Prime");

        driver.findElement(By.name("password")).sendKeys("Prime123");

        // Close the Browser
        driver.close();
        driver.quit();

    }


}
