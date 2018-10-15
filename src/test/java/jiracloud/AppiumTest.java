package jiracloud;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AppiumTest extends AndroidSetup {
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }




}
