package TestClasesObjetos;

import EntradaSalida.Tools;
import TDA.AsistenteBoda;

public class TestAsistenteBoda {
    public static void main(String[] args) {
        String respuesta = "s";
        String nombre;
        int edad;
        String sexo;
        String estadoCivil;
        String datos = "";
        
        while (respuesta.equalsIgnoreCase("s")) {
            nombre = Tools.leerString("Ingrese el nombre del asistente:");
            edad = Tools.leerInt("Ingrese la edad del asistente:");
            sexo = Tools.leerString("Ingrese el sexo del asistente (femenino o masculino):");
            estadoCivil = Tools.leerString("Ingrese el estado civil del asistente (solter@, casad@, viud@, separad@, divorciad@):");
            
            
            AsistenteBoda asistente = new AsistenteBoda(nombre, edad, sexo, estadoCivil);
            
            datos += "Nombre: " + asistente.getNombre() + "\n";
            datos += "Edad: " + asistente.getEdad() + "\n";
            datos += "Sexo: " + asistente.getSexo() + "\n";
            datos += "Estado Civil: " + asistente.getEstadoCivil() + "\n";
            datos += "\n";
            
            respuesta = Tools.leerString("¿Desea ingresar otro asistente? (s/n)");
        }
        
        Tools.imprimePantalla("Los datos de los asistentes son:\n" + datos);
    }
}
    

