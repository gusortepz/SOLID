package open_close;

class Main {
    public static void main(String[] args) {
        CalculadoraDescuento calculadora = new CalculadoraDescuento(new DescuentoVIP());
        System.out.println(calculadora.calcular(100)); // 10.0
        calculadora = new CalculadoraDescuento(new DescuentoPremium());
        System.out.println(calculadora.calcular(100)); // 15.0
    }
}