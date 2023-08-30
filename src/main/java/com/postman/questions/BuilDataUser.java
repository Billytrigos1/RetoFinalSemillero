package com.postman.questions;

import com.postman.Models.Geolocation;
import com.postman.Models.Nombres;
import com.postman.Models.PostUser;
import com.postman.Models.Address;
import com.postman.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
public class BuilDataUser  implements Question<PostUser> {



    @Override
    public PostUser answeredBy(Actor actor) {
        Map<String, String> data = Data.extractTo().get(0);



        Address addreess= Address.builder()

                .city("kilcoole")
                .street("7835 new road")
                .number(3)
                .zipcode("12926-3874")
                .build();

        Nombres name1= Nombres.builder()
                .firstname(data.get("name"))
                .lastname(data.get("Lastname"))
                .build();



        PostUser postUser= PostUser.builder()
                .email(data.get("email"))
                .username(data.get("username"))
                .password(data.get("password"))

                .address(addreess)
                .name(name1)
                .phone(data.get("phone"))
                .build();

        Geolocation geolocation= Geolocation.builder()
                 .lat("-37.3159")
                 ._long("81.1496")
                .build();

        return postUser;
    }


    public static BuilDataUser was(){
        return  new BuilDataUser();
    }

}



