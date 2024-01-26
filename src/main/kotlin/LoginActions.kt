import org.openqa.selenium.WebDriver

class LoginActions(private val driver: WebDriver, private val loginTestData: LoginTestData.Companion) {

    private val actions: Actions = Actions(driver)

    fun login() {
        driver.get(LoginTestData.url)
        actions.clickElementByText(LoginTestData.additional)
        actions.clickElementByText(LoginTestData.redirect)
        actions.sendKeysToElementByName("login", LoginTestData.username)
        actions.sendKeysToElementByName("password", LoginTestData.password)
        actions.clickElementByText(LoginTestData.loginBtn)
        Thread.sleep(5000)
    }

    fun startDay() {
        actions.clickElementByText(LoginTestData.startDayBtn)
        actions.expectElementExist(LoginTestData.endDayBtn)
    }

    fun endDay() {
        actions.clickElementByText(LoginTestData.endDayBtn)
        actions.expectElementExist(LoginTestData.startDayBtn)
    }
}