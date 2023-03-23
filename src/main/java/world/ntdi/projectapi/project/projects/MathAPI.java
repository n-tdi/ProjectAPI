package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class MathAPI extends Project {
    public MathAPI() {
        super(23, "Math API", "A RESTful API to parse mathematical equations.",
                List.of(
                        new SubSection("Woah woah, what?", "Using Express JS and MathJS, I was able to create a fully functioning API to parse math expressions.")
                ),
                List.of(
                        "ExpressJS",
                        "NodeJS",
                        "Easy to use and understand"
                ), "https://github.com/n-tdi/Math-Api");
    }
}
