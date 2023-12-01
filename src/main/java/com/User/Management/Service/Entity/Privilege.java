package com.User.Management.Service.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "privilege")
@Data
@RequiredArgsConstructor
public class Privilege {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,name = "name")
    public String name;




}
