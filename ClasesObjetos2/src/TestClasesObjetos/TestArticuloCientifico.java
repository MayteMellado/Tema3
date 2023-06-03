package TestClasesObjetos;

import TDA.ArticuloCientifico;

public class TestArticuloCientifico {
    public static void main(String[] args) {
        
        ArticuloCientifico articulo = new ArticuloCientifico("Título del artículo", "Autor del artículo", new String[] {"Palabra clave 1", "Palabra clave 2"}, "Nombre de la publicación", 2023 , "Resumen del artículo");
        articulo.imprimirArticulo();
    }
}