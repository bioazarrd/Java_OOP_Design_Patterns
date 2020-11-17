package Lecture_10_Design_Paterns.ExProblem_2.Command;
public class MoveLeftDown implements Command {


    private MoveLeft moveLeft = new MoveLeft();
    private MoveDown moveDown = new MoveDown();


    @Override
    public void execute() {
        moveLeft.execute();
        moveDown.execute();
    }
}
