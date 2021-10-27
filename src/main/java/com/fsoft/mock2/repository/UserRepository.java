package com.fsoft.mock2.repository;

import com.fsoft.mock2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //tai sao no lai hoat dong?
    User findByEmail(String email);
}
