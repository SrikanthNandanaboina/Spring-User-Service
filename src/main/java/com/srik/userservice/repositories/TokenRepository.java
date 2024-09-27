package com.srik.userservice.repositories;

import com.srik.userservice.models.Token;
import com.srik.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByValueAndDeletedAndExpiryAtGreaterThan(String value, Boolean deleted, Date date);
    Optional<Token> findByValueAndDeleted(String value, Boolean deleted);
}
