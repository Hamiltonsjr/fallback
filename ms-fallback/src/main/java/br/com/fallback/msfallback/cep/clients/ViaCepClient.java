package br.com.fallback.msfallback.cep.clients;

import br.com.fallback.msfallback.cep.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCep", url = "${feing.client.viacep.url}")
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    CepResponse getCep(@PathVariable final String cep);

}
