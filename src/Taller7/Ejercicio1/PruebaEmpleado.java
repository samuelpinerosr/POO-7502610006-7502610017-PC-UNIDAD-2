package Taller7.Ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // 3. Instanciar objeto de Empleado[cite: 7]
        Empleado emp = new Empleado("Carlos Pérez", 2500000);

        // Acceso directo a propiedad pública[cite: 7]
        System.out.println("Nombre inicial: " + emp.nombre);
        emp.nombre = "Carlos A. Pérez";
        System.out.println("Nombre modificado: " + emp.nombre);

        // Acceso mediante getter y setter[cite: 7]
        System.out.println("Salario inicial: $" + emp.getSalario());
        emp.setSalario(-500); // Muestra mensaje de error
        emp.setSalario(3000000); // Asignación válida
        System.out.println("Nuevo salario: $" + emp.getSalario());
    }
}