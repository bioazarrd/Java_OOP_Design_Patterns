package Lecture_10_Design_Paterns.ExProblem_2.Model;
import Lecture_10_Design_Paterns.ExProblem_2.Core.Main;
import Lecture_10_Design_Paterns.ExProblem_2.Shared.Factory;
import Lecture_10_Design_Paterns.ExProblem_2.Shared.Movable;
import Lecture_10_Design_Paterns.ExProblem_2.Shared.StoneFactory;
import Lecture_10_Design_Paterns.ExProblem_2.Stone.Throw;
import java.util.concurrent.ThreadLocalRandom;
public class Player implements GameObject, Movable {

    private int healthPoints;
    private int damage;
    private Factory factory;
    private int row;
    private int prevRow;
    private int col;
    private int prevCol;


    public Player(int healthPoints, int damage) {
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.factory = new StoneFactory();
        this.row = 15;
        this.prevRow = 15;
        this.col = 7;
        this.prevCol = 7;
    }



    @Override
    public void update() {
        int nextInt = ThreadLocalRandom.current().nextInt(1000);
        if (nextInt % 3 == 0) {
            Main.gameObjects.add(this.factory.produce());
        } else if (nextInt % 7 == 0) {
            Main.gameObjects.removeIf(g -> g.getClass().getSimpleName().equals("Stone"));
        }

    }



    @Override
    public void rendered() {
        Main.field.field[prevRow][prevCol] = '-';
        Main.field.field[this.row][this.col] = 'P';
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getCol() {
        return this.col;
    }

    @Override
    public void decreaseRow() {
        if (this.row > 0) {
            prevRow = this.row;
            this.row--;
        }
    }

    @Override
    public void increaseRow() {
        if (this.row < 15) {
            this.row++;
        }
    }

    @Override
    public void decreaseCol() {
        if (this.col > 0) {
            prevCol = this.col;
            this.col--;
        }
    }

    @Override
    public void increaseCol() {
        if (this.col < 15) {
            prevCol = this.col;
            this.col++;
        }
    }

    public void throwStone(Throw th) {
        th.throwStone();
    }


}
