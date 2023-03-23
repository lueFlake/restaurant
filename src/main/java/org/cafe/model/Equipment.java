package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipment {
    @JsonProperty("equip_type")
    private int typeId;

    @JsonProperty("equip_name")
    private String name;

    @JsonProperty("equip_active")
    private boolean active;
}
