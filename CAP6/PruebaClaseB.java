public class PruebaClaseB {

    public static void main(String[] args) {

        ClaseB objeto1 = new ClaseB();
        ClaseB objeto2 = new ClaseB();

        ClaseB.campoStatic = 10;

        System.out.println("Valor desde objeto 1: " + objeto1.campoStatic);
        System.out.println("Valor desde objeto 2: " + objeto2.campoStatic);
        System.out.println("Valor desde la clase: " + ClaseB.campoStatic);

        objeto1.campoStatic = 20;

        System.out.println();

        System.out.println("Nuevo valor desde objeto 1: " + objeto1.campoStatic);
        System.out.println("Nuevo valor desde objeto 2: " + objeto2.campoStatic);
        System.out.println("Nuevo valor desde la clase: " + ClaseB.campoStatic);
    }
}