package com.ajr.santander.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class NivelAcesso {
    @Id
    private long id;
    private String descricao;
}

//long = dado primitivo para indentificar um dado de 64 bit(representa um dado).
//Long = classe Wrapper(representa uma class/objeto)