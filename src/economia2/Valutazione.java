/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economia2;
import java.lang.Math;
import static economia2.giudiziFuzzy.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.*;


public  class   Valutazione{   
    
    // I nostri pesi alfa1...alfa5 normalizzati
    private static final double specTecniche1=0.52;
    private static final double comfort1=0.28;
    private static final double peso1=0.03;
    private static final double prezzo1=0.14;
    private static final double estetica1=0.03;
    private static List<Double>  alfa1 = new ArrayList<>(Arrays.asList(peso1,prezzo1,specTecniche1,
            estetica1,comfort1));
    private static List<String> valori1 = new ArrayList<>();
     private static final double specTecniche2=0.47;
    private static final double comfort2=0.14;
    private static final double peso2=0.08;
    private static final double prezzo2=0.27;
    private static final double estetica2=0.04;
    private static List<Double>  alfa2 = new ArrayList<>(Arrays.asList(peso2,prezzo2,specTecniche2,
            estetica2,comfort2));
    private static List<String> valori2 = new ArrayList<>(); 
    private static final double specTecniche3=0.32;
    private static final double comfort3=0.14;
    private static final double peso3=0.28;
    private static final double prezzo3=0.08;
    private static final double estetica3=0.18;
    private static List<Double>  alfa3 = new ArrayList<>(Arrays.asList(peso3,prezzo3,specTecniche3,
            estetica3,comfort3));
    private static List<String> valori3 = new ArrayList<>();
    private static final double specTecniche4=0.52;
    private static final double comfort4=0.06;
    private static final double peso4=0.03;
    private static final double prezzo4=0.12;
    private static final double estetica4=0.27;
    private static List<Double>  alfa4 = new ArrayList<>(Arrays.asList(peso4,prezzo4,specTecniche4,
            estetica4,comfort4));
    private static List<String> valori4 = new ArrayList<>(); 
    private static final double specTecniche5=0.29;
    private static final double comfort5=0.11;
    private static final double peso5=0.07;
    private static final double prezzo5=0.50;
    private static final double estetica5=0.03;
    private static List<Double>  alfa5 = new ArrayList<>(Arrays.asList(peso5,prezzo5,specTecniche5,
            estetica5,comfort5));
    private static List<String> valor5 = new ArrayList<>();
    public Valutazione (){
        
        
    }

     public static String getValutazionePercentuale(List<String> l){
         
        // INIT variabili 
        
         String frase = null;
         Iterator<String> i = l.iterator();
         Iterator<Double> i1 =alfa1.iterator();
         Iterator<Double> i2 =alfa2.iterator();
         Iterator<Double> i3 =alfa3.iterator();
         Iterator<Double> i4 =alfa4.iterator();
         Iterator<Double> i5 =alfa5.iterator();
         
         double risultato1=0.0;
         double risultato2=0.0;
         double risultato3=0.0;
         double risultato4=0.0;
         double risultato5=0.0;
        
         while(i.hasNext() && i2.hasNext()){

             giudiziFuzzy curr;
             // @vars  per i valori fuzzy triangolari(a,b,c)

             curr = giudiziFuzzy.valueOf(i.next());
             // DEBUG : System.out.println(curr);
            
             double delta1=i1.next();
             double delta2=i2.next();
             double delta3=i3.next();
             double delta4=i4.next();
             double delta5=i5.next();
             
           risultato1+=deFuzzyBaricentro(curr.getI()*delta1,curr.getJ()*delta1
                     ,curr.getK()*delta1);
           risultato2+=deFuzzyBaricentro(curr.getI()*delta2,curr.getJ()*delta2
                     ,curr.getK()*delta2);
           risultato3+=deFuzzyBaricentro(curr.getI()*delta3,curr.getJ()*delta3
                     ,curr.getK()*delta3);
           risultato4+=deFuzzyBaricentro(curr.getI()*delta4,curr.getJ()*delta4
                     ,curr.getK()*delta4);
           risultato5+=deFuzzyBaricentro(curr.getI()*delta5,curr.getJ()*delta5
                     ,curr.getK()*delta5);    
              }
         
         System.out.println(risultato1);
        System.out.println(risultato2);
        System.out.println(risultato3);
        System.out.println(risultato4);
        System.out.println(risultato5);
        double maximus = maxim(risultato1,risultato2,risultato3,risultato4,risultato5);
        System.out.println(maximus);
        
       if (maximus==risultato1)
           frase="Mercato1 \n 1)Microsoft surface laptop\n 2)DELL xps 15\n 3)Asus ROG 15 GLS0UL ";
       else if (maximus==risultato2)
           frase="Mercato2 \n 1)Asus zeenbook 3 ux39a\n 2)Microsoft surface laptop\n 3)DELL xps 15 ";
       else if (maximus==risultato3)
           frase="Mercato3 \n 1)Asus zeenbook 3 ux39a\n 2)Microsoft surface laptop";
       else if (maximus==risultato4)
          frase="Mercato 4 \n 1)Asus ROG 15 GLS0UL\n 2)Microsoft surface laptop\n 3Asus zeenbook 3 ux39a\n 4)DELL xps 15";
       else frase="Mercato5 \n 1)Asus zeenbook 3 ux39a";
       
       
       
          return frase;

     }
   
   public static double deFuzzyBaricentro(double a,double b,double c){
       
       return (a+b+c)/3;
       
       
   }
   public static double maxim(double x1,double x2,double x3,double x4,double x5){
   
   return Math.max(x1,Math.max(x2,Math.max(x3,Math.max(x4,x5))));   
    }
    
    
    
    
}
