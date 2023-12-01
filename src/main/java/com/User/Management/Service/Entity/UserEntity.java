package com.User.Management.Service.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,name = "first_name")
    public String firstName;

    @Column(name = "middle_name")
    public String middleName;

    @Column(nullable = false,name = "last_name")
    public String lastName;

    @Column(nullable = false, unique = true,name = "email")
    public String email;

    @Column(nullable = false, unique = true,name = "mobile_number")
    public String mobileNo;
    @Column(nullable = false, unique = true,name = "User_Name")
    public String userName;

    @JsonIgnore
    @Column(nullable = false,name = "password")
    public String password;

    @JsonIgnore
    @Column(name = "salt")
    private String salt;
}
