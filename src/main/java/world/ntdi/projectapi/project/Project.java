package world.ntdi.projectapi.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;

import java.util.List;

@Data
public class Project {
    private final int id;
    private final String title;
    private final String description;
    private final List<SubSection> sections;
    private final List<String> features;
    private final Preview preview;

    public Project(int id, String title, String description, List<SubSection> sections, List<String> features, String link) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.sections = sections;
        this.features = features;
        this.preview = new Preview(id, title, description, link);

        ProjectManager.put(id, this);
    }
}
