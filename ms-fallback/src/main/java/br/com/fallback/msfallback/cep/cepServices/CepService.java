package br.com.fallback.msfallback.cep.cepServices;

import br.com.fallback.msfallback.cep.CepResponse;
import br.com.fallback.msfallback.cep.clients.ViaCepClient;
import br.com.fallback.msfallback.cep.domain.CepDTO;
import br.com.fallback.msfallback.mapper.CepMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Slf4j
@Service
public class CepService {

    @Autowired
    private ViaCepClient viaCepClient;

    @Cacheable(value = "getCep", unless = "#result == null")
    public CepDTO getCep(final String cep) {
        log.info("cep={}", cep);

        CepResponse response = new CepResponse();
        try {
            response = this.viaCepClient.getCep(cep);

            final boolean isValid = Objects.isNull(response);

            if (!isValid) {
                CepDTO.builder().build();
            }
        } catch (RuntimeException e) {
            log.info("invalid cep={}", e.getMessage());
            CepDTO.builder().build();
        }
        return CepMapper.MAPPER.mapCepResponseBuildDTO(response);
    }

}
