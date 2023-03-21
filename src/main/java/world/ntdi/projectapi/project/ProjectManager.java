package world.ntdi.projectapi.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.project.projects.*;

import java.util.*;

@UtilityClass
@Data
public class ProjectManager {
    @Getter
    private Map<Projects, Project> projects;

    static {
        projects = new LinkedHashMap<>();

        put(Projects.Planium, new Planium());
        put(Projects.DAEMONSCRIPTS, new DaemonScripts());
        put(Projects.NTREAK, new Ntreak());
        put(Projects.RENDERER3, new Renderer3());
        put(Projects.RPB, new RemovePlayerBlocks());
    }

    public Project getProjectFromId(int id) {
        Projects project = null;
        for (Projects projectLoop : Projects.values()) {
            if (projectLoop.getId() == id) project = projectLoop;
        }
        return (project == null ? null : projects.get(project));
    }

    public List<Project> getAllProjects() {
        return new LinkedList<>(getProjects().values());
    }

    public List<Preview> getAllPreviews() {
        List<Preview> previews = new LinkedList<>();
        for (Project project : getProjects().values()) {
            previews.add(project.getPreview());
        }

        return previews;
    }

    private void put(Projects projectType, Project project) {
        projects.put(projectType, project);
    }

    @AllArgsConstructor
    public enum Projects {
        Planium(1),
        DAEMONSCRIPTS(2),
        NTREAK(3),
        RENDERER3(4),
        SUDOKUSOLVER(5),
        RPB(6);

        @Getter
        private final int id;
    }
}
