package com.ajr.santander.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Empresa {

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
