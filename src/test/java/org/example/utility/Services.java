package org.example.utility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Services {
    // CURD operation for API
    // to perform the action

    String jsonBody = "{\n" +
            "  \"id\": 456,\n" +
            "  \"category\": {\n" +
            "    \"id\": 99,\n" +
            "    \"name\": \"Desi\"\n" +
            "  },\n" +
            "  \"name\": \"KIKI\",\n" +
            "  \"photoUrls\": [\n" +
            "    \"string\"\n" +
            "  ],\n" +
            "  \"tags\": [\n" +
            "    {\n" +
            "      \"id\": 0,\n" +
            "      \"name\": \"string\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"status\": \"available\"\n" +
            "}";
    public Response postPet(){
        return given().contentType(ContentType.JSON)
                .and()
                .body(jsonBody)
                .when()
                .post("/pet");

    }
    public Response getPet(){
        return given().contentType(ContentType.JSON)
                .and()
                .body(jsonBody)
                .when()
                .get("pet/45"); // 404

    }

    public Response deletePet(){
        return given().contentType(ContentType.JSON)
                .when()
                .delete("/pet/456");
    }
}
