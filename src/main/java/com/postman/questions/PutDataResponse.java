package com.postman.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
public class PutDataResponse implements Question<Object> {
    @Override
    public Object answeredBy(Actor actor) {


        return SerenityRest.lastResponse().statusCode();
    }

    public static Question was(){
        return new PutDataResponse();
    }
}

