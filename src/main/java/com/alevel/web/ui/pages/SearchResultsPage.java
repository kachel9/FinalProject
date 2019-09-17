package com.alevel.web.ui.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends BasePage{
    @FindBy(xpath = "//span[contains(@class,'category-info__count category-info__item')]")
    private List<WebElement> searchResults;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Getting search results")
    public List<WebElement> getSearchResults() {
        return searchResults;
    }
}
