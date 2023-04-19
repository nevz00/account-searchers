package com.maib.reactweb.accountservice.repositories;

import com.maib.reactweb.accountservice.entity.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for working with accounts
 *
 * @author nevzorov
 *         19.04.2023 03:35
 */
@Repository
public interface AccountRepository extends ReactiveCrudRepository<Account, Long> {
}
