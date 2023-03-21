package world.ntdi.projectapi.project.projects;

import world.ntdi.projectapi.model.Preview;
import world.ntdi.projectapi.model.SubSection;
import world.ntdi.projectapi.project.Project;

import java.util.List;

public class TicTacToeAI extends Project {
    public TicTacToeAI() {
        super(17, "TicTacToe AI", "Do you have no friends? Then this is perfect for you. Play Tic Tac Toe in Java against an AI.",
                List.of(
                        new SubSection("What is AI?", "In short, AI is the process of a computer doing something on its own. For example, generating a random number is technically AI. Now if you see where I am going with this, when you play against the \"AI\" you will shortly find out that all of its moves are random. This is because it has no idea what a good move is, its just randomaly generating one, this technically means that the bot is AI, but not the AI you think of.")

                ), List.of(
                        "Pure Java",
                        "Game",
                        "AI Powered"
                ), new Preview("TicTacToe AI", "Do you have no friends? Then this is perfect for you. Play Tic Tac Toe in Java against an AI.", "https://github.com/n-tdi/tic-tac-toe"));
    }
}
