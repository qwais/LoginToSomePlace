
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.Assert.assertTrue

class Actions(private val driver: WebDriver) {

    private val wait = WebDriverWait(driver, 10)

    fun clickElementByText(text: String) {
        val element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), '$text')]")))
        element.click()
    }

    fun sendKeysToElementByName(name: String, keys: String) {
        val element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)))
        element.sendKeys(keys)
    }

    fun expectElementExist(element: String) {
        val successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '$element')]")))
        assertTrue(successElement.isDisplayed)
    }
}