package world.ntdi.projectapi.life;

import lombok.Data;

@Data
public class Life {
    private final String title;
    private final String body;
    private final String width;

    public Life(String title, String body, int width) {
        this.title = title;
        this.body = body;
        this.width = width + "%";

        LifeManager.put(this);
    }
}
