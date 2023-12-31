package com.User.Management.Service.Service;

import com.User.Management.Service.DTO.UserRequestData;
import com.User.Management.Service.DTO.UserResponseDto;
import com.User.Management.Service.Exception.GlobalException;
import com.User.Management.Service.Interface.UserInterface;
import com.User.Management.Service.Repo.UserRepo;
import com.User.Management.Service.ServiceApplication;
import com.User.Management.Service.Util.StatusInteger;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserInterface {

    Logger logger = LoggerFactory.getLogger(ServiceApplication.class);

    private final UserRepo userRepo;

    @Override
    public UserResponseDto saveUser(UserRequestData userRequestData,String txnId) throws GlobalException {
        logger.info("Process SaveUser:{}",txnId);
        if(userRequestData==null){
            throw new GlobalException("saveUser", StatusInteger.EmptyData,"Empty Request Data", HttpStatus.BAD_REQUEST);
        }
        UserResponseDto userResponseDto=new UserResponseDto();

        logger.info("TxnId :{} Response SaveUser:{}",txnId,userResponseDto);
        return userResponseDto;
    }


}
