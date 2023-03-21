package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Schedule extends Project {
    public Schedule() {
        super(21, "Schedule", "A python program to view my school schedule in a pretty way.",
                List.of(
                        new SubSection("The struggles", "I was having a battle with my compiler, originally I thought I was running python 3.9.1 on the program, but after trial and error I learned that python was actually running in version 2.7. Anyways I really had fun coding all this.")
                ),
                List.of(
                        "Python",
                        "CLI"
                ), new Preview("Schedule", "A python program to view my school schedule in a pretty way.", "https://github.com/n-tdi/Schedule"));
    }
}
