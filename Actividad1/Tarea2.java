class Coche{
    String marca;
    String modelo;
    double precio;

    Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }
}

class CocheDepotivo extends Coche {
    int velocidadMaxima;
    
    CocheDepotivo(String marca, String modelo, double precio, int velocidadMaxima) {
        super(marca, modelo, precio);
        this.velocidadMaxima = velocidadMaxima;
    }

    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

}

public class Tarea2 {
    public static void main(String[] args) {
        //crear coches normales
        Coche coche1=new Coche("Renault", "Clio", 8000);

        //crear coches deportivos
        CocheDepotivo coche2=new CocheDepotivo("Ferrari", "Enzo", 55000, 345);

        Coche coche3 = new Coche("Lamborghini", "Aventador", 400000);

        //mostrar información(polimorfismo)
        Coche[] coches = {coche1, coche3};
        for (Coche coche : coches) {
            coche.mostrarInfo();
            System.out.println("----");
        }
    }
}