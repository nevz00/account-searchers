package com.maib.webaccountservice.services;

import com.maib.account.ws.model.AccountDto;
import com.maib.account.ws.model.AccountResponse;
import com.maib.webaccountservice.entity.Account;
import com.maib.webaccountservice.repositories.AccountRepository;
import com.maib.webaccountservice.utils.EntityDtoUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service for working with accounts
 *
 * @author nevzorov
 *         19.04.2023 03:43
 */
@Service
@AllArgsConstructor
public class AccountService {

    /** Repository for working with accounts */
    private final AccountRepository accountRepository;

    /**
     * Get all accounts
     *
     * @return all accounts
     */
    public AccountResponse getAccounts() {
        List<Account> accountList = accountRepository.findAll();
        List<AccountDto> accountDtos = accountList.stream()
                .map(EntityDtoUtils::toAccountDto)
                .collect(Collectors.toList());
        AccountResponse response = new AccountResponse();
        response.setAccounts(accountDtos);
        return response;
    }
}
