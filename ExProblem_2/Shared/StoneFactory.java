package Lecture_10_Design_Paterns.ExProblem_2.Shared;
import Lecture_10_Design_Paterns.ExProblem_2.Model.GameObject;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Stone;
public class StoneFactory implements Factory {


    @Override
    public GameObject produce() {
        return new Stone();
    }

    public GameObject produceFastStone() {
        Stone stone = new Stone();
        stone.setSpeed(4);
        return stone;
    }

}
