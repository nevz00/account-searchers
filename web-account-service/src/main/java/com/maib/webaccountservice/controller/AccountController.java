package com.maib.webaccountservice.controller;

import com.maib.account.ws.model.AccountResponse;
import com.maib.webaccountservice.services.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for working with accounts
 *
 * @author nevzorov
 *         19.04.2023 03:25
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/web/account")
@AllArgsConstructor
public class AccountController {

    /** Account Service */
    private final AccountService accountService;

    /**
     * Get accounts
     *
     * @return list of accounts
     */
    @GetMapping
    public AccountResponse getAccounts() {
        return accountService.getAccounts();
    }
}
