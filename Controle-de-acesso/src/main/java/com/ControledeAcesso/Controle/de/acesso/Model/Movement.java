package com.ControledeAcesso.Controle.de.acesso.Model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
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
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class Movementid implements Serializable {
        private long idmovement;
        private long iduser;
    }

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Movementid id;
    @Column
    private LocalDateTime dateentry;
    @Column
    private LocalDateTime exitdate;
    @Column
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
