package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 */
public class MainPagePO {

    // addNew Button field in VaadinUI has id "addNew" and its client side counterpart
    // is by convetion automatically wired here when the class is instantiated 
    // with PageFactory
    private WebElement addNew;

    // field without hints is analogue to below, but you can naturally use lots of 
    // other selectors but element identifiers as well
    @FindBy(id = "entryList")
    private WebElement entryList;

    public void clickNew() {
        addNew.click();
    }
    
    public boolean isValueInList(String string) {
        return entryList.getText().contains(string);
    }

}
