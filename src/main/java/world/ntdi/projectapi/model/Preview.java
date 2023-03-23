package world.ntdi.projectapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Preview {
    private final int id;
    private final String title;
    private final String description;
    private final String github_link;
}
