package stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps3 {
	WebDriver driver;
	@Given("user open the browser and enters url")
	public void user_open_the_browser_and_enters_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form"); 
	}

	@And("textbox should be enabled")
	public void textbox_should_be_enabled() {
		driver.findElement(By.id("firstName")).isEnabled();
	}

	@When("user enters text in firstname,lastname,email,contact,message")
	public void user_enters_text_in_firstname_lastname_email_contact_message() {
		   driver.findElement(By.id("firstName")).sendKeys("Hariom");
		   driver.findElement(By.id("lastName")).sendKeys("Kumar");
		   driver.findElement(By.id("email")).sendKeys("kumarhariom2800@gmai.com");
		   driver.findElement(By.id("number")).sendKeys("9876543210");
	       driver.findElement(By.xpath("//textarea")).sendKeys("Hello world !...");
	   
	}

	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//input[@value = 'submit']")).click();
	}

	@Then("An alert should be displayed")
	public void an_alert_should_be_displayed() {
	    System.out.println("An alert should be displayed");
	}

	@And("click on alert")
	public void click_on_alert() {
		Alert alert = driver.switchTo().alert();
	    alert.accept();
	}

	
}
