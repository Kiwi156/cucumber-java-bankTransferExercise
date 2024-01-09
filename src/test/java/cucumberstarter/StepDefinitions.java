package cucumberstarter;

import com.serenitydojo.bankingexercise.Account;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    Map<String, Account> accounts = new HashMap<>();

    @Given("{word} has a {word} account with ${int}")
    public void has_a_account_with_$(String customerName, String accountType, Integer amount) {
        accounts.put(accountType, new Account(amount));
    }

    @When("she transfers ${int} from her {word} account her {word} account")
    public void she_transfers_$_from(Integer amountToTransfer, String fromAccount, String toAccount) {
        Account from = accounts.get(fromAccount);
        Account to = accounts.get(toAccount);

        from.transferTo(to, amountToTransfer);
    }

    @Then("her {word} account should have ${int}")
    public void her_account_should_have_$(String accountType, Integer expectedAmount) {
        Account account = accounts.get(accountType);
        assertThat(account.getBalance()).isEqualTo(expectedAmount);

    }
}
