public class PruebaClaseA {

    public static void main(String[] args) {

        ClaseA objeto1 = new ClaseA();
        ClaseA objeto2 = new ClaseA();

        objeto1.campoInstancia = 10;
        objeto2.campoInstancia = 20;

        ClaseA.campoCompartido = 30;

        System.out.println("Objeto 1");
        System.out.println("Campo de instancia: " + objeto1.campoInstancia);
        System.out.println("Campo compartido: " + objeto1.campoCompartido);

        System.out.println();

        System.out.println("Objeto 2");
        System.out.println("Campo de instancia: " + objeto2.campoInstancia);
        System.out.println("Campo compartido: " + objeto2.campoCompartido);

        System.out.println();

        objeto1.campoCompartido = 50;

        System.out.println("Nuevo valor compartido");
        System.out.println("Objeto 1: " + objeto1.campoCompartido);
        System.out.println("Objeto 2: " + objeto2.campoCompartido);
        System.out.println("Clase A: " + ClaseA.campoCompartido);
    }
}