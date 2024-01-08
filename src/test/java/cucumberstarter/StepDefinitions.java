package cucumberstarter;

import com.serenitydojo.bankingexercise.Account;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class StepDefinitions {

    Map<String, Account> accounts = new HashMap<>();

    @Given("{word} has a {word} account with ${int}")
    public void has_a_account_with_$(String customerName, String accountType, Integer amount){
        accounts.put(accountType, new Account(amount));
    }
    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
