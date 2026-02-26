import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;

public class Add50Tasks {
    @Test

    public static void Add50Tasks() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "Pixel 5");
        caps.setCapability("appium:appPackage", "com.example.android.architecture.blueprints.main");
        caps.setCapability("appium:appActivity", "com.example.android.architecture.blueprints.todoapp.TodoActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        for (int i = 1; i <= 50; i++) {

        driver.findElement(By.id("android:id/content")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("New Task"))).click();

        driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]")).sendKeys("Breakfast");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[2]"))).sendKeys("Food description");

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)")).click();

     // Thread.sleep(2000);

        }
}
}