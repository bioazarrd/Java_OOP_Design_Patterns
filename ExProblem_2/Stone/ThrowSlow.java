package Lecture_10_Design_Paterns.ExProblem_2.Stone;
import Lecture_10_Design_Paterns.ExProblem_2.Core.Main;
import Lecture_10_Design_Paterns.ExProblem_2.Shared.StoneFactory;
public class ThrowSlow implements Throw {




    @Override
    public void throwStone() {
        Main.gameObjects.add(new StoneFactory().produce());
    }
}
