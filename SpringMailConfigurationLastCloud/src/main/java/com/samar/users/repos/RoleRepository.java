package com.samar.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.samar.users.entities.Role;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("select r from Role r where r.role = ?1")
    Role findByRole(String role);

    List<Role> findAll();

    @Query("select r from Role r where r.role_id = ?1")
    Role findRoleById(Long id);
}
