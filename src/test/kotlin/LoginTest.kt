import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class LoginTest {

    private lateinit var driver: WebDriver
    private lateinit var loginActions: LoginActions
    private val loginTestData = LoginTestData

    @BeforeTest
    fun setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver")
        driver = ChromeDriver()
        loginActions = LoginActions(driver, loginTestData)
        loginActions.login()
    }

    @Test
    fun testStartDay() {
        loginActions.startDay()
    }

    @Test
    fun testEndDay() {
        loginActions.endDay()
    }

    @AfterTest
    fun tearDown() {
        driver.quit()
    }
}