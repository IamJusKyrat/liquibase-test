package com.test.libraryliquibase.repository;

import com.test.libraryliquibase.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
