package TestClasesObjetos;

import TDA.Pelicula;
import EntradaSalida.Tools;

public class TestPelicula {
    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula("Gandhi ", "Richard Attenborough","DRAMA" , 191, (short) 1982,(byte)8); 
        Pelicula peli2 = new Pelicula("Thor ", "Kenneth Branagh", "ACCION", 115, (short) 2011,(byte)7 );
        
        peli1.imprimirCartel();
        peli2.imprimirCartel();

        Tools.imprimePantalla("¿Es " + peli1.getNombre() + " una película épica? " + peli1.esPeliculaEpicaa());
        Tools.imprimePantalla("¿Es " + peli2.getNombre() + " una película épica? " + peli2.esPeliculaEpicaa());

        Tools.imprimePantalla("Valoración de " + peli1.getNombre() + ": " + peli1.calcularValoracionn());
        Tools.imprimePantalla("Valoración de " + peli2.getNombre() + ": " + peli2.calcularValoracionn());

        Tools.imprimePantalla("¿Son similares " + peli1.getNombre() + " y " + peli2.getNombre() + "? " +peli1.esSimilarr(peli2) );
    }

    
}
   

    

       
    


