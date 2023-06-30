package ru.kluevja.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kluevja.parameter.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}