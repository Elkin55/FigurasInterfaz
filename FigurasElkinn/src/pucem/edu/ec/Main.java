package pucem.edu.ec;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo(8, 5);
        FiguraGeometrica triangulo = new Triangulo(14, 2);
        FiguraGeometrica circulo = new Circulo(7);

        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);
    }
}
