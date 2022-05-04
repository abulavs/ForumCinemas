package pages;

import helpers.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class ProfilePageForum extends Common {

    private final By UserName = By.xpath("//input[@name='userName']");
    private final By Password = By.xpath("//input[@name='password']");
    private final By LoginButton = By.xpath("//div[4]/button");
    private final By GoToProfileButton = By.xpath("//li/a/span");
    private final By ProfileEditButton = By.xpath("//a[contains(@href, '/mypage/profile/')]");
    private final By UserFirstName = By.id("inputFirstName");
    private final By UserLastName = By.id("inputLastName");
    private final By SubmitProfileButton = By.xpath("(//button[@type='submit'])[3]");


    public void enterUsernamePassword(String username, String password) {
        driver.findElement(UserName).sendKeys(username);
        driver.findElement(Password).sendKeys(password);
    }

    public void submitLogin() {
        driver.findElement(LoginButton).click();
    }

    public void goToEditProfile() {
        driver.findElement(GoToProfileButton).click();
        driver.findElement(ProfileEditButton).click();
    }

    public void changeUserName(String firstName, String lastName) {
        driver.findElement(UserFirstName).clear();
        driver.findElement(UserFirstName).sendKeys(firstName);
        driver.findElement(UserLastName).clear();
        driver.findElement(UserLastName).sendKeys(lastName);
    }

    public void compareUserName(String firstName, String lastName) {

        String savedName = driver.findElement(UserFirstName).getAttribute("value");
        String savedSurname = driver.findElement(UserLastName).getAttribute("value");

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
        driver.findElement(SubmitProfileButton).click();
    }
}