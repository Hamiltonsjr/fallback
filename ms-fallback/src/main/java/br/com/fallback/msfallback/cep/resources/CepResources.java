package br.com.fallback.msfallback.cep.resources;

import br.com.fallback.msfallback.cep.cepServices.CepService;
import br.com.fallback.msfallback.cep.domain.CepDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/fallback")
@Slf4j
public class CepResources {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<CepDTO> getCep(@PathVariable final String cep) {
        final CepDTO cepDTO = cepService.getCep(cep);
        log.info("cep-> ={}", cepDTO);
        return ResponseEntity.ok(cepDTO);

    }

}
