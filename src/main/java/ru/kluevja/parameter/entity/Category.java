package ru.kluevja.parameter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "categories")
public class Category {
    @Id
    @SequenceGenerator(name = "cat_seq", sequenceName = "cat_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @Enumerated(value = EnumType.ORDINAL)
    private OperationType operationType;
    @ManyToOne
    private Category parentCategory;
}
