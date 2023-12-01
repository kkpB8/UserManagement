package com.User.Management.Service.Interface;

import com.User.Management.Service.DTO.LoginRequest;
import com.User.Management.Service.DTO.LoginResponse;
import com.User.Management.Service.Exception.GlobalException;


public interface AuthInterface {
    LoginResponse authRequest(LoginRequest authRequestDto,String txnId) throws GlobalException;

}
