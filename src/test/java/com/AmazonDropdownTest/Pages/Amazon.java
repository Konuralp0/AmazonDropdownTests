package com.AmazonDropdownTest.Pages;

import com.AmazonDropdownTest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon {

    public Amazon(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "searchDropdownBox")
        public WebElement dropdownBar;

    @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")
        public WebElement searchBox;
    @FindBy(css = "#a-autoid-0 > span")
        public WebElement sortByBox;

    @FindBy(css = "#s-result-sort-select_3")
        public WebElement customerAverage;

    @FindBy(xpath = "/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div")
        public WebElement result;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[3]/ul[2]/li[2]/span/a/span")
        public WebElement nikeSelection;

}
