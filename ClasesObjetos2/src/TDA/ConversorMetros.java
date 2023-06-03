package TDA;

import EntradaSalida.Tools;

public class ConversorMetros {
    
    private double metros;
    private final double METROS_CM = 100;
    private final double METROS_MILIM = 1000;
    private final double METROS_PULGADAS = 39.37;
    private final double METROS_PIES = 3.28;
    private final double METROS_YARDAS = 1.09361;
    
    public ConversorMetros(double metros) {
        this.metros = metros;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }
    
    private double MetrosACentimetros() {
        return (metros * METROS_CM);
    }
    
    private double MetrosAMilimetros() {
        return (metros * METROS_MILIM);
    }
    
    private double MetrosAPulgadas() {
        return (metros * METROS_PULGADAS);
    }
    
    private double MetrosAPies() {
        return (metros * METROS_PIES);
    }
    
    private double MetrosAYardas() {
        return (metros * METROS_YARDAS);
    }
    
    public void menu(){

    int opcion = 0;
        do {
            opcion = Tools.leerInt("Selecciona una opción:\n1. Convertir a centímetros\n2. Convertir a milímetros\n3. Convertir a pulgadas\n4. Convertir a pies\n5. Convertir a yardas\n6. Salir");
            switch(opcion) {
                case 1:
                    Tools.imprimePantalla(metros + " metros = " + MetrosACentimetros()+ " centímetros");
                    break;
                case 2:
                    Tools.imprimePantalla(metros + " metros = " + MetrosAMilimetros() + " milímetros");
                    break;
                case 3:
                    Tools.imprimePantalla(metros + " metros = " + MetrosAPulgadas() + " pulgadas");
                    break;
                case 4:
                    Tools.imprimePantalla(metros + " metros = " + MetrosAPies() + " pies");
                    break;
                case 5:
                    Tools.imprimePantalla(metros + " metros = " + MetrosAYardas() + " yardas");
                    break;
                case 6:
                    Tools.imprimePantalla("Saliendo ...");
                    break;
                default:
                    Tools.salidaError("Opción inválida");
            }
        } while (opcion != 6);
        
    }
  
}