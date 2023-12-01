package com.User.Management.Service.AuthConfig;

import com.User.Management.Service.Entity.UserEntity;
import com.User.Management.Service.Exception.GlobalException;
import com.User.Management.Service.Repo.UserRepo;
import com.User.Management.Service.Util.StatusInteger;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private UserRepo userRepo;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      UserEntity userEntity= userRepo.findByUserName(username).get();
              if(userEntity==null){
              new GlobalException("loadUserByUsername", StatusInteger.EmptyData,"Invalid UserName", HttpStatus.UNAUTHORIZED);
              };
        return null;
    }
}
