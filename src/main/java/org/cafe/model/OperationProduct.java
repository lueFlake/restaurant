package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OperationProduct {
    @JsonProperty("prod_type")
    private int type;

    @JsonProperty("prod_type_id")
    private int typeId;

    @JsonProperty("prod_quantity")
    private double quantity;
}
