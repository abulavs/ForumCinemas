package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import helpers.Common;

public class CommonSteps {

    Common common = new Common();

    @Given("Open Chrome")
    public void openChrome() {
        common.startChrome();
    }

    @And("Close Chrome")
    public void closeChrome() {
        common.stopChrome();
    }
}
