package lesson_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class CheckMtsByTest {
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

    //1.2 Проверить надписи в незаполненных полях каждого варианта оплаты услуг: домашний интернет
    @Test
    public void testCheckNameHomeInternet() {
        WebElement serviceDropDown = driver.findElement(By.xpath("//button[@class='select__header']"));
        WebElement internetDropDown = driver.findElement(By.xpath("//p[text()='Домашний интернет']"));
        WebElement cellField = driver.findElement(By.xpath("//input[@id='internet-phone']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@id='internet-sum']"));
        WebElement mailField = driver.findElement(By.xpath("//input[@id='internet-email']"));
        serviceDropDown.click();
        internetDropDown.click();
        String expectedCellTip = "Номер абонента";
        String expectedSumTip = "Сумма";
        String expectedMailTip = "E-mail для отправки чека";
        String cellPlaceholder = cellField.getAttribute("placeholder");
        String sumPlaceholder = sumField.getAttribute("placeholder");
        String mailPlaceholder = mailField.getAttribute("placeholder");
        Assert.assertEquals(cellPlaceholder, expectedCellTip);
        Assert.assertEquals(sumPlaceholder, expectedSumTip);
        Assert.assertEquals(mailPlaceholder, expectedMailTip);
    }

    //1.3 Проверить надписи в незаполненных полях каждого варианта оплаты услуг: рассрочка
    @Test
    public void testCheckNameInstallment() {
        WebElement serviceDropDown = driver.findElement(By.xpath("//button[@class='select__header']"));
        WebElement installmentDropDown = driver.findElement(By.xpath("//p[text()='Рассрочка']"));
        WebElement scoreInstalmentField = driver.findElement(By.xpath("//input[@id='score-instalment']"));
        WebElement sumInstalmentField = driver.findElement(By.xpath("//input[@id='instalment-sum']"));
        WebElement mailInstalmentField = driver.findElement(By.xpath("//input[@id='instalment-email']"));
        serviceDropDown.click();
        installmentDropDown.click();
        String expectedScoreTip = "Номер счета на 44";
        String expectedSumTip = "Сумма";
        String expectedMailTip = "E-mail для отправки чека";
        String scorePlaceholder = scoreInstalmentField.getAttribute("placeholder");
        String sumPlaceholder = sumInstalmentField.getAttribute("placeholder");
        String mailPlaceholder = mailInstalmentField.getAttribute("placeholder");
        Assert.assertEquals(scorePlaceholder, expectedScoreTip);
        Assert.assertEquals(sumPlaceholder, expectedSumTip);
        Assert.assertEquals(mailPlaceholder, expectedMailTip);
    }

    //1.4 Проверить надписи в незаполненных полях каждого варианта оплаты услуг: задолженность
    @Test
    public void testCheckNameDebt() {
        WebElement serviceDropDown = driver.findElement(By.xpath("//button[@class='select__header']"));
        WebElement debtDropDown = driver.findElement(By.xpath("//p[text()='Задолженность']"));
        WebElement scoreArreasField = driver.findElement(By.xpath("//input[@id='score-arrears']"));
        WebElement arrearsSumField = driver.findElement(By.xpath("//input[@id='arrears-sum']"));
        WebElement arrearsEmailField = driver.findElement(By.xpath("//input[@id='arrears-email']"));
        serviceDropDown.click();
        debtDropDown.click();
        String expectedScoreTip = "Номер счета на 2073";
        String expectedSumTip = "Сумма";
        String expectedMailTip = "E-mail для отправки чека";
        String scorePlaceholder = scoreArreasField.getAttribute("placeholder");
        String sumPlaceholder = arrearsSumField.getAttribute("placeholder");
        String mailPlaceholder = arrearsEmailField.getAttribute("placeholder");
        Assert.assertEquals(scorePlaceholder, expectedScoreTip);
        Assert.assertEquals(sumPlaceholder, expectedSumTip);
        Assert.assertEquals(mailPlaceholder, expectedMailTip);
    }

    /*2.1 Для варианта «Услуги связи» заполнить поля в соответствии с пререквизитами из предыдущей темы,
    нажать кнопку «Продолжить» и в появившемся окне проверить корректность отображения суммы
    (в том числе на кнопке), номера телефона, а также надписей в незаполненных полях для ввода реквизитов карты,
    наличие иконок платёжных систем.
     */
    @Test
    public void testCheckNameTipsBepaidApp() {
        WebElement serviceDropDown = driver.findElement(By.xpath("//button[@class='select__header']"));
        WebElement communicDropDown = driver.findElement(By.xpath("//p[text()='Услуги связи']"));
        WebElement cellField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        WebElement continueButton = driver.findElement(By.xpath("//button[@class='button button__default ']"));
        serviceDropDown.click();
        communicDropDown.click();
        cellField.sendKeys("297777777");
        sumField.sendKeys("10");
        continueButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(frame1);
        WebElement payCost = driver.findElement(By.xpath("//div[@class='pay-description__cost']"));
        Assert.assertTrue(payCost.getText().contains("10"));
        WebElement payButton = driver.findElement(By.xpath("//button[@class='colored disabled']"));
        Assert.assertTrue(payButton.getText().contains("10"));
        WebElement cellCheck = driver.findElement(By.xpath("//span[@class='pay-description__text']"));
        Assert.assertTrue(cellCheck.getText().contains("375297777777"));
        WebElement cardFieldCheck = driver.findElement(By.xpath("//label[@class='ng-tns-c46-1 ng-star-inserted']"));
        Assert.assertEquals(cardFieldCheck.getText(),
                "Номер карты");
        WebElement validityFieldCheck = driver.findElement(By.xpath("//div[@class='content ng-tns-c46-4']"));
        Assert.assertEquals(validityFieldCheck.getText(),
                "Срок действия");
        WebElement cvcFieldCheck = driver.findElement(By.xpath("//label[@class='ng-tns-c46-5 ng-star-inserted']"));
        Assert.assertEquals(cvcFieldCheck.getText(),
                "CVC");
        WebElement nameHolderFieldCheck = driver.findElement(By.xpath("//label[@class='ng-tns-c46-3 ng-star-inserted']"));
        Assert.assertEquals(nameHolderFieldCheck.getText(),
                "Имя держателя (как на карте)");
        WebElement iconMastercardCheck = driver.findElement(By.xpath("(//img[@class='ng-tns-c61-0 ng-star-inserted'])[1]"));
        Assert.assertTrue(iconMastercardCheck.isDisplayed());
        WebElement iconVisaCheck = driver.findElement(By.xpath("(//img[@class='ng-tns-c61-0 ng-star-inserted'])[2]"));
        Assert.assertTrue(iconVisaCheck.isDisplayed());
        WebElement iconBelkardCheck = driver.findElement(By.xpath("(//img[@class='ng-tns-c61-0 ng-star-inserted'])[3]"));
        Assert.assertTrue(iconBelkardCheck.isDisplayed());
        WebElement iconMirCheck = driver.findElement(By.xpath(
                "//div[@class='cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted']"));
        Assert.assertTrue(iconMirCheck.isDisplayed());
        WebElement yandexCheck = driver.findElement(By.xpath(
                "//button[@class='ya-pay-button ya-pay-button_black']"));
        Assert.assertTrue(yandexCheck.isDisplayed());
        WebElement googleCheck = driver.findElement(By.xpath(
                "//button[@id='gpay-button-online-api-id']"));
        Assert.assertTrue(googleCheck.isDisplayed());
        driver.switchTo().defaultContent();
    }
}



