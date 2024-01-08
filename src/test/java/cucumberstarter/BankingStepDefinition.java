package cucumberstarter;

import com.serenitydojo.bankingexercise.Account;
import io.cucumber.java.en.Given;

import java.util.HashMap;
import java.util.Map;


public class BankingStepDefinition {

    Map<String, Account> accounts = new HashMap<>();

    @Given("{word} has a {word} account with ${int}")
    public void has_a_account_with_$(String customerName, String accountType, Integer amount){
        accounts.put(accountType, new Account(amount));
    }

}
