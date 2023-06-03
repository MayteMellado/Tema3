//Mayte Mellado Huerta
package TDA;

public class VidaSana {
    
    private static short NumFolio=1000;
    
    private String Nombre;
    private byte Edad;
    private String sexo;
    private double peso;
    private double altura;
    private double IMC;
    private String Estado;
    

public VidaSana(){}

public VidaSana(String Nombre,byte Edad, String sexo,double peso,double altura){
    
    this.Nombre=Nombre;
    this.Edad=Edad;
    this.sexo=sexo;
    this.peso=peso;
    this.altura=altura;
    this.IMC=calcularMC();
    this.Estado=Estado();
    NumFolio++;
    
}
    public short getNumFolio(){
    return NumFolio;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public byte getEdad() {
        return Edad;
    }

    public void setEdad(byte Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Paciente{" + "Num de folio=" + NumFolio + ", Nombre=" + Nombre+ ", Edad=" + Edad+ ", Sexo=" + sexo + ", Peso=" + peso +", Altura="+altura+", IMC="+IMC+ '}';
    }
    public double calcularMC(){
        double IMC = (peso/(Math.pow(altura, 2))); 
        return IMC;
    }
    public String Estado(){
        if (peso<18.5) {
            return "Bajo Peso";
        } else if (peso<18.5&& peso<= 24.9) {
            return "Peso normal";
        } else if (peso<25.0&& peso<= 29.9) {
            return "Sobrepeso";
        } else if (peso<30.0&& peso<= 34.9) {
            return "Obesidad";
        } else if (peso<35.0&& peso<= 39.0) {
            return "Obesidad Severa";
        } else if(peso<40) {
            return "Obesidad Morbida";
        } 
        return null;
    }
}

    

