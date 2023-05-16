package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    @FindBy(xpath = "//span[@class='title']")
    WebElement titleOfPage;
    @FindBy(xpath = "//div[@class='inventory_item']")
    List<WebElement> listOfOfProducts;

    public int sizeOfTheList() {
        int listSize = listOfOfProducts.size();
        return listSize;
    }

    public String getTitleOfThePage() {
        log.info("Title of the page " + titleOfPage.toString());
        return titleOfPage.getText();
    }

}
