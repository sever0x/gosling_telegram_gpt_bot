package com.sever0x.telegram_gpt_bot.repository;

import com.sever0x.telegram_gpt_bot.model.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Optional<Admin> findByUsername(String username);

    boolean existsByUsernameIgnoreCase(String username);
}