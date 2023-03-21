package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Npctdi extends Project {
    public Npctdi() {
        super(19, "Npctdi", "Create custom NPCs with Npctdi.",
                List.of(
                        new SubSection("How does it work?", "Well it was quite a pain, but Npctdi works by using NMS to create fake player packets, then it sets the skin of those fake players to a skin texture and value. This project is mainly a learning experience but with a little configuration, it can be a full fledged NPC api.")
                ),
                List.of(
                        "NMS",
                        "Fake player",
                        "Highly preformat unlike other plugins"
                ), new Preview("Npctdi", "Create custom NPCs with Npctdi.", "https://github.com/n-tdi/Npctdi"));
    }
}
