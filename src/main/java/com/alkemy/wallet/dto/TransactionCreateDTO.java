package com.alkemy.wallet.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class TransactionCreateDTO {


    Double amount;


    String description;

    @NotNull
    Integer account_id;


    public TransactionCreateDTO(Double amount, String description, Integer account_id) {
        this.amount = amount;
        this.description = description;
        this.account_id = account_id;
    }

    public TransactionCreateDTO() {
    }
}
