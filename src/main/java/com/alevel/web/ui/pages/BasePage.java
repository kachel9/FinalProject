package com.alevel.web.ui.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {


    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
