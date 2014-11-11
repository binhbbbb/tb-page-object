
package org.example;

import org.openqa.selenium.WebElement;

/**
 * This page object contains Form related stuff
 */
public class FormPO {

    private WebElement name;
    private WebElement number;
    private WebElement email;
    private WebElement saveButton;
    
    public void typeName(String newName) {
        name.sendKeys(newName);
    }
    
    public void typeNumber(String newNr) {
        number.sendKeys(newNr);
    }
    
    public void typeEmail(String newEmail) {
        email.sendKeys(newEmail);
    }
    
    public void save() {
        saveButton.click();
    }

}
