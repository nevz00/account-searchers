DROP TABLE IF EXISTS account;
CREATE TABLE account (
       id bigint NOT NULL,
       account_number varchar(20),
       account_balance numeric(19, 2),
       currency varchar(3),
       last_oper_date timestamp,
       PRIMARY KEY (id)
);

INSERT INTO account (id, account_number, account_balance, currency, last_oper_date)
VALUES
    (1, '422331234567890', 1000.00, 'USD', NOW()),
    (2, '422440987654321', 500.00, 'EUR', NOW()),
    (3, '424212468135790', 750.00, 'AED', NOW()),
    (4, '412441357924680', 250.00, 'IDR', NOW());