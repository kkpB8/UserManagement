package com.User.Management.Service.Interface;

import com.User.Management.Service.DTO.UserRequestData;
import com.User.Management.Service.DTO.UserResponseDto;
import com.User.Management.Service.Exception.GlobalException;

public interface UserInterface {

    UserResponseDto saveUser(UserRequestData userRequestData,String txnId) throws GlobalException;

}
