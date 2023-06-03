package TestClasesObjetos;

import EntradaSalida.Tools;
import TDA.ConversorMetros;

public class TestConversorMetros {
    public static void main(String[] args) {
        double metros = Tools.leerDouble("Introduce la cantidad de metros a convertir:");
        ConversorMetros conversor = new ConversorMetros(metros);
        conversor.menu();
    }
}

    