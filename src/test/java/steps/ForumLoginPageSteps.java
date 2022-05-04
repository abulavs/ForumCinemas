package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProfilePageForum;

public class ForumLoginPageSteps {
    ProfilePageForum profilePageForum = new ProfilePageForum();
    @When("^Fill Username (.*) and password (.*)$")
    public void enterUsername(String username, String password) {
        profilePageForum.enterUsernamePassword(username, password);
    }

    @And("Press Submit")
    public void pressSubmit() {
        profilePageForum.submitLogin();
    }

    @And("Press Edit Profile Button")
    public void pressEditProfileButton() {
        profilePageForum.goToEditProfile();
    }

    @And("^Compare Name (.*) and Surname (.*)$")
    public void compareNameAndSurname(String savedName, String savedSurname) {
        profilePageForum.compareUserName(savedName, savedSurname);
    }


    @Then("^Change Name to (.*) and Surname to (.*)")
    public void changeNameAndSurname(String FirstName, String LastName) {
        profilePageForum.changeUserName(FirstName, LastName);
    }


    @And("^Change Birth data (.*) day (.*) month (.*) year")
    public void changeBirthData(String day, String month, String year) {
        profilePageForum.changeUserBirthData(day, month, year);
    }

    @And("Save changes")
    public void saveChanges() {
        profilePageForum.submitChanges();
    }
}
