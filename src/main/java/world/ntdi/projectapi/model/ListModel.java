package world.ntdi.projectapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ListModel<K> {
    private final List<K> projects;
}
