package com.postman.tasks;
/*
 * @(#) DeletePetTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.postman.Models.PostUser;
import com.postman.questions.BuilDataUserPUT;
import com.postman.utils.Data;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
public class DeleteTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        PostUser userInfo = actor.asksFor(BuilDataUserPUT.was());
        String endP= Data.extractURL().get(0).get("EndPP");
        String ID =Data.extractTo1().get(0).get("id");
        actor.attemptsTo(
                Delete.from(endP+"/"+ID)
                        .with(
                                requestSpecification -> requestSpecification
                                        .contentType(ContentType.JSON)
                        )
        );

    }

    public static DeleteTask on(){
        return instrumented(DeleteTask.class);

    }
}
