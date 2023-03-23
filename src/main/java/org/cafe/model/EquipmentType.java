package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentType {
    @JsonProperty("equip_type_id")
    private int id;

    @JsonProperty("equip_type_name")
    private String name;
}

