package com.User.Management.Service.Exception;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvice {

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<?> handleGlobalException(GlobalException e) {
        return new ResponseEntity<>(e,e.getHttpStatus());
    }
}
