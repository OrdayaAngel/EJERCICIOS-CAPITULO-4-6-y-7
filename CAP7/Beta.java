public class Beta {

    public void imprimirCamposDeAlfa() {

        Alfa alfa = new Alfa();

        System.out.println("Public: " + alfa.campoPublico);
        System.out.println("Protected: " + alfa.campoProtegido);
        System.out.println("Default: " + alfa.campoDefault);
    }
}