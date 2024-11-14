package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import utils.APIServicesNames;

public class BaseRestCountriesTest extends BaseControllerTest {

    @BeforeClass
    public void setUP() {
        super.getBaseURL(APIServicesNames.RESTCOUNTRIES);
        System.out.println("Use this baseURL for rest countries: " + baseURL);
//        set baseURL for RestAssured
       setRestAssuredBaseURI();
    }
}
