package com.alkemy.wallet.dto;

import com.alkemy.wallet.model.Role;
import lombok.Data;

@Data
public class UserDTO {
    Integer id;
    String firstName;
    String lastName;
    String email;
    String password;
    String creationDate;
    String updateDate;
    boolean softDelete;
    Role role;


}
