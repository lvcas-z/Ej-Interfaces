package Interfaces;

public class Lobo extends Animal implements Ladrador{


    @Override
    public void ladrar() {
        System.out.println("woof woof woof wooof");
    }
}
