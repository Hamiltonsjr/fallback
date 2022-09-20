package br.com.fallback.msfallback.cep.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CepDTO {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}
