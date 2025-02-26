package Interface_Segregation;

class Main {
    public static void main(String[] args) {
        Programador programador = new Programador();
        programador.trabajar();
        programador.comer();

        Vigilante vigilante = new Vigilante();
        vigilante.trabajar();
        vigilante.dormir();
    }
}