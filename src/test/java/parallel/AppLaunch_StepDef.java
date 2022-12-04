package parallel;

import com.driverfactory.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AppLaunch_StepDef {



    @And("user selects the gallery app")
    public void userSelectsTheGalleryApp() {

    }

    @And("user clicks on select and image")
    public void userClicksOnSelectAndImage() {

    }

    @Then("user clicks on info i")
    public void userClicksOnInfoI() {
    }

    @Given("user launches the App")
    public void userLaunchesTheApp() {
        Hooks hooks = new Hooks();
        hooks.launchBrowser();

    }
}
