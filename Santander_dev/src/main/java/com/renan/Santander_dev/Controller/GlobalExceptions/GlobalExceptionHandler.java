package com.renan.Santander_dev.Controller.GlobalExceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<String> handleIllegalAccessException(IllegalAccessException illegalAccessException) {
        return new ResponseEntity<>(illegalAccessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchFieldError.class)
    public ResponseEntity<String> handleNoSuchFieldError(NoSuchFieldError noSuchFieldError) {
        return new ResponseEntity<>(noSuchFieldError.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)  // Using a more general Exception class here
    public ResponseEntity<String> handleException(Throwable exception) {
        String message = "Unexpected error, see logs";
        logger.error(message, exception); // Logging the exception along with the message
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
