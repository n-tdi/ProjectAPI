package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class GLib extends Project {
    public GLib() {
        super(7, "GuiLib", "A library for making powerful and customizable GUIs for minecraft in Java",
                List.of(
                        new SubSection("Usage", "This project was made before I understood how to host JVM libraries! I do have my own repo site now, <a href=\"https://repo.ntdi.world\">https://repo.ntdi.world</a>, but that's unimportant. GLib makes it super easy to make GUIs that are object orientated and fully responsive.")
                ),
                List.of(
                        "Fully documented",
                        "Easy and hastle free unlike vanilla guis",
                        "More responsive controller with less boiler plate"
                ), new Preview("GuiLib", "A library for making powerful and customizable GUIs for minecraft in Java", "https://github.com/n-tdi/GLib"));
    }
}
