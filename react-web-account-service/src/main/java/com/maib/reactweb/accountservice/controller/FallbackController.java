package com.maib.reactweb.accountservice.controller;

import com.maib.account.ws.model.AccountErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Контроллер для обработки ошибок
 *
 * @author nevzorov
 *         19.04.2023 03:31
 */
@RestController
public class FallbackController {

    @RequestMapping("/**")
    public Mono<ResponseEntity<?>> handleFallback() {
        AccountErrorDto errorResponse = new AccountErrorDto();
        errorResponse.setError("Requested resource not found");
        return Mono.just(new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND));
    }
}
