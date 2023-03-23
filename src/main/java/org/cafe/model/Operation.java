package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Operation {
    @JsonProperty("oper_type")
    private int type;

    @JsonProperty("oper_time")
    private double time;

    @JsonProperty("oper_async_point")
    private int asyncPoint;

    @JsonProperty("oper_products")
    private List<OperationProduct> productsList;
}
