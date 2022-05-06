package pages;

import helpers.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class ProfilePageForum extends Common {

    private final By userName = By.xpath("//input[@name='userName']");
    private final By password = By.xpath("//input[@name='password']");
    private final By loginButton = By.xpath("//div[4]/button");
    private final By goToProfileButton = By.xpath("//li/a/span");
    private final By profileEditButton = By.xpath("//a[contains(@href, '/mypage/profile/')]");
    private final By userFirstName = By.id("inputFirstName");
    private final By userLastName = By.id("inputLastName");
    private final By submitProfileButton = By.xpath("(//button[@type='submit'])[3]");


    public void enterUsernamePassword(String username, String password) {
        driver.findElement(userName).sendKeys(username);
        driver.findElement(this.password).sendKeys(password);
    }

    public void submitLogin() {
        driver.findElement(loginButton).click();
    }

    public void goToEditProfile() {
        driver.findElement(goToProfileButton).click();
        driver.findElement(profileEditButton).click();
    }

    public void changeUserName(String firstName, String lastName) {
        driver.findElement(userFirstName).clear();
        driver.findElement(userFirstName).sendKeys(firstName);
        driver.findElement(userLastName).clear();
        driver.findElement(userLastName).sendKeys(lastName);
    }

    public void compareUserName(String firstName, String lastName) {

        String savedName = driver.findElement(userFirstName).getAttribute("value");
        String savedSurname = driver.findElement(userLastName).getAttribute("value");

        if (savedName.equals(firstName) && savedSurname.equals(lastName)) {
            System.out.println("Name and Surname are correct");
        } else {
            System.out.println("Name and Surname are not correct");
        }
    }


    public void changeUserBirthData(String day, String month, String year) {
        Select DateOfBirth = new Select(driver.findElementById("bdDay"));
        DateOfBirth.selectByValue(day);
        Select MonthOfBirth = new Select(driver.findElementById("bdMonth"));
        MonthOfBirth.selectByValue(month);
        Select YeaarOfBirth = new Select(driver.findElementById("bdYear"));
        YeaarOfBirth.selectByValue(year);
    }

    public void submitChanges() {
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollBy(0,1500)");
        driver.findElement(submitProfileButton).click();
    }
}