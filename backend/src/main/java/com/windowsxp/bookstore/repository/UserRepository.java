package com.windowsxp.bookstore.repository;

import com.windowsxp.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsernameAndPassword(String username, String password);

    <T> List<T> findAllProjectionsBy(Class<T> type);
}