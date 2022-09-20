package br.com.fallback.msfallback.order.orderService;

import br.com.fallback.msfallback.cep.cepServices.CepService;
import br.com.fallback.msfallback.cep.domain.CepDTO;
import br.com.fallback.msfallback.order.OrderDetails;
import br.com.fallback.msfallback.product.domain.ProductDTO;
import br.com.fallback.msfallback.product.productService.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private ProductService productService;

    @Autowired
    private CepService cepService;

    @Cacheable(value = "getOrderDetails", unless = "#result == null")
    public OrderDetails getOrderDetails(final ProductDTO product, final CepDTO cep) {
        final CepDTO informationCep = cepService.getCep(cep.getCep());

        if (Objects.isNull(informationCep)) {
            log.info("Cep inválido={}", cep.getCep());
        }

        final List<ProductDTO> informationProduct = productService.getProduct(product.getBrand());

        if (Objects.isNull(informationProduct)) {
            log.info("");
        }


        return null;
    }

}
