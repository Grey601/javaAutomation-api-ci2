package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanEchoTest {

    @Test
    public void shouldPostToPostman() {
        // Given - When - Then
        // Предусловия
        given()
           .baseUri("https://postman-echo.com")
           .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
           .post("/post")
        // Проверки
        .then()
           .statusCode(200)
           .body("data", equalTo("some data"));
    }

    @Test
    public void shouldPostId() {
        // Given - When - Then
        // Предусловия
        given()
            .baseUri("https://postman-echo.com")
            .body("id:1") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
            .post("/post")
        // Проверки
        .then()
            .statusCode(200)
            .body("data", equalTo("id:1"));
    }

    @Test
    public void shouldPostName() {
        // Given - When - Then
        // Предусловия
        given()
            .baseUri("https://postman-echo.com")
            .body("name:Grigory") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
            .post("/post")
        // Проверки
        .then()
            .statusCode(200)
            .body("data", equalTo("name:Grigory"));
    }

    @Test
    public void shouldPostNumber() {
        // Given - When - Then
        // Предусловия
        given()
            .baseUri("https://postman-echo.com")
            .body("number:13") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
            .post("/post")
        // Проверки
        .then()
            .statusCode(200)
            .body("data", equalTo("number:13"));
    }

    @Test
    public void shouldPostBalance() {
        // Given - When - Then
        // Предусловия
        given()
            .baseUri("https://postman-echo.com")
            .body("balance:2500") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
            .post("/post")
        // Проверки
        .then()
            .statusCode(200)
            .body("data", equalTo("balance:2500"));
    }

    @Test
    public void shouldPostCurrency() {
        // Given - When - Then
        // Предусловия
        given()
            .baseUri("https://postman-echo.com")
            .body("currency:USD") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
            .post("/post")
        // Проверки
        .then()
            .statusCode(200)
            .body("data", equalTo("currency:USD"));
    }

}
