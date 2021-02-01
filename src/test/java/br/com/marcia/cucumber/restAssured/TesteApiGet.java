package br.com.marcia.cucumber.restAssured;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class TesteApiGet {

    private int pagina;

    private String baseURI;

    @Dado("^que eu possua uma uri get$")
    public void que_eu_possua_uma_uri_get() throws Throwable {
        baseURI = "https://reqres.in/api/users";
    }

    @Quando("^informo a pagina (\\d+)$")
    public void informo_a_pagina_2(Integer page) throws Throwable {
        pagina = page;
    }

    @Entao("^deve ser retornado o first_name \"(.*?)\" e \"(.*?)\"$")
    public void deve_ser_retornado_o_first_name_Michael_e_(String michael, String rachel) throws Throwable {
        given().
            params("page", pagina).
        when().
            get(baseURI).
        then().
            body("data.first_name", hasItems(michael, rachel));
    }

    // Testando de forma fixa
    /*
    @Entao("^deve ser retornado o first_name \"Michael\" e \"Rachel\"$")
    public void deve_ser_retornado_o_first_name_Michael_e_Rachel() throws Throwable {
        given().
            params("page", pagina).
        when().
            get(baseURI).
        then().
            statusCode(200).
            body( "data.first_name", hasItems("Michael", "Rachel"));
    }
    */


}
