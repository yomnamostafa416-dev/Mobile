import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.URI;

public class FristProject {
   @Test
    public void OpenApp() throws URISyntaxException, MalformedURLException {
      UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("pixel 5");//emulator name
        options.setApp("C://Users//win11//IdeaProjects//Mobile//src//test//resources//ApiDemos-debug.apk");
        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(By.className("android.widget.CheckBox")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(0)")).click();
    }
}