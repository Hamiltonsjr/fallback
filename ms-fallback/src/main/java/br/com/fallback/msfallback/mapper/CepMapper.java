package br.com.fallback.msfallback.mapper;

import br.com.fallback.msfallback.cep.CepResponse;
import br.com.fallback.msfallback.cep.domain.CepDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CepMapper {

    CepMapper MAPPER = Mappers.getMapper(CepMapper.class);

    @Mapping(source = "cep", target = "cep")
    @Mapping(source = "logradouro", target = "logradouro")
    @Mapping(source = "bairro", target = "bairro")
    @Mapping(source = "localidade", target = "localidade")
    @Mapping(source = "uf", target = "uf")
    CepDTO mapCepResponseBuildDTO(CepResponse response);
}
