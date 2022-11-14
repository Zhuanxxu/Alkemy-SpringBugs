package com.alkemy.wallet.service;

import com.alkemy.wallet.dto.AccountDTO;
import com.alkemy.wallet.dto.AccountDTOSlim;
import com.alkemy.wallet.dto.AccountPageDTO;

import java.util.List;
import java.util.Map;

public interface IAccountService {
    AccountDTO createAccount(int userId, String currency);

    AccountDTO createAccountWithToken(String token, String currency);

    List<AccountDTO> getAccountsByUser(Integer id);

    List<AccountDTOSlim> getAccount(Integer user_id);

    // List<AccountDTO> getAccountsByUser(Integer id);

    Map<String, Object> getAccounts();

    AccountPageDTO getAccountsByPage(Integer page);
}