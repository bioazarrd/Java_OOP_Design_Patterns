package Lecture_10_Design_Paterns.ExProblem_2.Shared;
import Lecture_10_Design_Paterns.ExProblem_2.Model.GameObject;
import java.util.List;

public interface ProduceMultiple {


    List<GameObject> produce();

    void setFactories(List<Factory> objectFactory);
}
