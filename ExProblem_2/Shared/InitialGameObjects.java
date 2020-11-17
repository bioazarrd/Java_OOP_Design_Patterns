package Lecture_10_Design_Paterns.ExProblem_2.Shared;
import Lecture_10_Design_Paterns.ExProblem_2.Model.GameObject;
import Lecture_10_Design_Paterns.ExProblem_2.Core.Field;
import java.util.ArrayList;
import java.util.List;
public class InitialGameObjects implements ProduceMultiple {

    private List<Factory> objectFactories;
    public InitialGameObjects() {
        this.objectFactories = new ArrayList<>();
    }


    @Override
    public List<GameObject> produce() {
        List<GameObject> gameObjects = new ArrayList<>();
        for (Factory objectFactory : objectFactories) {
            gameObjects.add(objectFactory.produce());
        }

        gameObjects.add(new Field());
        return gameObjects;
    }



    @Override
    public void setFactories(List<Factory> objectFactories) {
        this.objectFactories = objectFactories;
    }
}
