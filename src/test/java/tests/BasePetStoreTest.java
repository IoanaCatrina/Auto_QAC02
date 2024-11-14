package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import utils.APIServicesNames;

public class BasePetStoreTest extends BaseControllerTest {

    @BeforeClass
    public void setUP() {
        super.getBaseURL(APIServicesNames.PETSTORE);
        System.out.println("Use this baseURL for Pet Store: " + baseURL);
//        set baseURL for RestAssured
        setRestAssuredBaseURI();
    }
}
