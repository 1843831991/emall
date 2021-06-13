package com.wzvtc.emall.Repository;

import com.wzvtc.emall.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
