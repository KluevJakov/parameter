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
@Table(name = "operations")
public class Operation {
    @Id
    @SequenceGenerator(name = "operation_seq", sequenceName = "operation_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "operation_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private int value;
    private Date date;
    @Enumerated(value = EnumType.ORDINAL)
    private OperationType operationType;
    @ManyToOne
    private Category category;
}
