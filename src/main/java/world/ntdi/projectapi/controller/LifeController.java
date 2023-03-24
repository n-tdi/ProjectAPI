package world.ntdi.projectapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.ntdi.projectapi.life.Life;
import world.ntdi.projectapi.life.LifeManager;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5173")
@RestController
@RequestMapping("/v1/")
public class LifeController {
    @GetMapping("/lives")
    public List<Life> getLives() {
        return LifeManager.getLives();
    }
}
