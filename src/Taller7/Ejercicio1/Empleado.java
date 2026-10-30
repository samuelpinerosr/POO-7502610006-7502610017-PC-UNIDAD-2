package Taller7.Ejercicio1;

public class Empleado {
    // 1. La propiedad nombre debe ser pública[cite: 7]
    public String nombre;

    // Propiedad salario privada[cite: 7]
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    // 2. Métodos get y set públicos para salario con validación[cite: 7]
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario debe ser mayor a 0.");
        }
    }
}