package clase03;

public class Ejercicio05 {
    public static void main(String[] args) {
        var precioNeto = 660;
        var descuento = 10 * 660 / 100 ;
        var precioFinal = precioNeto - descuento;

        System.out.println("tengo que pagar en total por el ordenador " + precioFinal + "euros en total");
    }
}
