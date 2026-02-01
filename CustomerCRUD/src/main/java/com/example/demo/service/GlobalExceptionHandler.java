package com.example.demo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.InvalidIdNumber;
import com.example.demo.exception.InvalidMobileNumber;

@ControllerAdvice
public class GlobalExceptionHandler {

    // All exception problems will be handled here

    @ExceptionHandler(InvalidMobileNumber.class)
    public ResponseEntity<?> invalidMobileNumber(InvalidMobileNumber e) {
        return ResponseEntity
                .status(HttpStatus.UNPROCESSABLE_CONTENT)
                .body(e.getMessage());
    }
        @ExceptionHandler(InvalidIdNumber.class)
        public ResponseEntity<?> invalidIdNumber(InvalidIdNumber e) {
            return ResponseEntity
                    .status(HttpStatus.UNPROCESSABLE_CONTENT)
                    .body(e.getMessage());
    }
     
        
        
}