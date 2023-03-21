package world.ntdi.projectapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.ntdi.projectapi.model.ListModel;
import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.project.Project;
import world.ntdi.projectapi.project.ProjectManager;

@RestController
@RequestMapping("/v1/")
public class ProjectController {
    @GetMapping("/project")
    public ListModel<Project> getAllProjects() {
        return new ListModel<>(ProjectManager.getAllProjects());
    }

    @GetMapping("/project/{id}")
    public ResponseEntity<Project> getProject(@PathVariable int id) {
        Project project = ProjectManager.getProjectFromId(id);
        if (project == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(project);
    }

    @GetMapping("/preview")
    public ListModel<Preview> getAllPreviews() {
        return new ListModel<>(ProjectManager.getAllPreviews());
    }
}
