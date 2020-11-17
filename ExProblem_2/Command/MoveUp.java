package Lecture_10_Design_Paterns.ExProblem_2.Command;
import Lecture_10_Design_Paterns.ExProblem_2.Core.Main;
public class MoveUp implements Command {


    @Override
    public void execute() {
        //TODO: player moveUp
        Main.player.decreaseRow();
    }



}
