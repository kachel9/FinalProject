package com.alevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBasketTest extends TestBase {

    @Test
        public void checkGoogle() throws InterruptedException {

            WebElement order1 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"productsList\"]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/a[1]/span")));
            order1.click();

            WebElement close = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("  //*[@title=\"Close\"]")));
            close.click();

            WebElement trash = new WebDriverWait(driver, 15)
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"cartHeaderQty\"]"))));
            trash.click();
            String price =driver.findElement(By.xpath("//*[@id=\"minicartPopup\"]/ul/li/div[1]/div[4]/div/div/span[1]")).getText();

            Assert.assertEquals(price,"6 499");

        }
    }


