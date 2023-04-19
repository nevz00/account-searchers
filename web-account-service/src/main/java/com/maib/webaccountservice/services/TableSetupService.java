package com.maib.webaccountservice.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * Table setup service
 *
 * @author nevzorov
 *         19.04.2023 04:37
 */
@Service
public class TableSetupService implements CommandLineRunner {

    @Value("classpath:db/init.sql")
    private Resource initSql;

    /** Datasource for interact with DB */
    private final DataSource dataSource;

    public TableSetupService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(String... args) throws Exception {
        try (var conn = dataSource.getConnection()) {
            ScriptUtils.executeSqlScript(conn, initSql);

            System.out.println("Account table initialized successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
