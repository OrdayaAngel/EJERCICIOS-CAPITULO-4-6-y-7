public class Principal {

    public static void main(String[] args) {

        Acciones acciones = new Acciones();

        int numero = 10;

        acciones.imprimirIncremento(numero);
        System.out.println("Valor fuera del método: " + numero);

        System.out.println();

        Persona persona = new Persona();
        persona.edad = 20;

        acciones.imprimirCambioDeEdad(persona);
        System.out.println("Edad fuera del método: " + persona.edad);
    }
}