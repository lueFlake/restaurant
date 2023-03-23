package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DishCard {
    @JsonProperty("card_id")
    private int id;

    @JsonProperty("dish_name")
    private String name;

    @JsonProperty("card_descr")
    private String description;

    @JsonProperty("card_time")
    private double time;

    @JsonProperty("equip_type")
    private int equipmentType;

    @JsonProperty("operations")
    private List<Operation> operationsList;

}
