package Taller7.Ejercicio2;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("987654321", 1500000, "Ahorros");

        // Acceso permitido al atributo público 'tipoCuenta'
        System.out.println("Tipo de cuenta (Público): " + cuenta.tipoCuenta);
        cuenta.mostrarDetalles();

        // Modificación a través de setter público
        cuenta.setSaldo(2000000);
        System.out.println("Nuevo saldo: $" + cuenta.getSaldo());

       
    }
}