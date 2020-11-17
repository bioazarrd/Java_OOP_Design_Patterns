package Lecture_10_Design_Paterns.ExProblem_2.data;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Enemy;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Player;
import java.util.Map;
public class DataStorage {



    private Map<Class<?>, int[]> objectsData = Map.of(
            Player.class, new int[] {100, 24},
            Enemy.class, new int[] {240, 2}
            );


    public int[] loadPlayerData(Class<?> clazz) {
        return this.objectsData.get(clazz);
    }

}
