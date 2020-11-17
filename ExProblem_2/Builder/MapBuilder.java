package Lecture_10_Design_Paterns.ExProblem_2.Builder;
import java.util.Map;
public interface MapBuilder<K, V> {


    Map<K, V> build();
    MapBuilder<K, V> entry(K key, V value);


}
