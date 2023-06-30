package ru.kluevja.parameter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "vault")
public class Vault {
    @Id
    @SequenceGenerator(name = "vault_seq", sequenceName = "vault_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vault_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int value;
    @ManyToOne
    private Currency currency;
    @ManyToOne
    private User owner;
}
