import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;

public class LogIn {
    @Test

    public void LogInWithIncorrectData(){
        WebDriverManager.chromedriver().setup();
        Selenide.open("https://tbconline.ge/tbcrd/login?t=false");

        $(By.xpath("//*[@id=\"mainLoadingLayer\"]/ui-view/ui-view-ng-upgrade[2]/ui-view/ib-login/div/div/div[1]/div[1]/div/form/div[1]/div[1]/ib-input/input")).setValue("an_nuki1");

        $(By.id("ib-checkbox-1")).click();

        $(By.id("password-input")).setValue("Jijiko@222").pressEnter();
        $(By.id("SMS_OTP")).setValue("0344").pressEnter();

        //$(By.linkText("შესვლა")).pressEnter(); -დაფეილდდა,რადგან ტექსტით მოძებნა ვერ ვნახე და linkText ვერ იპოვა.

        //Assert.assertEquals("პაროლი ან მომხმარებელი არ არის სწორი.", $(By.className("alert")).getText()); - ეს ორი რამის შედარება,მაგ: ტექსტი გამოვა წერტილით თუ წერტილის გარეშე.

        //Assert.assertEquals("rgba(199, 32, 39, 1)", $(By.className("alert")).getCssValue("color"));

        sleep(10000);

    }

    /*@Test

    public void LogInWithEmptyDate(){

        WebDriverManager.chromedriver().setup();
        Selenide.open("https://tbconline.ge/tbcrd/login?t=false");

        //$(By.className("btn-lg")).click();


        //Assert.assertEquals("პაროლი ან მომხმარებელი არ არის სწორი", $(By.className("alert")).getText());


        sleep(5000);
    }*/
}
