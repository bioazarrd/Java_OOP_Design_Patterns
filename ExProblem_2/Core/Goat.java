package Lecture_10_Design_Paterns.ExProblem_2.Core;
public class Goat {

    private Eat eat;

    public Goat(Eat eat) {
        this.eat = eat;
    }


    public void consumeFood() {
        this.eat.eat();
    }



}
