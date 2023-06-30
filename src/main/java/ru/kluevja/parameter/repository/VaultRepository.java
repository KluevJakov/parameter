package ru.kluevja.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kluevja.parameter.entity.Vault;

public interface VaultRepository extends JpaRepository<Vault, Long> {
}