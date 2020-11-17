package Lecture_10_Design_Paterns.ExProblem_2.Core;
import Lecture_10_Design_Paterns.ExProblem_2.Builder.Car;
import Lecture_10_Design_Paterns.ExProblem_2.Command.CommandInterpreter;
import Lecture_10_Design_Paterns.ExProblem_2.Command.CommandListener;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Enemy;
import Lecture_10_Design_Paterns.ExProblem_2.Model.GameObject;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Initializer;
import Lecture_10_Design_Paterns.ExProblem_2.Model.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static List<GameObject> gameObjects;
    public static Player player;
    public static Enemy enemy;
    public static Field field;



    public static void main(String[] args) throws InterruptedException {

        //Goat goat1 = new Goat(new EatStarving());
        //Goat goat2 = new Goat(new EatNotHungry());
        //Goat goat3 = new Goat(new EatJunkFood());
        //
        //goat1.consumeFood();
        //goat2.consumeFood();
        //goat3.consumeFood();



        Car car = new Car();
        car.setMake("Ford").
                setHorsePower(10).
                setFuel(12);


        Scanner scanner = new Scanner(System.in);
        gameObjects = Initializer.init();
        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof Player) {
                player = (Player) gameObject;
            } else if (gameObject instanceof Enemy) {
                enemy = (Enemy)gameObject;
            } else if (gameObject instanceof Field) {
                field = (Field)gameObject; 
            }
        }

        CommandListener handler = new CommandInterpreter();

        boolean gameOver = false;
        String input = "";


        while (!gameOver) {
            ArrayList<GameObject> copy = new ArrayList<>(Main.gameObjects);
            for (GameObject gameObject : copy) {
                gameObject.update();
                gameObject.rendered();
            }
            Thread.sleep(500);


            System.out.println();
            System.out.println();
            System.out.println("=======================================");
            System.out.println("Enter new Command");
            input = scanner.nextLine();

            try {
                handler.handleCommand(input);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println();
            System.out.println();
            input = "";
        }
    }
}