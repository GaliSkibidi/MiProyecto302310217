import java.util.ArrayList;
import java.util.List;

interface Figura{
    double calcularArea();
    void mostrarInfo();
}

class Circulo implements Figura{
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public void mostrarInfo() {
        System.out.println("Círculo de radio: " + radio + ", Área: " + calcularArea());
    }
}

class Rectangulo implements Figura{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public void mostrarInfo() {
        System.out.println("Rectángulo de ancho: " + ancho + ", alto: " + alto + ", Área: " + calcularArea());
    }
}

class Triangulo implements Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public void mostrarInfo() {
        System.out.println("Triángulo de base: " + base + ", altura: " + altura + ", Área: " + calcularArea());
    }
}

public class Tarea1 {

    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 6));
        figuras.add(new Triangulo(3, 7));

        for (Figura figura : figuras) {
            figura.mostrarInfo();
            System.out.println("----");
        }
    }
}
