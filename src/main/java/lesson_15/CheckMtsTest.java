package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

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
        wait = new WebDriverWait(driver,10);
    }

    //Проверка названия блока
    @Test
    public void testCheckNameBlock() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay__wrapper']/h2")));
        WebElement blockTitle = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        Assert.assertEquals(blockTitle.getText(), expectedTitle);
    }

    //Проверка наличия логотипов платежных систем
    @Test
    public void testCheckIsLogo() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='МТС']")));
        List<WebElement> logos = driver.findElements(By.xpath("//img[@alt='МТС']"));
        Assert.assertFalse(logos.isEmpty());
    }

    //Проверка работы ссылки Подробнее о сервисе
    @Test
    public void testCheckWorkLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay__wrapper']/a")));
        WebElement moreInfoLink = driver.findElement(By.xpath("//div[@class='pay__wrapper']/a"));
        moreInfoLink.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    //Заполнение полей и проверка работы кнопки Продолжить
    @Test
    public void testCheckWorkFieldAndContinue() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='connection-phone']")));
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement serviceDropDown = driver.findElement(By.xpath("//select[@id='pay']"));
        WebElement continueButton = driver.findElement(By.xpath("//button[@class='button button__default ']"));
        phoneNumberField.sendKeys("297777777");
        Select serviceDropdownSelect = new Select(serviceDropDown);
        serviceDropdownSelect.selectByVisibleText("Услуги связи");
        continueButton.click();
        //Дальнейшие проверки в зависимости от действий после нажатия на кнопку "Продолжить"
    }
}
