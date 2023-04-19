package com.maib.webaccountservice.repositories;

import com.maib.webaccountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for working with accounts
 *
 * @author nevzorov
 *         19.04.2023 03:47
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
}
