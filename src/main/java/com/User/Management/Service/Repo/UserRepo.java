package com.User.Management.Service.Repo;

import com.User.Management.Service.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface UserRepo extends JpaRepository<UserEntity,Long> {

    Optional<UserEntity> findByUserName(String userName);
}
