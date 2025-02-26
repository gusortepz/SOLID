package open_close;

class DescuentoNormal implements EstrategiaDescuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.05; // 5% de descuento
    }
}
