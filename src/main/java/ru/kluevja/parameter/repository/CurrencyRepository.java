package ru.kluevja.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kluevja.parameter.entity.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}