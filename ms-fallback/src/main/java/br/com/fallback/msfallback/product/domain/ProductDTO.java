package br.com.fallback.msfallback.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private int id;

    private String brand;

    private String name;

    private String price;

    private String category;
}
