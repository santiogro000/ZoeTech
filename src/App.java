import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexis\\Documents\\Zoe\\Zoe1\\src\\drivers\\chrome-win64\\chrome.exe");

        // Initialize ChromeOptions and WebDriver
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the browser and navigate to URL
            driver.get("https://auth-test.zoefin.com/u/login");

            // Locate and interact with elements
            WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
            usernameField.sendKeys("zoefin.advisor+qaroleadv01@gmail.com");

            WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
            passwordField.sendKeys("QA.role123");

            WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
            continueButton.click();

            WebElement addNewClientLink = driver.findElement(By.xpath("//li[contains(text(),'Add New Client')]"));
            addNewClientLink.click();

            WebElement addToExistingHouseholdButton = driver.findElement(By.xpath("//button[contains(text(),'Add Client to Existing Household')]"));
            addToExistingHouseholdButton.click();

            WebElement nextButtonModal = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
            nextButtonModal.click();

            WebElement searchInput = driver.findElement(By.xpath("//input[contains(@placeholder,'Select a Household')]"));
            searchInput.click();

            WebElement selectHouseholdOption = driver.findElement(By.xpath("//span[contains(text(),'Alexis Auto Carrillo')]"));
            selectHouseholdOption.click();

            WebElement nextButtonModal2 = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
            nextButtonModal2.click();

            WebElement emailInput = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
            emailInput.sendKeys("testemailforauto2@gmail.com");

            WebElement firstNameInput = driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]"));
            firstNameInput.sendKeys("Alexis Auto Two");

            WebElement lastNameInput = driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]"));
            lastNameInput.sendKeys("Carrillo");

            WebElement phoneNumberInput = driver.findElement(By.xpath("//input[contains(@placeholder,'Phone number')]"));
            phoneNumberInput.sendKeys("(305) 325-4566");

            WebElement nextButtonModal3 = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
            nextButtonModal3.click();

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
