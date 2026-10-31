import java.util.ArrayList;
import java.util.List;

import Figuras.FiguraGeometrica;
import Figuras.Circulo;
import Figuras.Rectangulo;
import Figuras.Triangulo;

public class Main {

    // https://github.com/JesusGonzalez7777/Ejercicio-15_C-A-Herencia_Abstracta-Figuras.git

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FIGURAS GEOMÉTRICAS ===\n");

        // 1. Almacenar los objetos en una colección de tipo List<FiguraGeometrica> (Polimorfismo)
        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(7.0));
        figuras.add(new Rectangulo(3.0, 8.0));
        figuras.add(new Triangulo(7.0, 7.0, 7.0));

        // 2. Recorrer la colección e invocar los métodos mediante la referencia de la clase base
        for (FiguraGeometrica figura : figuras) {
            figura.mostrarInformacion();
            System.out.println(); // Salto de línea estético entre figuras
        }
    }
}