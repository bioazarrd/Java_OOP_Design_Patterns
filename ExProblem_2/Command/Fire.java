package Lecture_10_Design_Paterns.ExProblem_2.Command;
import Lecture_10_Design_Paterns.ExProblem_2.Core.Main;
import Lecture_10_Design_Paterns.ExProblem_2.Stone.Throw;

public class Fire implements Command {

    private Throw th;


    public Fire(Throw th) {
        this.th = th;
    }

    public Fire() {
    }



    @Override
    public void execute() {
        Main.player.throwStone(this.th);
    }
}
