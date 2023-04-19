package com.maib.reactweb.accountservice.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;

/**
 * Table setup service
 *
 * @author nevzorov
 *         19.04.2023 03:43
 */
@Service
public class TableSetupService implements CommandLineRunner {

    @Value("classpath:db/init.sql")
    private Resource initSql;

    private final R2dbcEntityTemplate entityTemplate;

    /** The R2dbcEntityTemplate is used to interact with the database */
    public TableSetupService(R2dbcEntityTemplate entityTemplate) {
        this.entityTemplate = entityTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        String query = StreamUtils.copyToString(initSql.getInputStream(), StandardCharsets.UTF_8);
        System.out.println(query);
        this.entityTemplate
                .getDatabaseClient()
                .sql(query)
                .then()
                .subscribe();
    }
}
