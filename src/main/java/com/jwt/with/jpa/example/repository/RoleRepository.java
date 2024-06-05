package com.jwt.with.jpa.example.repository;

import java.util.Optional;

import com.jwt.with.jpa.example.security.login.models.ERole;
import com.jwt.with.jpa.example.security.login.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
