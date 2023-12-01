package com.User.Management.Service.Controller;


import com.User.Management.Service.DTO.LoginRequest;
import com.User.Management.Service.DTO.Request.RequestData;
import com.User.Management.Service.DTO.Response.ResponseData;
import com.User.Management.Service.DTO.UserRequestData;
import com.User.Management.Service.Exception.GlobalException;
import com.User.Management.Service.Interface.AuthInterface;
import com.User.Management.Service.Util.CommonString;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(CommonString.Api+CommonString.Login)
@AllArgsConstructor
public class LoginController {

    private final AuthInterface authInterface;

    @PostMapping
    public ResponseEntity<ResponseData> saveUserList(@RequestBody RequestData<LoginRequest> loginRequest) throws GlobalException {
        return new ResponseEntity<>(new ResponseData( authInterface.authRequest(loginRequest.getRequest(),loginRequest.getTxnId()),CommonString.Login_success,loginRequest.getTxnId()), HttpStatus.OK);
    }

}
