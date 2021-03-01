package com.example.cucumberbdddemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductStepDef extends CucumberbddDemoApplicationTests {

    @Autowired
    private Product product;

    private int total;


    @Given("the cost of {string} is {int}")
    public void the_cost_of_is(String article, Integer cost) {
        this.product.giveCosts(article, cost);
    }


    @When("I check  {int} of {string}")
    public void i_check_of(Integer count, String string) {
        this.total = this.product.calculate(string, count);
    }

    @Then("the total cost of {string} should be {int}")
    public void the_total_cost_of_should_be(String fruit, Integer count) {
        Assert.assertEquals((int) count, this.total);
    }
}
