package Figuras;

public class Triangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        // Validación de dimensiones positivas
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Los lados del triángulo deben ser mayores a cero.");
        }

        // Validación de Desigualdad Triangular: a + b > c, a + c > b, b + c > a
        if (!(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)) {
            throw new IllegalArgumentException("Los valores ingresados no cumplen con la desigualdad triangular.");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        // Fórmula de Herón
        double s = calcularPerimetro() / 2.0; // Semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Figura: Triángulo");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Perímetro: %.2f\n", calcularPerimetro());
    }
}