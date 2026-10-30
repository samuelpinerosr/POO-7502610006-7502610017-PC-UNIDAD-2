package Taller7.Ejercicio3;

public class PruebaUtilidades {
    public static void main(String[] args) {
        double a = 15.0;
        double b = 3.0;

        System.out.println("Suma: " + Utilidades.sumar(a, b));
        System.out.println("Resta: " + Utilidades.restar(a, b));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(a, b));
        System.out.println("División: " + Utilidades.dividir(a, b));
        System.out.println("División por cero: " + Utilidades.dividir(a, 0));
    }
}