package TestClasesObjetos;

import TDA.Empleado;
import EntradaSalida.Tools;

public class TestEmpleado {
    
    public static void main(String arg[]){
    
    Empleado Carlos=new Empleado("Carlos Perez",(byte)25,(byte)40, 180.50);
    Empleado Sonia=new Empleado("Sonia Alvarez",(byte)19,(byte)45, 180.50);
    Empleado Alma=new Empleado("Alma Alvarez",(byte)19,(byte)45, 180.50);
    
    String cad=" Empleado con mayor edad: "+Empleado.mayorEdad(Carlos, Sonia)+"\n";
    cad+="Empleado que trabaja mas horas: "+Empleado.mayorHrsTrabajadas(Carlos, Sonia);
    Tools.imprimePantalla(cad+"\n"+Carlos.toString()+"\n"+Sonia.toString()+"\n"+Alma.toString()+"\n Total de objetos creados:"+Empleado.getConta());
         
    }
}
