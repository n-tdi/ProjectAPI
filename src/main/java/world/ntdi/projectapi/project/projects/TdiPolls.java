package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class TdiPolls extends Project {
    public TdiPolls() {
        super(16, "Tdi Polls", "A website where you can vote on topics made in pure Svelte",
                List.of(
                        new SubSection("Importance", "Tdi Polls was my first project when learning svelte, I interacted with animations, components, and layouts. Overall, this project was a great first resource for learning svelte.")
                ),
                List.of(
                        "Pure Svelte",
                        "Animations",
                        "Open Source"
                ), "https://github.com/n-tdi/tdi-polls");
    }
}
