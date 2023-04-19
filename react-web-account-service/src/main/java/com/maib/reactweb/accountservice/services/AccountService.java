package com.maib.reactweb.accountservice.services;

import com.maib.account.ws.model.AccountResponse;
import com.maib.reactweb.accountservice.repositories.AccountRepository;
import com.maib.reactweb.accountservice.utils.EntityDtoUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

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
    public Mono<AccountResponse> getAccounts() {
        return accountRepository.findAll()
                .map(EntityDtoUtils::toAccountDto)
                .collectList()
                .map(accountDtoList -> new AccountResponse().accounts(accountDtoList));
    }
}
