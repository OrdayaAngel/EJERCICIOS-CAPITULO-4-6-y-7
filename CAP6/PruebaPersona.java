public class PruebaPersona {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Alex", 20);

        persona1.imprimirCampos();

        persona1.setNombre("Beto");
        persona1.setEdad(19);

        System.out.println();

        persona1.imprimirCampos();
    }
}