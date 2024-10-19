package tests;

import objectModels.LoginModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginDataSourceTest extends BaseTest {


    @Test(dataProvider = "loginJsonDataProvider", dataProviderClass = dataProviders.LoginDataProvider.class)
    public void loginWithJsonDataSource(LoginModel loginModel) {
        loginWithLoginModel(loginModel);
    }


    @Test(dataProvider = "loginXMLDataProvider", dataProviderClass = dataProviders.LoginDataProvider.class)
    public void loginWithXMLDataSource(LoginModel loginModel) {
        loginWithLoginModel(loginModel);
    }


    @Test(dataProvider = "loginCSVDataProvider", dataProviderClass = dataProviders.LoginDataProvider.class)
    public void loginWithCSVDataSource(LoginModel loginModel) {
        loginWithLoginModel(loginModel);
    }

    @Test(dataProvider = "loginSQLDataProvider", dataProviderClass = dataProviders.LoginDataProvider.class)
    public void loginWithSQLDataSource(LoginModel loginModel) {
        loginWithLoginModel(loginModel);
    }


    protected void loginWithLoginModel(LoginModel loginModel) {
        setUP();
        navigateToURL("/?page=login");

        LoginPage loginPage = new LoginPage(driver);
        System.out.println(loginModel);
        loginPage.login(loginModel.getAccount().getUsername(), loginModel.getAccount().getPassword());

        if (loginModel.getLoginErr().isEmpty()) {
            System.out.println("Verify login successful");
            Assert.assertTrue(loginPage.verifyLoginSuccessful(loginModel.getAccount().getUsername()));
        } else {
            System.out.println("Verify login failed with message: " + loginModel.getLoginErr());
            Assert.assertTrue(loginPage.verifyLoginFailed(loginModel.getLoginErr()));
        }
    }
}
