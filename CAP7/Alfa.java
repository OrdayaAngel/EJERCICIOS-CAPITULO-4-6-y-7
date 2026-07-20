public class Alfa {

    public int campoPublico = 10;
    protected int campoProtegido = 20;
    int campoDefault = 30;
    private int campoPrivado = 40;

    public void imprimirCampos() {
        System.out.println("Public: " + campoPublico);
        System.out.println("Protected: " + campoProtegido);
        System.out.println("Default: " + campoDefault);
        System.out.println("Private: " + campoPrivado);
    }
}   