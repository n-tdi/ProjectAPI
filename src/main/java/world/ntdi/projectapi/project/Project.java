package world.ntdi.projectapi.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;

import java.util.List;

@AllArgsConstructor
@Data
public class Project {
    private final int id;
    private final String title;
    private final String description;
    private final List<SubSection> sections;
    private final List<String> features;
    private final Preview preview;
}
