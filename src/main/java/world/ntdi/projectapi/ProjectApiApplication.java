package world.ntdi.projectapi;

import org.reflections.Reflections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import world.ntdi.projectapi.project.Project;

import java.util.*;


@SpringBootApplication
public class ProjectApiApplication {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SpringApplication.run(ProjectApiApplication.class, args);
    }

}
