package TDA;

public class Salon {
   
    private double largo;
    private double ancho;
    
    public Salon(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double getArea() {
        return (largo*ancho);
    }
    
    public double getAreaNoCubierta(Alfombra[] alfombras) {
        double areaCubierta=0.0;
        for (Alfombra alfombra : alfombras) {
            areaCubierta+=alfombra.getArea();
           
        }return (getArea()-areaCubierta);
        
    }
    
}

