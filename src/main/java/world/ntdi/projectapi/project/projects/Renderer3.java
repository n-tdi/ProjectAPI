package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Renderer3 extends Project {
    public Renderer3() {
        super(4, "Renderer3",
                "Renderer3 is a 3D renderer made it pure Java.",
                List.of(
                        new SubSection("Geometry", "Renderer3 contains custom made Matrices, Lines, and Triangles to display a 3D pyramid, in 2D space.")
                ),
                List.of(
                        "Pure Java",
                        "Object Orientated",
                        "JavaFX display"
                ),
                new Preview("Renderer3", "Renderer3 is a 3D renderer made it pure Java.", "https://github.com/n-tdi/Renderer3/tree/main/src/main/java/world/ntdi/renderer3/model"));
    }
}
