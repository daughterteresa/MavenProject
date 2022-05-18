import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestRunner {

    @Given("open Google Chrome")
    public void open_google_chrome() {
        System.out.println("Open Google Chrome");
    }
    @When("I Enter Valid Email And password")
    public void i_enter_valid_email_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Valid User name and password successful");
    }
    @Then("user should be able to Login")
    public void user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Valid User name and password successful");
    }
    @Then("Homepage must be shown")
    public void homepage_must_be_shown() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Valid User name and password successful");
    }

}
