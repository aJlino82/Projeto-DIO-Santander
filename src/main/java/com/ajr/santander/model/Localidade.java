package com.ajr.santander.model;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {

    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;


}
