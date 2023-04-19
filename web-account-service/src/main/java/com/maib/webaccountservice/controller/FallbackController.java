package com.maib.webaccountservice.controller;

import com.maib.account.ws.model.AccountErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для обработки ошибок
 *
 * @author nevzorov
 *         19.04.2023 04:31
 */
@RestController
public class FallbackController {

    @RequestMapping("/**")
    public ResponseEntity<?> handleFallback() {
        AccountErrorDto errorResponse = new AccountErrorDto();
        errorResponse.setError("Requested resource not found");
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
