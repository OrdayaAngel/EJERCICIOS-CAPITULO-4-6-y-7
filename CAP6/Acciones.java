public class Acciones {

    public void imprimirIncremento(int numero) {
        numero++;
        System.out.println("Valor dentro del método: " + numero);
    }

    public void imprimirCambioDeEdad(Persona persona) {
        persona.edad = 30;
        System.out.println("Edad dentro del método: " + persona.edad);
    }
}