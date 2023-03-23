package org.cafe.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.io.File;
import java.util.Optional;

public class JsonParser {
    private final ObjectMapper objectMapper = new ObjectMapper();
    public <T> List<T> parse(String filePath) {
        File file = new File(filePath);
        Optional<List<T>> result = Optional.empty();
        try {
            var model = objectMapper.readValue(file, new TypeReference<HashMap<String, List<T>>>() {
            });
            result = model.values().stream().findFirst();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.orElse(null);
    }
}
