package org.akash;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

@QuarkusTest
public class ExampleResourceTest {

    @Inject
    FakeGreetingService fakeGreetingService;

    /*@Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("hello, how're you? How fast will this update?"));
    }*/

    @Test
    public void testGreetingEndPoint(){
        String uuid = UUID.randomUUID().toString();
        given()
          .pathParam("name", uuid)
          .when().get("/greeting/{name}")
          .then()
            .statusCode(200)
            .body(is(fakeGreetingService.getOutput()));
    }

}