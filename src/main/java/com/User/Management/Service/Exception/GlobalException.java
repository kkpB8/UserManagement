package com.User.Management.Service.Exception;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


/**
 * This will the exception we will use For all of them
 */
@Data
@RequiredArgsConstructor
public class GlobalException  extends Exception{

    private Integer status;
    private String message;
    private Object data;
    private HttpStatus httpStatus;

}
