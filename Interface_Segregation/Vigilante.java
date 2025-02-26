package Interface_Segregation;

class Vigilante implements Trabajador, Durmiente {
    @Override
    public void trabajar() {
        System.out.println("El vigilante esta supervisando el area.");
    }

    @Override
    public void dormir() {
        System.out.println("El vigilante toma una siesta en su turno.");
    }
}
