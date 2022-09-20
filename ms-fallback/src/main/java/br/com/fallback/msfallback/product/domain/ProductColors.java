package br.com.fallback.msfallback.product.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductColors {

    @JsonProperty("hex_value")
    private String hexValue;

    @JsonProperty("colour_name")
    private String colourName;

}
