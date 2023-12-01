package com.User.Management.Service.Controller;


import com.User.Management.Service.DTO.Request.RequestData;
import com.User.Management.Service.DTO.Response.ResponseData;
import com.User.Management.Service.DTO.UserRequestData;
import com.User.Management.Service.DTO.UserResponseDto;
import com.User.Management.Service.Interface.UserInterface;
import com.User.Management.Service.Util.CommonString;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController(CommonString.Api+CommonString.User)
@AllArgsConstructor
public class UserController {

    private final UserInterface userInterface;



    @PostMapping
    public ResponseEntity<ResponseData> saveUserList(@RequestBody RequestData<UserRequestData> userRequest){
        return new ResponseEntity<>(new ResponseData( userInterface.saveUser(userRequest.getRequest(),userRequest.getTxnId()),"Save User SuccessFull",userRequest.getTxnId()), HttpStatus.OK);
    }


}
