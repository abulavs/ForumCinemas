package pages;
import helpers.Common;
import org.openqa.selenium.By;

public class HomePageForum extends Common {

    public void openHomePage() {
        driver.manage().window().maximize();
        driver.get("https://www.forumcinemas.lv/");
    }
    public void openLoginPage() {
        driver.findElement(By.cssSelector("div.btn-login.btn.btn-default.popover-link.hidden-xs.hidden-sm:nth-child(2)")).click();
    }
}
