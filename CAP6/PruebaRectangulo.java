public class PruebaRectangulo {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(10, 5);

        System.out.println("Rectángulo 1");
        rectangulo1.imprimirCampos();

        System.out.println();

        System.out.println("Rectángulo 2");
        rectangulo2.imprimirCampos();
    }
}   