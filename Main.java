package Interfaces;

public class Main {
    public static void main(String[] args) {
        Cuidador cuidador = new Perro();//Cuidador ahora es de tipo perro
        cuidador.custodiar();//Se aplica el polimorfismo

        Perro Doberman = new Perro();
        Doberman.setName("Tomy");
        System.out.println(Doberman.getName());
        Doberman.ladrar();

        Lobo Siberiano = new Lobo();
        Siberiano.setWeigth(45.0);
        System.out.println(Siberiano.getWeigth());
        Siberiano.ladrar();

        Ladrador ladrador = new Lobo();//Ladrador es de tipo lobo
        ladrador.ladrar();//Se aplica el polimorfismo
    }
}
