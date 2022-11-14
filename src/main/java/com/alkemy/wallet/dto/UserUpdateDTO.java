package com.alkemy.wallet.dto;

import lombok.Data;

@Data
public class UserUpdateDTO {
    Integer id;
    String firstName;
    String lastName;
    String password;
}
