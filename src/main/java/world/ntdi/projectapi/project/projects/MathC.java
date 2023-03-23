package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class MathC extends Project {
    public MathC() {
        super(24, "MathC", "Engage your players with fun and engaging math questions in chat!",
                List.of(
                        new SubSection("What does it offer?", "MathC allows you to engage your players with rewards and time leaderboards to give your players something fun to do!")
                ),
                List.of(
                        "100+ Downloads",
                        "Ready to use",
                        "Wikis and Documentation",
                        "Highly configurable"
                ), "https://github.com/n-tdi/MathC");
    }
}
