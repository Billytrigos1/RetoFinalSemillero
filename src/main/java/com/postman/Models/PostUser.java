package com.postman.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;

/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostUser {

    @JsonProperty("email")
     public String email;

      @JsonProperty("username")
       public String username;

        @JsonProperty("password")
         public String password;

          @JsonProperty("name")
           public Nombres name;

            @JsonProperty("address")
             public Address address;

              @JsonProperty("phone")
               public String phone;

}