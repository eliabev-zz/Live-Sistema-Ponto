package com.one.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BancoHoras {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;

    }
    @Id
    @EmbeddedId
    private BancoHorasId id;

//    private CategoriaUsuario categoriaUsuario; ñ faz sentido ter, já que isso pode ser consultado
    private LocalDateTime dataTrabalhada;
    private BigDecimal horasTrabalhadas;
    private BigDecimal saldoBancoHoras;
}
