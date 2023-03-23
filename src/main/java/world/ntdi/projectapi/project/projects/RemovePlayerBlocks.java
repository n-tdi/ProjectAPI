package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class RemovePlayerBlocks extends Project {
    public RemovePlayerBlocks() {
        super(6, "Remove Player Placed Blocks",
                "Have a duel arena where people can place blocks but want to unclog it after x minutes?",
                List.of(
                        new SubSection("Tracking time without clogging main thread", "RPB uses google's GCACHE to set an expiring policy based on what is inputted into the config, of course the main thread is still called when returning the block to its previous state due to Bukkit/Spigot limitations.")
                ),
                List.of(
                        "Spigot 1.13+ support",
                        "Fully customizable",
                        "Over 100 SpigotMC downloads",
                        "Optimized for the end user",
                        "Easy to use for all server owners"
                ), "https://github.com/n-tdi/RemovePlayerBlocks");
    }
}
