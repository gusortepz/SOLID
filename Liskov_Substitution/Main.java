package Liskov_Substitution;

public class Main {
    public static void main(String[] args) {
        AveVoladora aguila = new Aguila();
        AveNoVoladora pinguino = new Pinguino();
        aguila.volar();
        pinguino.caminar();
    }
}
