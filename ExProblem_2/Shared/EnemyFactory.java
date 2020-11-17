package Lecture_10_Design_Paterns.ExProblem_2.Shared;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Initializer;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Enemy;
import Lecture_10_Design_Paterns.ExProblem_2.Model.GameObject;
public class EnemyFactory implements Factory {


    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.loadPlayerData(Enemy.class);
        return new Enemy(params[0],params[1]);
    }
}
