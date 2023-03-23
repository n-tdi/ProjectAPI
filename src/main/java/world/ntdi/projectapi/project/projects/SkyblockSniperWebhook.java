package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class SkyblockSniperWebhook extends Project {
    public SkyblockSniperWebhook() {
        super(25, "Skyblock Sniper Webhook", "A project to send Hypixel Skyblock AH snipes to a discord webhook",
                List.of(
                        new SubSection("That feels illegal..", "Well it's not! The sniper uses the official Hypixel API to get and compare the latest auction house auctions. Then when the sniper finds a good profit margin, it alerts you with sending a message containing the auction command and the profit.")
                ),
                List.of(
                        "Open Source",
                        "Out of the box ready to use",
                        "Ingame advantage"
                ), "https://github.com/n-tdi/SkyblockSniper-Discord");
    }
}
