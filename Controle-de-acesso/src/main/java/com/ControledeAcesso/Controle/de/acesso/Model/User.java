package com.ControledeAcesso.Controle.de.acesso.Model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    @Column
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkingDay workingDay;
    @Column
    private BigDecimal tolerance;
    @Column
    private LocalDateTime startworkingday;
    @Column
    private LocalDateTime endworkday;
}
