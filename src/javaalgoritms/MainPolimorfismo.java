
package javaalgoritms;
/*
 * @author BRIAN
 */
public class MainPolimorfismo {
    
    public static void main (String[] args){
        Polimorfismo aux=new Polimorfismo();
        System.out.println("Suma de Enteros: "+aux.sumar(12, 14));
        System.out.println("Suma de Doubles: "+aux.sumar(33.4, 3.7));
        System.out.println("Suma de Cadenas: "+aux.sumar("Concatena", " Palabras"));
        System.out.println("Concatenación: "+aux.sumar("Cambio desde", "repositorio"));
    }
}
