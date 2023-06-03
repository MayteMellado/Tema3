package TestClasesObjetos;

import TDA.Pedido;
import EntradaSalida.Tools;

public class TestPedido{
    
    public static void main(String[] args) {

        String plato1 ="";
        String plato2 = "";
        String bebida ="";
        String postre ="";
        String sel="";


        Pedido obj = new Pedido();
        obj.setPrimerPlato(Tools.leerString("Ingrese su plato de entrada:\n✓Crema de Espinacas\n✓Ensalada de Verduras" +
                "\n✓Crema de Brocoli\n✓Caldo Tlalpeño\n✓SopaMixteca"));

        obj.setBebida(Tools.leerString("Ingrese que bebida desea agregar:\n✓CocaCola\n✓Pepsi\n✓Naranjada\n✓Limonada\n✓Agua de Sabor"));

        sel = Tools.leerString("Desea agregar un plato fuerte?\nSi/No");
        if(sel.equalsIgnoreCase("si"))
            obj.setSegundoPlato(Tools.leerString("Ingrese su plato fuerte:\n✓Filete de Pescado\n✓Milanesa de Pollo\n✓Bistec a la Mexicana\n" +
                    "✓Pollo en escabeche\n✓Carne Asada\n✓Lomo Relleno\n✓Pollo a la Plancha"));
        else
            obj.setSegundoPlato("a");





        sel = Tools.leerString("Desea agregar un postre?\nSi/No");
        if(sel.equalsIgnoreCase("si"))
            obj.setPostre(Tools.leerString("Ingrese que postre desea agregar:\n✓Pastel Helado\n✓Helado\n✓Fresas con Crema\n✓Platanos Fritos" +
                    "\n✓Flan Casero\n✓Gelatina"));
        else
            obj.setPostre("a");

        obj.precios(obj.getPrimerPlato(),obj.getSegundoPlato(),obj.getBebida(),obj.getPostre());
        plato1 = obj.getPrimerPlato();
        plato2 = obj.getSegundoPlato();
        bebida = obj.getBebida();
        postre = obj.getPostre();

        if(!obj.getPostre().equalsIgnoreCase("a"))
            Tools.imprimePantalla(obj.orden(plato1,plato2,bebida,postre));
        else
            if(!obj.getSegundoPlato().equalsIgnoreCase("a"))
                Tools.imprimePantalla(obj.orden(plato1,plato2,bebida));
            else
                Tools.imprimePantalla(obj.orden(plato1, bebida));

        
    }
}