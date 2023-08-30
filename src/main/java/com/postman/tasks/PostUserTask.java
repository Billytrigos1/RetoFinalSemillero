package com.postman.tasks;

import com.postman.Models.PostUser;
import com.postman.questions.BuilDataUser;
import com.postman.utils.Data;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;
/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
public class PostUserTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        PostUser userInfo = actor.asksFor(BuilDataUser.was());
        String endP= Data.extractURL().get(0).get("EndPP");
        actor.attemptsTo(
                Post.to(endP).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(userInfo)
                )
        );
    }

    public static PostUserTask on() {
        return instrumented(PostUserTask.class);
    }
}



