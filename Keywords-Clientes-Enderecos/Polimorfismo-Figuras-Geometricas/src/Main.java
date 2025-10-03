import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Quadrado(5));
        figuras.add(new Retangulo(4, 6));
        figuras.add(new Circulo(3));

        for (FiguraGeometrica f : figuras) {
            System.out.println(f.getClass().getSimpleName() + " - Área: " + f.calcularArea());
        }
    }
}
