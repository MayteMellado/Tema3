package TestClasesObjetos;

import EntradaSalida.Tools;
import TDA.Salon;
import TDA.Alfombra;

public class TestSalon {
    public static void main(String[] args) {
        Salon salon = new Salon(7.0, 6.5);
        Alfombra alfombra1 = new Alfombra(3.8, 4.6);
        Alfombra alfombra2 = new Alfombra(4.5, 2.3);
       
        
        double areaCubierta = (alfombra1.getArea()+alfombra2.getArea());
        double areaNoCubierta = (salon.getArea()-areaCubierta);
        
        Tools.imprimePantalla("Area del salón es: " + salon.getArea()+"\n"+"Area cubierta por las alfombras es: " + areaCubierta+"\n"+"Area no cubierta por las alfombras es: " + areaNoCubierta);
       
        
    }
}







    

