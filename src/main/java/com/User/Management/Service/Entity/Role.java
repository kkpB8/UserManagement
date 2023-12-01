package com.User.Management.Service.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "role")
@Data
@RequiredArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,name = "name")
    public String name;

    @ManyToMany
    @JoinTable(
            name = "role_privilege",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "privilege_id"))
    public List<Privilege> privileges;
}
