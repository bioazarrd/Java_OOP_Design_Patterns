package Lecture_10_Design_Paterns.ExProblem_2.Core;
import Lecture_10_Design_Paterns.ExProblem_2.Model.GameObject;
public class Field implements GameObject {


    public char[][] field;

    public Field() {
        this.field = new char[16][16];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                this.field[i][j] = '-';
            }
        }
    }


    @Override
    public void update() {
    }

    @Override
    public void rendered() {
        for (int r = 0; r < 16; r++) {
            for (int c = 0; c < 16; c++) {
                System.out.print(this.field[r][c] + " ");
            }
            System.out.println();
        }
    }

}
