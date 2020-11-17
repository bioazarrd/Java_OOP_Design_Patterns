package Lecture_10_Design_Paterns.ExProblem_2.Command;
import Lecture_10_Design_Paterns.ExProblem_2.Core.Main;
public class MoveLeft implements Command {



    @Override
    public void execute() {
        Main.player.decreaseCol();
    }
}
