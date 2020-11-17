package Lecture_10_Design_Paterns.ExProblem_2.Model;
import Lecture_10_Design_Paterns.ExProblem_2.Core.Main;
import Lecture_10_Design_Paterns.ExProblem_2.Shared.Movable;
public class Stone implements GameObject, Movable {

    private int row;
    private int prevRow;
    private int col;
    private int speed;

    public Stone() {
        this.row = Main.player.getRow();
        this.prevRow = this.row;
        this.row = Main.player.getCol();
        this.speed = 1;
    }



    @Override
    public void update() {
        if (this.row >= 0) {
            this.prevRow = this.row;
            this.row--;
            this.row -= speed;
        }
    }


    @Override
    public void rendered() {
        if (this.row > -1) {
            Main.field.field[prevRow][this.col] = '-';
            Main.field.field[this.row][this.col] = 'S';
        }
    }

    @Override
    public int getRow() {
        return 0;
    }

    @Override
    public int getCol() {
        return 0;
    }

    @Override
    public void decreaseRow() {

    }

    @Override
    public void decreaseCol() {

    }

    @Override
    public void increaseCol() {

    }

    @Override
    public void increaseRow() {

    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }


}
