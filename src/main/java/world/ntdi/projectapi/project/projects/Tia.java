package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Tia extends Project {
    public Tia() {
        super(26, "Tia", "In honor of my cat who recently passed away, I created a RESTful API to retrieve a random picture of her.",
                List.of(
                        new SubSection("What did you use to make it?", "Well I went with ExpressJS because at the time, Spring boot wasn't something I knew. Then I used PUG to serve a little website with a random image.")
                ),
                List.of(
                        "ExpressJS",
                        "NodeJS",
                        "PUG",
                        "SCSS",
                        "Cat"
                ),"https://github.com/Ntdi-World/Tia");
    }
}
