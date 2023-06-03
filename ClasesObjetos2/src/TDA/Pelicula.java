package TDA;

import EntradaSalida.Tools;

public class Pelicula {
    
    private String nombre;
    private String director;
    private String genero;
    private int duracion;
    private short año;
    private byte calif;
    
    public String GenAccion = "ACCION",GenComedia = "COMEDIA",GenDrama = "DRAMA",GenSuspenso = "SUSPENSO";
    public int Min60 = 60,Min115 = 115,Min120 = 120,Min150 = 150,Min180 = 180,Min191 = 191,Min210 = 210,Min240 = 240,Min270 = 270;
    

    public Pelicula(String nombre, String director, String genero, int duracion, short año,byte calif) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calif = calif;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public short getAño() {
        return año;
    }

    private void setAño(short año) {
        this.año = año;
    }

    public byte getCalif() {
        return calif;
    }

    private void setCalif(byte calif) {
        this.calif = calif;
    }

    private boolean esPeliculaEpica() {
        return duracion >= 180;
    }
    private String calcularValoracion() {
        if (calif >= 0 && calif <= 2) {
            return "Muy mala";
        } else if (calif > 2 && calif <= 5) {
            return "Mala";
        } else if (calif > 5 && calif <=7) {
            return "Regular";
        } else if (calif > 7 && calif <= 8) {
            return "Buena";
        } else if (calif > 8 && calif <= 10) {
            return "Excelente";
        } else {
            return "Valoración inválida";
        }
    
   }
    private boolean esSimilar(Pelicula Similar) {
        return (this.genero.equalsIgnoreCase(Similar.genero) && this.calif == Similar.calif);
    }
    public void imprimirCartel() {
        
        String Valoracion= Tools.imprimeFrecuencia(calif);
        Tools.imprimePantalla("----------" + nombre + " ----------"+"\n"+Valoracion+"\n Director: " + director+"\n Género: " + genero+"\n Duración: " + duracion + " minutos"+"\n Año: " + año+"\n Calificación: " + calif);
          
    }
   public boolean esPeliculaEpicaa() {
        return esPeliculaEpica();
    }
   public boolean esSimilarr(Pelicula otraPelicula) {
        return esSimilar(otraPelicula);    
    }
   public String calcularValoracionn(){
       return calcularValoracion();
   }
   
  

}
