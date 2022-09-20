package br.com.fallback.msfallback.product;

import br.com.fallback.msfallback.product.domain.ProductColors;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {


    private int id;

    private String brand;

    private String name;

    private String price;

    @JsonProperty("price_sing")
    private String priceSign;

    private String currency;

    @JsonProperty("image_link")
    private URL imageLink;

    @JsonProperty("product_link")
    private URL productLink;

    @JsonProperty("website_link")
    private URL websiteLink;

    private String description;

    private String rating;

    private String category;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("tag_list")
    private List<String> tagList;

    @JsonProperty("created_at")
    private String created;

    @JsonProperty("updated_at")
    private String updated;

    @JsonProperty("product_api_url")
    private URL productUrl;

    @JsonProperty("api_featured_image")
    private String apiImage;

    @JsonProperty("product_colors")
    private List<ProductColors> productColors;

}
