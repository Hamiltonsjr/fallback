package br.com.fallback.msfallback.product;


import br.com.fallback.msfallback.product.domain.ProductDTO;
import br.com.fallback.msfallback.product.productService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductResource {
    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getProduct(@RequestParam("brand") String brand) {
        final List<ProductDTO> product = service.getProduct(brand);
        return ResponseEntity.ok(product);
    }

}
