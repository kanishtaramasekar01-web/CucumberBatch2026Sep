package com.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinitionDatatableReal1 {

    WebDriver driver;

    @Given("user is on the registration form")
    public void user_is_on_registration_form() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.qapractice.com/practice-forms");
    }

    @When("user enters registration details")
    public void user_enters_registration_details(DataTable dataTable) {

        List<Map<String, String>> users = dataTable.asMaps();

        for (Map<String, String> user : users) {

            // Country
            new Select(driver.findElement(By.id("forms-country")))
                    .selectByVisibleText(user.get("country"));

            // Title
            new Select(driver.findElement(By.id("forms-title")))
                    .selectByVisibleText(user.get("title"));

            // First Name
            driver.findElement(By.id("forms-first-name"))
                    .clear();

            driver.findElement(By.id("forms-first-name"))
                    .sendKeys(user.get("firstName"));

            // Last Name
            driver.findElement(By.id("forms-last-name"))
                    .clear();

            driver.findElement(By.id("forms-last-name"))
                    .sendKeys(user.get("lastName"));

            // Date of Birth
            driver.findElement(By.id("forms-dob"))
                    .clear();

            driver.findElement(By.id("forms-dob"))
                    .sendKeys(user.get("dob"));

            // Date of Joining
            driver.findElement(By.id("forms-doj"))
                    .clear();

            driver.findElement(By.id("forms-doj"))
                    .sendKeys(user.get("doj"));

            // Email
            driver.findElement(By.id("forms-email"))
                    .clear();

            driver.findElement(By.id("forms-email"))
                    .sendKeys(user.get("email"));

            // Phone country code
            new Select(driver.findElement(By.id("forms-phone-code")))
                    .selectByVisibleText("+91");

            // Phone
            driver.findElement(By.id("forms-phone-number"))
                    .clear();

            driver.findElement(By.id("forms-phone-number"))
                    .sendKeys(user.get("phone"));

            // Communication
            if (user.get("communication")
                    .equalsIgnoreCase("Email")) {

                driver.findElement(By.id("forms-comm-email"))
                        .click();

            } else {

                driver.findElement(By.id("forms-comm-phone"))
                        .click();
            }

            System.out.println(
                "Entered data for: " + user.get("firstName")
            );
        }
    }
}