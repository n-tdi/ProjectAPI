package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class TheBible extends Project {
    public TheBible() {
        super(11, "The Bible", "A minecraft plugin to get the first two chapters of the bible in minecraft.",
                List.of(
                        new SubSection("Hard coding a bible? Yikes?", "Actually! You're wrong. This plugin uses an API to fetch the bible chapters and then uses some advanced string calculation to generate the text into a minecraft book.")
                ),
                List.of(
                        "Religious?"
                ), "https://github.com/n-tdi/The-bible");
    }
}
