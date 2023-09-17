package com.max.jwt.db.user.repository;

import com.max.jwt.db.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query(
            value = "SELECT * FROM Users u WHERE u.username = ?1",
            nativeQuery = true
    )
    User findUserByUsername(String username);

}
