package com.ictak.practice.repository;

import com.ictak.practice.dbmodels.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity login();
}
