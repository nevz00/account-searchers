package com.maib.webaccountservice.utils;

import com.maib.account.ws.model.AccountDto;
import com.maib.webaccountservice.entity.Account;
import org.springframework.beans.BeanUtils;

/**
 * Utils for working with entities and DTOs
 *
 * @author nevzorov
 *         19.04.2023 04:12
 */
public final class EntityDtoUtils {

    /**
     * Convert account entity to account DTO
     *
     * @param account account entity
     * @return account DTO
     */
    public static AccountDto toAccountDto(Account account) {
        AccountDto accountDto = new AccountDto();
        BeanUtils.copyProperties(account, accountDto);
        return accountDto;
    }

    private EntityDtoUtils() {
    }
}
