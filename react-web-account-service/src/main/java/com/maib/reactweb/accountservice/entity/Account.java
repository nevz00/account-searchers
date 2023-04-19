package com.maib.reactweb.accountservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity for account
 *
 * @author nevzorov
 *         19.04.2023 03:38
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    private Long id;
    private String accountNumber;
    private BigDecimal accountBalance;
    private String currency;
    private LocalDateTime lastOperDate;
}
