package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuDish {
    @JsonProperty("menu_dish_id")
    private int id;

    @JsonProperty("menu_dish_card")
    private int card;

    @JsonProperty("menu_dish_price")
    private double price;

    @JsonProperty("menu_dish_active")
    private boolean active;
}

