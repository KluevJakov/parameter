package ru.kluevja.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kluevja.parameter.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}