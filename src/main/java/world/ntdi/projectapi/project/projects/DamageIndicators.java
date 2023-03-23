package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class DamageIndicators extends Project {
    public DamageIndicators() {
        super(18, "Damage Indicators", "Much like the popular Skyblock gamemode on the Hypixel network. Damage indicators displays the amount of damage you do each hit in a little text box near the victim.",
                List.of(
                        new SubSection("More? Yes please!", "Damage indicators just works, drag and drop into your plugin folder and you're good to go.")
                ),
                List.of(
                        "Easy to use",
                        "Configurable",
                        "Pretty"
                ), "https://github.com/n-tdi/Damage-Indicators");
    }
}
