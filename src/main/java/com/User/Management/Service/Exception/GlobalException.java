package com.User.Management.Service.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;


/**
 * This will the exception we will use For all of them
 */
@Data
@AllArgsConstructor
public class GlobalException  extends Exception{

    private String function;
    private Integer status;
    private String message;
    private HttpStatus httpStatus;


}
