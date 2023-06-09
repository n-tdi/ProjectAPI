package world.ntdi.projectapi.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.project.projects.*;

import java.util.*;

@UtilityClass
@Data
public class ProjectManager {
    @Getter
    private LinkedHashMap<Integer, Project> projects = new LinkedHashMap<>();

    static {
        new ProblemGen();
        new Planium();
        new Postglam();
        new DaemonScripts();
        new Tia();
        new Ntreak();
        new Renderer3();
        new SudokuSolver();
        new RemovePlayerBlocks();
        new GLib();
        new BlogSveltekit();
        new CustomYamlAPI();
        new SimpleMessaging();
        new TheBible();
        new Gunlib();
        new Fache();
        new ToneModeration();
        new LDSync();
        new TdiPolls();
        new TicTacToeAI();
        new DamageIndicators();
        new Npctdi();
        new NumberToRomanNumerals();
        new RegList();
        new Schedule();
        new PythonToolTemplate();
        new Qalc();
        new MathAPI();
        new MathC();
        new SkyblockSniperWebhook();
    }

    public Project getProjectFromId(int id) {
        return (projects.get(id) == null ? null : projects.get(id));
    }

    public List<Project> getAllProjects() {
        return new LinkedList<>(getProjects().values());
    }

    public LinkedList<Preview> getAllPreviews() {
        LinkedList<Preview> previews = new LinkedList<>();
        for (Project project : getProjects().values()) {
            previews.add(project.getPreview());
        }

        return previews;
    }

    public void put(int id, Project project) {
        projects.put(id, project);
    }
}
