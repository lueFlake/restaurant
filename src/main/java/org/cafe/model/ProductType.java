package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductType {
    @JsonProperty("prod_type_id")
    private int id;
    @JsonProperty("prod_type_name")
    private String name;
    @JsonProperty("prod_is_food")
    private boolean isFood;
}

