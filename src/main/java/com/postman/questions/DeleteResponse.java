package com.postman.questions;
/*
 * @(#) DeleteResponse.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */



import com.postman.Models.Delete.PostUserDelete;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
public class DeleteResponse implements Question<PostUserDelete> {

    @Override
    public PostUserDelete answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(PostUserDelete.class);
    }

    public static DeleteResponse was(){
        return new DeleteResponse();
    }
}
