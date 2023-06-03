package TDA;

import EntradaSalida.Tools;

public class ArticuloCientifico {
    private String titulo;
    private String autor;
    private String[] palabrasClaves;
    private String publicacion;
    private int año;
    private String resumen;
    
    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String publicacion, int año) {
        this(titulo, autor);
        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.año = año;
    }
    
    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String publicacion, int año, String resumen) {
        this(titulo, autor, palabrasClaves, publicacion, año);
        this.resumen = resumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String[] getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setPalabrasClaves(String[] palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public void imprimirArticulo() {
        String mensaje = "Título: " + titulo + "\n" +"Autor: " + autor + "\n";
    if (palabrasClaves != null) {
        mensaje += "Palabras clave:\n";
        for (String palabra : palabrasClaves) {
            mensaje += "- " + palabra + "\n";
        }
    }
    mensaje += "Publicación: " + publicacion + "\n" +"Año: " + año + "\n";
    if (resumen != null) {
        mensaje += "Resumen: " + resumen + "\n";
    }
    Tools.imprimePantalla(mensaje);
      }
    }
