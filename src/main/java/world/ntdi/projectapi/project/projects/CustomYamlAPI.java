package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class CustomYamlAPI extends Project {
    public CustomYamlAPI() {
        super(9, "Custom Yaml API", "A Framework for making custom YAML files for Spigot plugins",
                List.of(
                        new SubSection("The Process", "This was my first real framework that I myself used in a bunch of different plugins. It works by extending the YamlConfiguration file, which then creates and handles all the IO related stuff. Leaving you the developer with a simple interface to control yml files like you would with any other configuration file.")
                ),
                List.of(
                        "Open Source",
                        "Easy to use and understand",
                        "Configurable",
                        "Wikis and Docs"
                ), new Preview("Custom Yaml API", "A Framework for making custom YAML files for Spigot plugins", "https://github.com/n-tdi/Custom-Yaml-Api"));
    }
}
