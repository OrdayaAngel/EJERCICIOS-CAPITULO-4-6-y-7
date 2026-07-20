public class PruebaPersona {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setNombre("Alberto");
        persona1.setApellidoPaterno("Arenas");
        persona1.setApellidoMaterno("Aguirre");

        persona1.imprimirCampos();
    }
}