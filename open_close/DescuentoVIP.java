package open_close;

class DescuentoVIP implements EstrategiaDescuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.10; // 10% de descuento
    }
}
