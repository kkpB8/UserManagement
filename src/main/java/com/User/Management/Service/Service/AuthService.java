package com.User.Management.Service.Service;

import com.User.Management.Service.DTO.LoginRequest;
import com.User.Management.Service.DTO.LoginResponse;
import com.User.Management.Service.Exception.GlobalException;
import com.User.Management.Service.Interface.AuthInterface;
import com.User.Management.Service.Repo.UserRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class AuthService  implements AuthInterface {

    private UserRepo userRepo;


    @Override
    public LoginResponse authRequest(LoginRequest authRequestDto,String txnId) throws GlobalException {
        return null;
    }
}
