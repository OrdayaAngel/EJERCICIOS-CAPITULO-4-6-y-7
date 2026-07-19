public class Persona {

    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int edad;
    int peso;

    public void imprimirCampos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ap. Paterno: " + apellidoPaterno);
        System.out.println("Ap. Materno: " + apellidoMaterno);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
    }
}