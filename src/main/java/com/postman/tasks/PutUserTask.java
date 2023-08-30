package com.postman.tasks;

import com.postman.Models.PostUser;
import com.postman.questions.BuilDataUserPUT;
import com.postman.utils.Data;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutUserTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        PostUser userInfo = actor.asksFor(BuilDataUserPUT.was());
        String endP= Data.extractURL().get(0).get("EndPP");
        String ID =Data.extractTo1().get(0).get("id");
        actor.attemptsTo(
                Put.to(endP+"/"+ID)
                        .with(
                                requestSpecification -> requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body(userInfo)
                        )
        );


    }

    public static Performable on(){
        return instrumented(PutUserTask.class);
    }
}
