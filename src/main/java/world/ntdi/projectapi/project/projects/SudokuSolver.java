package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class SudokuSolver extends Project {
    public SudokuSolver() {
        super(5, "Sudoku Solver",
                "A hard-coded Sudoku solver written in C.",
                List.of(
                        new SubSection("Methods", "There are multiple ways to check if a number can go in a box. The most light weight ones are checking if it is the only possible number to go into a 3x3 box, or a 9x1 line. These checks get run first each cycle, and then when neither can be determined, there are more costly methods of computation. Check out the code to see how it works!")
                ),
                List.of(
                        "Pure C",
                        "Performance optimized",
                        "CMake"
                ),"https://github.com/n-tdi/SudokuSolver");
    }
}
