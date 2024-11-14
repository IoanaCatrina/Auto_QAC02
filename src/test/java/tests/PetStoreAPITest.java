package tests;

import objectModels.Category;
import objectModels.PetModel;
import objectModels.Tag;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PetStoreAPITest extends BasePetStoreTest {
    PetModel pet;

    @BeforeTest
    public void prepareTest() {
        pet = new PetModel(25, new Category(1, "dog"), "Snoopy", List.of("https://www.google.com"),
                List.of(new Tag(1, "tag1")), "available");
    }

    @Test
    public void addNewPetOnStore() {
        PetModel addedPet = given().log().all().
                header("Content-Type", "application/json").
                header("Accept", "application/json").
                when().
                body(pet).
                post("/pet").
                then().
                statusCode(200).extract().body().jsonPath().getObject("", PetModel.class);

        System.out.println("Added pet:" + addedPet);
        Assert.assertEquals(addedPet.toString(), pet.toString());
    }

    @Test(dependsOnMethods = "addNewPetOnStore")
    public void getPetById() {
        PetModel extractPet = given().
                header("accept", "application/json").
                when().
                get("/pet/{petId}", 25).
                then().
                statusCode(200).extract().body().jsonPath().getObject("", PetModel.class);

        System.out.println("Pet by id: " + pet);
        Assert.assertEquals(pet.toString(), extractPet.toString());
    }

    @Test(dependsOnMethods = "addNewPetOnStore")
    public void findPetByStatus() {
        List<PetModel> extractPetList = given().log().all().
                header("Accept", "application/json").
                queryParam("status", "available").
                when().
                get("/pet/findByStatus").
                then().
                statusCode(200).extract().body().jsonPath().getList("", PetModel.class);

        Assert.assertTrue(isPetInList(extractPetList, pet));
    }

    private boolean isPetInList(List<PetModel> petList, PetModel pet) {
        for (PetModel p : petList) {
            if (p.getId() == pet.getId()) {
                return true;
            }
        }
        return false;
    }
}

