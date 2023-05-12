package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class ProblemGen extends Project {
    public ProblemGen() {
        super(26, "ProblemGen", "ProblemGen is a firefox and chrome extension to generate a set",
                List.of(
                        new SubSection("What does it do?", "ProblemGen is just a simple extension for firefox and chrome browsers that just simply creates a list of problems, with rules."),
                        new SubSection("Huh??", "A rule for example is only Odds, or Evens. Better yet, Every Other Odd, Every Other Even. Made simply and modularly, ProblemGen is based.")
                ),
                List.of(
                        "Modular",
                        "Browser Extension",
                        "Tokenizing Language"
                ), "https://github.com/n-tdi/problemgen");
    }
}
