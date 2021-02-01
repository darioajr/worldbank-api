package br.com.bb.worldbank.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class IndicatorResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/v1/indicator")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}