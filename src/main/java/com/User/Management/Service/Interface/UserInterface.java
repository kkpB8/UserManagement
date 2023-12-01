package com.User.Management.Service.Interface;

import com.User.Management.Service.DTO.UserRequestData;
import com.User.Management.Service.DTO.UserResponseDto;

public interface UserInterface {

    UserResponseDto saveUser(UserRequestData userRequestData,String txnId);

}
