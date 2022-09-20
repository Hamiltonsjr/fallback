package br.com.fallback.msfallback.product.clients;

import br.com.fallback.msfallback.product.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "productClient", url = "${feing.client.product.url}")
public interface ProductClient {

    @GetMapping("/api/v1/products.json")
    List<ProductResponse> getProduct(@RequestParam("brand") String brand);

}
