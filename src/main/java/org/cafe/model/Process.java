package org.cafe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Process {
    @JsonProperty("proc_id")
    private int id;
    @JsonProperty("ord_dish")
    private int orderedDish;
    @JsonProperty("proc_started")
    private LocalDateTime startedAt;
    @JsonProperty("proc_ended")
    private LocalDateTime endedAt;
    @JsonProperty("proc_active")
    private boolean active;
    @JsonProperty("proc_operations")
    private List<ProcessOperation> operations;
}

