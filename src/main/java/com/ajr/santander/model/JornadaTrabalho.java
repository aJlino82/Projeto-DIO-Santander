package com.ajr.santander.model;

import lombok.*;

import javax.persistence.Entity;
import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class JornadaTrabalho {

    private long id;
    private String descricao;
}
