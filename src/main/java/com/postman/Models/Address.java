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
public class Address {

    @JsonProperty("city")
    public String city;
     @JsonProperty("street")
      public String street;
       @JsonProperty("number")
        public Integer number;
          @JsonProperty("zipcode")
            public String zipcode;
             @JsonProperty("geolocation")
              public Geolocation geolocation;
}
