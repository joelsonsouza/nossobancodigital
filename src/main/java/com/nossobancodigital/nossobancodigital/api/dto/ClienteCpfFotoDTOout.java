package com.nossobancodigital.nossobancodigital.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteCpfFotoDTOout {
    private String nomeArquivo;
    private String descricao;
    private String contentType;
    private Long tamanho;
}
