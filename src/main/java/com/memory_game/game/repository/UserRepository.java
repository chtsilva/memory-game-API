package com.memory_game.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.memory_game.game.model.User;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {

}