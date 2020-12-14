package com.minsui.apis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.minsui.apis.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
