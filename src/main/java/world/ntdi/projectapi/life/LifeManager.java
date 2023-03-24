package world.ntdi.projectapi.life;

import lombok.Getter;
import lombok.experimental.UtilityClass;
import world.ntdi.projectapi.life.lives.*;

import java.util.LinkedHashMap;
import java.util.LinkedList;

@UtilityClass
public class LifeManager {
    @Getter
    private final LinkedList<Life> lives;

    static {
        lives = new LinkedList<>();

        new Childhood();
        new JavaLearning();
        new PythonLife();
        new JavaSHIT();
        new Unity();
        new MinecraftPlugins();
        new Front();
        new Spring();
    }

    public void put(Life life) {
        lives.add(life);
    }
}
