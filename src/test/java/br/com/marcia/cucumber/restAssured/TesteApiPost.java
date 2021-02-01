package br.com.marcia.cucumber.restAssured;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.StringContains.containsString;

public class TesteApiPost {

    private String myJson;

    private String baseURI;

    @Dado("^que eu possua uma uri$")
    public void que_eu_possua_uma_uri() throws Throwable {
        baseURI = "https://reqres.in/api/login";
    }

    @Quando("^informo email$")
    public void informo_email() throws Throwable {
        myJson = "{\"email\":\"eve.holt@reqres.in\",\"password\": \"cityslicka\"}";
    }

    @E("^senha$")
    public void senha() throws Throwable {
    }


    @Entao("^deve ser retornado o status '200'$")
    public void deve_ser_retornado_o_status_200() throws Throwable {
    }

    @E("^o token \"(.*?)\"$")
    public void o_token_(String token) throws Throwable {
        given().
            contentType(ContentType.JSON).
            body(myJson).
        when().
            post(baseURI).
        then().
            statusCode(200).
            body("token", containsString(token));
    }

}
