package hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Driver;

public class Hooks {

        @Before
        public void setUp() {
            Driver.getAppiumDriver();  // Her senaryo öncesi Appium session başlatılır
        }

        @After
        public void tearDown() {
            Driver.quitAppiumDriver(); // Her senaryo sonrası session sonlandırılır
        }


    }




