package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Qalc extends Project {
    public Qalc() {
        super(22, "Qalc", "A discord bot written in JDA to do mathematical expressions",
                List.of(
                        new SubSection("What can it do?", "Qalc is ment for Algebra 1 and Physics related tasks/conversions.")
                ),
                List.of(
                        "User friendly",
                        "Quick",
                        "Powerful"
                ), "https://github.com/n-tdi/Qalc");
    }
}
