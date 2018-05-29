package economia2;
import java.util.*;



public enum giudiziFuzzy{

    // Specifiche Tecniche && Comfort
    pessimo (0,1,3),
    decente(1,3,5),
    buono (3,5,7),
    ottimo (5,7,9),
    eccellente (7,9,10),
    // Peso
    molto_pesante (0,1,3),
    pesante (1,3,5),
    abbastanza_leggero (3,5,7),
    leggero (5,7,9),
    molto_leggero (7,9,10),
    // Estetica
    molto_brutto (0,1,3),
    brutto (1,3,5),
    abbastanza_bello (3,5,7),
    bello (5,7,9),
    molto_bello (7,9,10),
    // Prezzo
    molto_costoso   (0,1,3),
    costoso (1,3,5),
    abbastanza_economico (3,5,7),
    economico (5,7,9),
    molto_economico (7,9,10);




    private final int i;
    private final int j;
    private final int k;
    private giudiziFuzzy(int a,int b,int c){ i=a; j=b; k=c;}


    public int getI(){return i;}
    public int getJ(){return j;}
    public int getK(){return k;}

    public static String[] getValues(){

        String[] valori = new String[5];
        int cont=0;
        for (giudiziFuzzy gf : giudiziFuzzy.values()){
            String name = gf.name();
            int i=gf.getI();
            int j=gf.getJ();
            int k=gf.getK();
            valori[cont]=(name);
            cont++;
        }
        return valori;
    }


}