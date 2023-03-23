package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cook {
    @JsonProperty("cook_id")
    private int id;

    @JsonProperty("cook_name")
    private String name;

    @JsonProperty("cook_active")
    private boolean active;
}
