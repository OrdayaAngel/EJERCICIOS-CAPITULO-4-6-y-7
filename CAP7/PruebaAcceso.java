public class PruebaAcceso {

    public static void main(String[] args) {

        Alfa alfa = new Alfa();
        Beta beta = new Beta();
        AlfaSub alfaSub = new AlfaSub();
        Gama gama = new Gama();

        System.out.println("Clase Alfa");
        alfa.imprimirCampos();

        System.out.println();

        System.out.println("Clase Beta");
        beta.imprimirCamposDeAlfa();

        System.out.println();

        System.out.println("Clase AlfaSub");
        alfaSub.imprimirCamposHeredados();

        System.out.println();

        System.out.println("Clase Gama");
        gama.imprimirCampoPublico();
    }
}