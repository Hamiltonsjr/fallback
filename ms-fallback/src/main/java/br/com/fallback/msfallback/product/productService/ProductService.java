package br.com.fallback.msfallback.product.productService;

import br.com.fallback.msfallback.mapper.ProductMapper;
import br.com.fallback.msfallback.product.ProductResponse;
import br.com.fallback.msfallback.product.clients.ProductClient;
import br.com.fallback.msfallback.product.domain.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductClient productClient;

    @Cacheable(value = "getProduct", unless = "#result == null")
    public List<ProductDTO> getProduct(@RequestParam("brand") String brand) {
        final List<ProductResponse> responses = this.productClient.getProduct(brand);
        return ProductMapper.MAPPER.mapProductResponseBuildDTO(responses);
    }

}
