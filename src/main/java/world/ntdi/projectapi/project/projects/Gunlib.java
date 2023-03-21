package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Gunlib extends Project {
    public Gunlib() {
        super(12, "Gunlib", "An abstract Java library for creating custom guns in minecraft.",
                List.of(
                        new SubSection("Explanation", "Gunlib is meant to be a developer's tool to create guns that are simple, but contain highly complex mechanics. Gunlib deals with the hassle of handling when and what happens whenever your gun fires, and lands. Lastly, Gunlib will give you complete control over the behaviour of each weapon, making it really powerful for a wide range of minigame development.")
                ),
                List.of(
                        "Documentation",
                        "Abstract API",
                        "Open Source",
                        "Powerful customization"
                ), new Preview("Gunlib", "An abstract Java library for creating custom guns in minecraft.", "https://github.com/n-tdi/Gunlib"));
    }
}
