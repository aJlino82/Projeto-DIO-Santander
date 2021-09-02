package com.ajr.santander.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;

import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Empresa {
    @Id
    private Long id;
    private String descricao;
    private String cpf;
    private String cnpf;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String numero;
    private String telefone;
}
