package org.example;

import com.vaadin.testbench.TestBenchTestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Matti Tahvonen
 */
public class HelloPageObjectIT extends TestBenchTestCase {

    private MainPagePO mainPage;
    private FormPO form;

    @Test
    public void testClickButton() throws Exception {
        openTestUrl();

        Assert.assertFalse("Matti already filled!", mainPage.isValueInList(
                "Matti Tahvonen"));

        mainPage.clickNew();
        form.typeEmail("matti@vaadin.com");
        form.typeName("Matti Tahvonen");
        form.typeNumber("044 3029728");
        form.save();

        Assert.assertTrue("Saving failed", mainPage.isValueInList(
                "Matti Tahvonen"));

    }

    @Before
    public void setUp() throws Exception {
        setDriver(new FirefoxDriver());
        mainPage = PageFactory.initElements(driver, MainPagePO.class);
        form = PageFactory.initElements(driver, FormPO.class);
    }

    @After
    public void tearDown() throws Exception {
        getDriver().quit();
    }

    /**
     * Opens the URL where the application is deployed.
     */
    private void openTestUrl() {
        getDriver().get("http://localhost:8080/");
    }

}
