package com.AmazonDropdownTest.Tests;

import com.AmazonDropdownTest.Pages.Amazon;
import com.AmazonDropdownTest.Utilities.ConfigReader;
import com.AmazonDropdownTest.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.util.function.Function;

public class AmazonDropdown {

@Test
    public void DropDownAndAssertTest() throws InterruptedException {

    Driver.getDriver().get(ConfigReader.getProperty("amazon_link"));
    Amazon pages = new Amazon();
    Select select = new Select(pages.dropdownBar);
    select.selectByVisibleText("Boys' Fashion");
    Thread.sleep(5000);
    pages.searchBox.click();
    pages.searchBox.sendKeys(ConfigReader.getProperty("amazon_first_search")+Keys.ENTER);
    pages.sortByBox.click();
    pages.customerAverage.click();
    Thread.sleep(3500);
    SoftAssert softAssert = new SoftAssert();
    String expectedResult = "1-48 of over 5,000 results for \"Shoes\"";
    softAssert.assertEquals(pages.result.getText(),expectedResult);

    boolean nikeShow = pages.nikeSelection.isDisplayed();
    softAssert.assertTrue(nikeShow);


    softAssert.assertAll();







}




}
