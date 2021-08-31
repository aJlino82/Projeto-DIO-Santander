package com.ajr.santander.model;

import lombok.*;

import javax.persistence.Entity;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class TipoData {
    private Long id;
    private String descricao;
}
