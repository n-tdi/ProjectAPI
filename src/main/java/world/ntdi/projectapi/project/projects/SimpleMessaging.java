package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class SimpleMessaging extends Project {
    public SimpleMessaging() {
        super(10, "Simple Messaging", "Messaging other players on your minecraft server has never been easier, with its custom formats and support for Placeholder API, Simple Messaging is a drop in replacement for server owners of any size.",
                List.of(
                        new SubSection("Configuration", "With Simple Messaging, you have complete control over what the message looks like on both ends. Everything is configurable and comes with documentation that is easy to follow.")
                ),
                List.of(
                        "Placeholder API support",
                        "Documentation",
                        "Drop-in replacement",
                        "Easy to use",
                        "Configurable"
                ), "https://github.com/n-tdi/Simple-Messaging");
    }
}
