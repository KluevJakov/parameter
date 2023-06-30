package ru.kluevja.parameter.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @SequenceGenerator(name = "role_seq", sequenceName = "role_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String code;

    @Override
    public String getAuthority() {
        return name;
    }
}
