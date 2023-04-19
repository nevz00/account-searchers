package com.maib.webaccountservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity for account
 *
 * @author nevzorov
 *         19.04.2023 03:38
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
public class Account {

    @Id
    @SequenceGenerator(
            name = "account_id_sequence",
            sequenceName = "account_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_id_sequence"
    )
    private Long id;
    @Column(length = 20)
    private String accountNumber;
    private BigDecimal accountBalance;
    @Column(length = 3)
    private String currency;
    private LocalDateTime lastOperDate;
}
