package com.grandbazzar.stepDefinitions;
import com.grandbazzar.utilities.ConfigurationReader;
import com.grandbazzar.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginSteps {


    @Given("User go to {string}")
    public void user_go_to(String string) {
        Driver.get().get(string);

    }


}