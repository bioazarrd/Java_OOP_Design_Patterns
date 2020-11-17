package Lecture_10_Design_Paterns.ExProblem_2.Builder;
public class Car {

    private String make;
    private int horsePower;
    private int fuel;
    //TODO Add 10 more fields;


    public Car() {

    }




    public Car setMake(String make) {
        this.make = make;
        return this;
    }

    public Car setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public Car setFuel(int fuel) {
        this.fuel = fuel;
        return this;
    }
}
