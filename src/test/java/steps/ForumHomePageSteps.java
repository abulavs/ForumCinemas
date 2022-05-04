package steps;

import cucumber.api.java.en.And;
import pages.HomePageForum;

public class ForumHomePageSteps {
    HomePageForum homePageForum = new HomePageForum();
    @And("Open ForumCinemas homepage")
    public void openForumCinemasHomepage() {
        homePageForum.openHomePage();
    }

    @And("Open Login page")
    public void openLoginPage() {
        homePageForum.openLoginPage();
    }
}
