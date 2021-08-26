package com.ajr.santander.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;
    private NivelAcesso nivelAcesso;
    private String descricao;
}
