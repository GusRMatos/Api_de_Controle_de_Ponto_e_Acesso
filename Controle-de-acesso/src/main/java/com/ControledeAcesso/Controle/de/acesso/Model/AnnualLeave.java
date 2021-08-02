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
public class AnnualLeave {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class AnnualLeaveId implements Serializable {

        private long idannualleave;
        private long idmovement;
        private long iduser;
    }

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private AnnualLeaveId id;
    @Column
    private LocalDateTime dateworked;
    @Column
    private BigDecimal numberhoursworked;
    @Column
    private BigDecimal balancehoursworked;

}
