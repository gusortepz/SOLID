package open_close;

class DescuentoPremium implements EstrategiaDescuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.15; // 15% de descuento
    }
}

