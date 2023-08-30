package com.postman.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Nombres {

    @JsonProperty("firstname")
     public String firstname;
      @JsonProperty("lastname")
       public String lastname;
}
