package TDA;

public class Alfombra {
    private double largo;
    private double ancho;
    
    public Alfombra(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double getArea() {
        return (largo*ancho);
    }
}

