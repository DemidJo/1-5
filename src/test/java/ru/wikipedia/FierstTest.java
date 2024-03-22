package ru.wikipedia;
import org.openqa.selenium.Keys;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FierstTest {

 @Test
    public void fierstTest() {
     System.setProperty("webdriver.yandex.driver" , "webdriveer");
     ChromeDriver driver = new ChromeDriver();

     driver.get("https://en.wikipedia.org");

     String title = driver.getTitle();
     Assert.assertTrue(title.equals("Wikipedia, the free encyclopedia"));
     driver.quit();
 }
  @Test
  public void fierstTest2() {

      System.setProperty("webdriver.yandex.driver" , "webdriveer");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");

      driver.findElement(By.xpath("//input [@id = 'searchButton']")).click();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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


        driver.quit();




    }
}
