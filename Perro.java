package Interfaces;

public class Perro extends Animal implements Cuidador,Ladrador{

    @Override
    public void custodiar() {
        System.out.println("estoy cuidando la casa");
    }

    @Override
    public void ladrar() {
        System.out.println("woof woof");
    }
}
