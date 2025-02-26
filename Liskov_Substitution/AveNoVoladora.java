package Liskov_Substitution;

class AveNoVoladora extends Ave {
    public AveNoVoladora(String nombre) {
        super(nombre);
    }

    public void caminar() {
        System.out.println(getNombre() + " esta caminando.");
    }
}
