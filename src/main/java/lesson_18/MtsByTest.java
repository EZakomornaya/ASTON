package lesson_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class MtsByTest {
    static WebDriver driver = null;
    static WebDriverWait wait = null;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Polzovatel/IdeaProjects/ASTON/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://mts.by");
        WebElement cookies = driver.findElement(By.xpath("//button[@id='cookie-agree']"));
        cookies.click();
        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //1.1 Проверить надписи в незаполненных полях каждого варианта оплаты услуг: услуги связи
    @Test
    public void testCheckNameTips() {
        WebElement serviceDropDown = driver.findElement(By.xpath("//button[@class='select__header']"));
        WebElement communicDropDown = driver.findElement(By.xpath("//p[text()='Услуги связи']"));
        WebElement cellField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        WebElement mailField = driver.findElement(By.xpath("//input[@id='instalment-email']"));
        serviceDropDown.click();
        communicDropDown.click();
        String expectedCellTip = "Номер телефона";
        String expectedSumTip = "Сумма";
        String expectedMailTip = "E-mail для отправки чека";
        String cellPlaceholder = cellField.getAttribute("placeholder");
        String sumPlaceholder = sumField.getAttribute("placeholder");
        String mailPlaceholder = mailField.getAttribute("placeholder");
        Assert.assertEquals(cellPlaceholder, expectedCellTip);
        Assert.assertEquals(sumPlaceholder, expectedSumTip);
        Assert.assertEquals(mailPlaceholder, expectedMailTip);
    }
}

