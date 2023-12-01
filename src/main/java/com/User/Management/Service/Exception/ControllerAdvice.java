package com.User.Management.Service.Exception;



import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvice {
    Logger logger = LoggerFactory.getLogger(ControllerAdvice.class);

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<?> handleGlobalException(GlobalException e) {
        logger.error("Exception on {} with message {} ",e.getFunction(),e.getMessage());
        return new ResponseEntity<>(e,e.getHttpStatus());
    }
}
