
package TDA;

public class AsistenteBoda {
    private String nombre;
    private int edad;
    private String sexo;
    private String estadoCivil;
    
    
    private static int totalHombres = 0;
    private static int totalMujeres = 0;
    private static int totalCasados = 0;
    private static int totalSolteros = 0;
    private static int totalViudos = 0;
    private static int totalSeparados = 0;
    private static int totalDivorciados = 0;
    private static int edadMayor = 0;
    private String nombreMayor = "";
    private int edadMenor = Integer.MAX_VALUE;
    private String nombreMenor = "";
    
    public AsistenteBoda(String nombre, int edad, String sexo, String estadoCivil) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.estadoCivil = estadoCivil;
    this.totalHombres = 0;
    this.totalMujeres = 0;
    this.totalCasados = 0;
    this.totalSolteros = 0;
    this.totalViudos = 0;
    this.totalSeparados = 0;
    this.totalDivorciados = 0;
    this.edadMayor = 0;
    this.nombreMayor = "";
    this.edadMenor = Integer.MAX_VALUE;
    this.nombreMenor = "";
        
        if (sexo.equalsIgnoreCase("masculino")) {
            totalHombres++;
        } else {
            totalMujeres++;
        }
        
        switch(estadoCivil.toLowerCase()) {
            case "soltero":
            case "soltera":
                totalSolteros++;
                break;
            case "casado":
            case "casada":
                totalCasados++;
                break;
            case "viudo":
            case "viuda":
                totalViudos++;
                break;
            case "separado":
            case "separada":
                totalSeparados++;
                break;
            case "divorciado":
            case "divorciada":
                totalDivorciados++;
                break;
        }
        
        if (edad > edadMayor) {
            edadMayor = edad;
            nombreMayor = nombre;
        }
        
        if (edad < edadMenor) {
            edadMenor = edad;
            nombreMenor = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getTotalHombres() {
        return totalHombres;
    }

    public void setTotalHombres(int totalHombres) {
        this.totalHombres = totalHombres;
    }

    public int getTotalMujeres() {
        return totalMujeres;
    }

    public void setTotalMujeres(int totalMujeres) {
        this.totalMujeres = totalMujeres;
    }

    public int getTotalCasados() {
        return totalCasados;
    }

    public void setTotalCasados(int totalCasados) {
        this.totalCasados = totalCasados;
    }

    public int getTotalSolteros() {
        return totalSolteros;
    }

    public void setTotalSolteros(int totalSolteros) {
        this.totalSolteros = totalSolteros;
    }

    public int getTotalViudos() {
        return totalViudos;
    }

    public void setTotalViudos(int totalViudos) {
        this.totalViudos = totalViudos;
    }

    public int getTotalSeparados() {
        return totalSeparados;
    }

    public void setTotalSeparados(int totalSeparados) {
        this.totalSeparados = totalSeparados;
    }

    public int getTotalDivorciados() {
        return totalDivorciados;
    }

    public void setTotalDivorciados(int totalDivorciados) {
        this.totalDivorciados = totalDivorciados;
    }

    public int getEdadMayor() {
        return edadMayor;
    }

    public void setEdadMayor(int edadMayor) {
        this.edadMayor = edadMayor;
    }

    public String getNombreMayor() {
        return nombreMayor;
    }

    public void setNombreMayor(String nombreMayor) {
        this.nombreMayor = nombreMayor;
    }

    public int getEdadMenor() {
        return edadMenor;
    }

    public void setEdadMenor(int edadMenor) {
        this.edadMenor = edadMenor;
    }

    public String getNombreMenor() {
        return nombreMenor;
    }

    public void setNombreMenor(String nombreMenor) {
        this.nombreMenor = nombreMenor;
    }
}