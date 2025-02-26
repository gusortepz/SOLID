package Liskov_Substitution;

abstract class Ave {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
