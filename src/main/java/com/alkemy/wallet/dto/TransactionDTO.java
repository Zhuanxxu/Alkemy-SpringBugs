package com.alkemy.wallet.dto;

import com.alkemy.wallet.enumeration.TypeList;
import lombok.Data;

import java.time.Instant;

@Data
public class TransactionDTO {

    Double amount;

    TypeList type;

    String description;

    Instant transactionDate;

    Integer account_id;

}
