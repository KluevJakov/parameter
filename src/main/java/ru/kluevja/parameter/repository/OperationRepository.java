package ru.kluevja.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kluevja.parameter.entity.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}