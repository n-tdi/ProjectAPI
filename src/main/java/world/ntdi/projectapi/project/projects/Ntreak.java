package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Ntreak extends Project {
    public Ntreak() {
        super(3, "Ntreak",
                "Ntreak is a kill-streak plugin for Dupespree",
                List.of(
                        new SubSection("Logic", "The logic for Ntreak is super simple, when a player gets a kill, they get +1 to their kill-streak, and when they die, their kill-streak gets set to 0"),

                        new SubSection("Uniqueness", "Ntreak is unique with its system for rewarding kill-streaks, Ntreak allows you to select power ups for each kill-streak, the only issue is the power ups also have down sides! So it makes it important for players to choose the right abilities.")
                ),
                List.of(
                        "Fully customizable",
                        "FOSS",
                        "Paid resource"
                ),"https://github.com/n-tdi/Ntreak");
    }
}
