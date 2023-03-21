package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Fache extends Project {
    public Fache() {
        super(13, "Fache", "A Dropbox clone made in Sveltekit, Fache uses Firebase to handle authentication and file storage.",
                List.of(
                        new SubSection("Under the hood", "With the the simple but affective usage of Firebase, Fache is able to work by storing files on Firebase's cloud server, and handle user/pass login.")
                ),
                List.of(
                        "SvelteKit",
                        "Firebase",
                        "User authentication",
                        "Drag-and-Drop file uploads"
                ),
                new Preview("Fache", "A Dropbox clone made in Sveltekit, Fache uses Firebase to handle authentication and file storage.", "https://github.com/n-tdi/Fache"));
    }
}
