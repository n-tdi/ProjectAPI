package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class LDSync extends Project {
    public LDSync() {
        super(15, "LDSync", "LDSync is an all-in-one minecraft plugin to sync Vault ranks to Discord Roles",
                List.of(
                        new SubSection("How does it work?", "Your favorite permissions plugins, PermissionsEX, Luckperms, all integrate with Vault. Then LDSync talks to vault to get the roles and groups of players. The players can then sync themselves with discord roles, or staff can manually do it.")
                ),
                List.of(
                        "200+ downloads",
                        "Vault and Placeholder API integration",
                        "Wiki and Documentation",
                        "Open Source",
                        "Ready to use out of the box"
                ), new Preview("LDSync", "LDSync is an all-in-one minecraft plugin to sync Vault ranks to Discord Roles", "https://github.com/n-tdi/LDSync"));
    }
}
