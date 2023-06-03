package TDA;

public class Pedido {
    private String primerPlato;
    private String segundoPlato;
    private String postre;
    private String bebida;

    private int pPlato= 0;
    private int sPlato = 0;
    private int pBebida =0;
    private int pPostre =0;
    
    public Pedido(){}

    public Pedido(String primerPlato,String bebida) {
        this.primerPlato = primerPlato;
        this.bebida = bebida;
    }
    public Pedido(String primerPlato,String segundoPlato,String bebida) {
        this(primerPlato,bebida);
        this.segundoPlato= segundoPlato;
        
    }
    public Pedido(String primerPlato, String segundoPlato, String postre, String bebida) {
        this(primerPlato,bebida,segundoPlato);
        this.postre = postre;
       
    }

    public String getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }

    public String getSegundoPlato() {
        return segundoPlato;
    }

    public void setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
    public void precios (String plato1,String plato2,String bebida,String postre) {

        switch (plato1.toLowerCase()) {
            case "crema de espinacas":
                pPlato = 35;
                break;
            case "ensalada de verduras":
                pPlato = 35;
                break;
            case "crema de brocoli":
                pPlato= 30;
                break;
            case "caldo tlalpeño":
                pPlato = 30;
                break;
            case "sopa mixteca":
                pPlato = 25;
                break;
        }

        switch (plato2.toLowerCase()) {
            case "filete de pescado":
                sPlato = 50;
                break;
            case "milanesa de pollo":
                sPlato = 45;
                break;
            case "bistec a la mexicana":
                sPlato = 45;
                break;
            case "pollo en escabeche":
                sPlato = 40;
                break;
            case "carne asada":
                sPlato = 55;
                break;
            case "lomo relleno":
               sPlato = 55;
                break;
            case "pollo a la plancha":
                sPlato = 35;
                break;

        }

        switch (bebida.toLowerCase()) {
            case "cocacola":
                pBebida = 25;
                break;
            case "pepsi":
                pBebida = 22;
                break;
            case "limonada":
                pBebida = 20;
                break;
            case "naranjada":
                pBebida = 20;
                break;
            case "agua de sabor":
                pBebida = 15;
                break;
        }

        switch (postre.toLowerCase()){
            case "pastel helado":
                pPostre = 40;
                break;
            case "helado":
                pPostre = 35;
                break;
            case "fresas con crema":
                pPostre = 35;
                break;
            case "platanos fritos":
                pPostre = 20;
                break;
            case "flan casero":
                pPostre = 20;
                break;
            case "gelatina":
                pPostre = 15;
                break;
        }
    }

    public String orden(String plato1, String bebida){
        String orden ="";

        orden = plato1 + " = " + pPlato + "$\n" +
                bebida + " = " + pBebida + "$\nPrecio total del consumo:" + (pPlato + pBebida) + "$";
        return orden;
    }
    public String orden(String plato1, String plato2, String bebida){
        String orden ="";
        orden = plato1 + " = " + pPlato + "$\n" +
                plato2 + " = " + sPlato + "$\n" +
                bebida + " = " + pBebida + "$\nPrecio total del consumo:" + (pPlato + sPlato + pBebida)+ "$";
        return orden;
    }
    public String orden(String plato1, String plato2, String bebida, String postre){
        String orden ="";
        orden = plato1 + " = " + pPlato + "$\n" +
                plato2 + " = " + sPlato + "$\n" +
                bebida + " = " + pBebida + "$\n" +
                postre + " = " + pPostre + "$\n" +
                "Precio total del consumo:" + (pPlato + sPlato + pBebida + pPostre)+ "$";

        return orden;
    }

}
