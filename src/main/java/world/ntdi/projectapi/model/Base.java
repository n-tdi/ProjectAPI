package world.ntdi.projectapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Base {
    private final String title;
    private final String description;
    private final List<SubSection> sections;
    private final List<String> features;
}
