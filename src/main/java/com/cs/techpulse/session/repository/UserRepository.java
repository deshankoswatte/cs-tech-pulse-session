package com.cs.techpulse.session.repository;

import java.util.List;

import com.cs.techpulse.session.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByNameContaining(String name);

    User findByName(String name);
}
