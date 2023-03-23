package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationType {
    @JsonProperty("oper_type_id")
    private int id;

    @JsonProperty("oper_type_name")
    private String name;
}
