package open_close;

class CalculadoraDescuento {
    private EstrategiaDescuento estrategia;

    public CalculadoraDescuento(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double precio) {
        return estrategia.aplicarDescuento(precio);
    }
}
