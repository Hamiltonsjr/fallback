package br.com.fallback.msfallback.cep.CepClientFallback;

import br.com.fallback.msfallback.cep.CepResponse;
import br.com.fallback.msfallback.cep.clients.ViaCepClient;
import org.springframework.cache.annotation.Cacheable;

public class CepServiceFallback implements ViaCepClient {

    @Override
    @Cacheable("cache")
    public CepResponse getCep(String cep) {
        return null;
    }
}
