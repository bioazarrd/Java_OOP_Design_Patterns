package Lecture_10_Design_Paterns.ExProblem_2.Shared;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Initializer;
import Lecture_10_Design_Paterns.ExProblem_2.Model.GameObject;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Player;
public class PlayerFactory implements Factory {




    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.loadPlayerData(Player.class);
        return new Player(params[0],params[1]);
    }
}
