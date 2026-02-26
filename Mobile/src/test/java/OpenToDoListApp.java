//import  io.appium.java_client.
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenToDoListApp {
    @Test


   // private static Object MobileCapabilityType;

    public static void OpenToDoList() throws MalformedURLException {

        // إعدادات الاتصال بـ Appium
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "Pixel 5");


        caps.setCapability("appPackage", "com.example.android.architecture.blueprints.main");

        caps.setCapability("appActivity", "com.example.android.architecture.blueprints.todoapp.TodoActivity");

        // مسار APK الرئيسي
       // caps.setCapability("appium:app",
                //"C:/Users/win11/Downloads/architecture-samples-main/architecture-samples-main/app/build/outputs/apk/debug/app-debug.apk");

        // لو التطبيق موجود مسبقًا على المحاكي
        caps.setCapability("noReset", true);

        // الاتصال بسيرفر Appium بدون /wd/hub
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);


        System.out.println("تم فتح تطبيق ToDoList بنجاح!");
    }
}