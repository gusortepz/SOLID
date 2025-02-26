package Liskov_Substitution;

class AveVoladora extends Ave {
    public AveVoladora(String nombre) {
        super(nombre);
    }

    public void volar() {
        System.out.println(getNombre() + " esta volando.");
    }
}
