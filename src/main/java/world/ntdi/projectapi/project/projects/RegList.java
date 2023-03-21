package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class RegList extends Project {
    public RegList() {
        super(20, "RegList", "Register all your listener classes with one simple function!",
                List.of(
                        new SubSection("That must use yucky and taxing syntax..", "You'd be wrong! RegList uses super efficient reflection to harvest all the Listener classes and register them! RegList makes it super easy to use. All you gotta do is call one function!")
                ),
                List.of(
                        "Lightweight",
                        "Preformance optimized",
                        "Easy to use"
                ), new Preview("Reglist", "Never register you listeners again!", "https://github.com/n-tdi/RegList"));
    }
}
