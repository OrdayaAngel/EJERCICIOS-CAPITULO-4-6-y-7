public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
        base = 1;
        altura = 1;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {
        return base * altura;
    }

    public void imprimirCampos() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }
}