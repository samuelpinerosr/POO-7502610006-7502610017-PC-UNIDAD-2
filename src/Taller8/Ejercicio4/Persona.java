package Taller8.Ejercicio4;

class Persona {
    private String nombre = "Samuel";

    public String getNombre() {
        return nombre;
    }
}

class Estudiante extends Persona {
    void mostrarNombre() {
        System.out.println(getNombre());
    }
}

/*
class Persona {
    private String nombre = "Samuel";
}

class Estudiante extends Persona {
    void mostrarNombre() {
        System.out.println(nombre); // Error de compilación
    }
}
 */