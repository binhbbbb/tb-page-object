package org.example;

import org.openqa.selenium.WebElement;

/**
 *
 */
public class MainPagePO {

    private WebElement addNew;

    private WebElement entryList;

    public void clickNew() {
        addNew.click();
    }
    
    public boolean isValueInList(String string) {
        return entryList.getText().contains(string);
    }

}
