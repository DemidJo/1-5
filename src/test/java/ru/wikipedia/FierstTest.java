package ru.wikipedia;
import org.openqa.selenium.Keys;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class FierstTest {

    @Test
    public void fierstTest() throws InterruptedException {
        System.setProperty("webdriver.yandex.driver" , "webdriveer");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");

        // Проверка заголовка страницы
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Wikipedia, the free encyclopedia"));



        WebElement historyLink = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div[1]/div/div[2]/nav[1]/div/div/ul/li[3]/a"));
        historyLink.click();
        driver.navigate().back();
        Assert.assertTrue(title.equals("Wikipedia, the free encyclopedia"));


    driver.quit();
    }

  @Test
  public void fierstTest2() {

      System.setProperty("webdriver.yandex.driver" , "webdriveer");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");


      driver.findElement(By.id("searchButton")).click();

      WebElement heading = driver.findElement(By.cssSelector("h1#firstHeading.firstHeading.mw-first-heading"));

      Assert.assertNotNull("Элемент h1 с заданными атрибутами не найден", heading);

      driver.navigate().back();

      driver.navigate().forward();

      driver.quit();
  }



    @Test
    public void fierstTest3() {

        System.setProperty("webdriver.yandex.driver" , "webdriveer");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");


        WebElement spanElement = driver.findElement(By.className("mw-headline"));
        Actions actions = new Actions(driver);
        actions.moveToElement(spanElement).perform();
        WebElement linkElement = spanElement.findElement(By.tagName("a"));
        linkElement.click();
        WebElement imageElement = driver.findElement(By.xpath("//img[contains(@src, 'Wikipedia_Portal_Screenshot')]"));
        WebElement heading = driver.findElement(By.cssSelector("h1#firstHeading.firstHeading"));


        Assert.assertTrue("Элемент <h1> с id='firstHeading' и class='firstHeading' должен быть на странице", heading.isDisplayed());
        String imageUrl = imageElement.getAttribute("src");
        System.out.println("URL изображения: " + imageUrl);

        driver.quit();


    }
  @Test

    public void fierstTest4() {

        System.setProperty("webdriver.yandex.driver" , "webdriveer");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");

        WebElement searchInput = driver.findElement(By.id("searchInput"));



        String text = "1234567890"; // текст для ввода
        for (int i = 0; i < 10; i++) { // повторить 10 раз, чтобы общее количество символов было 100
            searchInput.sendKeys(text);
        }
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
      List<WebElement> links = driver.findElements(By.cssSelector("a[href='/w/index.php?title=1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890&action=edit&redlink=1'][title='1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890 (страница отсутствует)']"));


        Assert.assertTrue("Ссылка должна быть на странице", links.size() > 0);

        driver.quit();
 }
  @Test

    public void fierstTest5() {

        System.setProperty("webdriver.yandex.driver" , "webdriveer");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");

        WebElement link = driver.findElement(By.xpath("//a[contains(@href, '/w/index.php?title=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BE%D0%B7%D0%B4%D0%B0%D1%82%D1%8C_%D1%83%D1%87%D1%91%D1%82%D0%BD%D1%83%D1%8E_%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C&returnto=%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F+%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0')]"));


        link.click();
        WebElement inputField = driver.findElement(By.id("wpName2"));


        inputField.sendKeys("Demid");
        WebElement passwordField = driver.findElement(By.id("wpPassword2"));

        passwordField.sendKeys("12345");
      WebElement inputElement = driver.findElement(By.cssSelector("input#wpPassword2[name='wpPassword'][placeholder='Введите пароль'][class='loginPassword mw-userlogin-password cdx-text-input__input'][tabindex='3'][required][autocomplete='new-password'][type='password']"));

      // Проверяем, что элемент input найден
      Assert.assertNotNull("Элемент input с указанными атрибутами должен быть на странице", inputElement);


         driver.quit();




    }

}
