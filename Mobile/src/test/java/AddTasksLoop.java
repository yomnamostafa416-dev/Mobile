
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AddTasksLoop {
    @Test
    public static void AddTask() throws MalformedURLException {

        // إعدادات الاتصال بـ Appium
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "Pixel 5");

        // مسار APK كامل
      //  caps.setCapability("appium:app",
               // "C:/Users/win11/AndroidStudioProjects/MyApplication/app/build/outputs/apk/app-debug.apk");

        // إنشاء Driver والتأكد من الاتصال بالسيرفر
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);

        System.out.println("App launched successfully!");
     //   driver.quit();
    }
}
