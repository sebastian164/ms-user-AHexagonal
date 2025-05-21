package com.pragma.user.infrastructure.out.jpa.repository;

import com.pragma.user.infrastructure.out.jpa.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Long> {
}
