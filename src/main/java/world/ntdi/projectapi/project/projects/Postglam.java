package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class Postglam extends Project {
    public Postglam() {
        super(27, "Postglam", "An object orientated Postgresql wrapper for Java. Postglam works by allowing you to create tables, columns, rows, and other objects that represent actual values inside your Postgresql database. Postglam has loads of wikis and other tutorials available, making learning and using it super easy.",
                List.of(
                        new SubSection("Well why?", "Simple! It's always been ugly to type SQL syntax into a Java function, those are ways of the past, now with Postglam, everything is object orientated, allowing you to remain close to the heart of Java, rather than some old JDBC driver..")
                ),
                List.of(
                        "Object Orientaed",
                        "Fully Documented and Tutorials",
                        "API Wrapper",
                        "SQL"
                ),"https://github.com/n-tdi/postglam");
    }
}
