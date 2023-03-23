package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @JsonProperty("prod_item_id")
    private int id;
    @JsonProperty("prod_item_type")
    private int type;
    @JsonProperty("prod_item_name")
    private String name;
    @JsonProperty("prod_item_company")
    private String company;
    @JsonProperty("prod_item_unit")
    private String unit;
    @JsonProperty("prod_item_quantity")
    private double quantity;
    @JsonProperty("prod_item_cost")
    private double cost;
    @JsonProperty("prod_item_delivered")
    private LocalDateTime delivered;
    @JsonProperty("prod_item_valid_until")
    private LocalDateTime validUntil;
}

