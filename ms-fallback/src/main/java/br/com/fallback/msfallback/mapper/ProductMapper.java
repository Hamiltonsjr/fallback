package br.com.fallback.msfallback.mapper;

import br.com.fallback.msfallback.product.ProductResponse;
import br.com.fallback.msfallback.product.domain.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "brand", target = "brand")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "category", target = "category")
    List<ProductDTO> mapProductResponseBuildDTO(List<ProductResponse> response);
}

