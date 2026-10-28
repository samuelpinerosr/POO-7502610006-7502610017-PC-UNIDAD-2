package Taller8.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Samuel", 3000000);

        Gerente gerente = new Gerente(
                "Rio", 8000000, "Finanzas"
        );

        empleado.mostrarDetalles();

        System.out.println();
        gerente.mostrarDetalles();
    }
}