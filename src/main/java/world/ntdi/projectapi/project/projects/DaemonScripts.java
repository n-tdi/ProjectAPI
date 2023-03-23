package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class DaemonScripts extends Project {
    public DaemonScripts() {
        super(2, "Daemon Scripts",
                "A super powerful collection of SystemD and Shell scripts to daemonize running java applications on cloud servers.",
                List.of(
                        new SubSection("Deploy.sh", "The deploy.sh script works simply, first it stashes and changes, so that it can pull the latest build with no issues. Then it uses Maven to package and move the compiled jar into the parent directory. If you're using gradle, change it yourself or get off gradle lol. Lastly the script will run the jar with sudo privileges just in case any IO usage or other errors occur because it does not have them. Again, if you're worried about security, change it."),

                        new SubSection("Java.service", "The second script is a SystemD service file. The service file uses the ROOT user to execute the deploy.sh, it's important to update the working directory and the directory of the deploy.sh so that the service fully works. Once installed you'll have to run the <em class=\"code\">systemctl daemon-reload</em> and <em class=\"code\">systemctl enable</em> commands.")
                ),
                List.of(
                        "Easy to configure",
                        "Ready to use outside the box",
                        "Support for multiple reverse proxies",
                        "Installation guides and commands"
                ),
                "https://github.com/n-tdi/daemon-scripts");
    }
}
