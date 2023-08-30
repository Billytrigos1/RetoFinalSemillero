package com.postman.Models.Delete;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.postman.Models.Address;
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
public class PostUserDelete {

    @JsonProperty("address")
    public Address address;

    @JsonProperty("id")
    public Integer id;

    @JsonProperty("email")
    public String email;

    @JsonProperty("username")
    public String username;

    @JsonProperty("password")
    public String password;

    @JsonProperty("name")
    public Name name;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("v")
    public Integer v;
}
