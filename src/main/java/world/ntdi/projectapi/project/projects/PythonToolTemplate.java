package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class PythonToolTemplate extends Project {
    public PythonToolTemplate() {
        super(22, "Python Tool Template", "A Github Template for creating python macros that look edgy.",
                List.of(
                        new SubSection("Modules", "Well, the template uses pyautogui and keyboard")
                ),
                List.of(
                        "Template",
                        "Easy to use"
                ), new Preview("Python Tool Template", "A Github Template for creating python macros that look edgy.", "https://github.com/n-tdi/PythonToolTemplate"));
    }
}
