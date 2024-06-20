package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckMtsTest {
    static WebDriver driver = null;
    static WebDriverWait wait = null;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Polzovatel/IdeaProjects/ASTON/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://mts.by");
        WebElement cookies = driver.findElement(By.xpath("//button[@id='cookie-agree']"));
        cookies.click();
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //Проверка названия блока
    @Test
    public void testCheckNameBlock() {
        WebElement blockTitle = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        Assert.assertEquals(blockTitle.getText(), expectedTitle);
    }

    //Проверка наличия логотипов платежных систем
    @Test
    public void testCheckIsLogo() throws InterruptedException {
        List<WebElement> logos = driver.findElements(By.xpath("//img[@alt='МТС']"));
        Assert.assertFalse(logos.isEmpty());
    }

    //Проверка работы ссылки Подробнее о сервисе
    @Test
    public void testCheckWorkLink() {
        WebElement moreInfoLink = driver.findElement(By.xpath("//div[@class='pay__wrapper']/a"));

        moreInfoLink.click();

        WebElement moreInfo = driver.findElement(By.xpath("(//div[@class='container-fluid']/h3)[1]"));

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        Assert.assertEquals(moreInfo.getText(), "Оплата банковской картой");
    }

    //Заполнение полей и проверка работы кнопки Продолжить
    @Test
    public void testCheckWorkFieldAndContinue() {
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        WebElement serviceDropDown = driver.findElement(By.xpath("//button[@class='select__header']"));
        WebElement communicDropDown = driver.findElement(By.xpath("//p[text()='Услуги связи']"));
        WebElement continueButton = driver.findElement(By.xpath("//button[@class='button button__default ']"));

        serviceDropDown.click();
        communicDropDown.click();
        phoneNumberField.sendKeys("297777777");
        sumField.sendKeys("10");
        continueButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));

        driver.switchTo().frame(frame1);

        WebElement payCost = driver.findElement(By.xpath("//div[@class='pay-description__cost']"));

        Assert.assertTrue(payCost.getText().contains("10"));

        driver.switchTo().defaultContent();
        driver.get("http://mts.by");
    }
}


