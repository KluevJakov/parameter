package ru.kluevja.parameter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Table(name = "currency")
public class Currency {
    @Id
    @SequenceGenerator(name = "currency_seq", sequenceName = "currency_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String code;
}
