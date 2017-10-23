package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class Boletin3_3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Circulo circulo1 = new Circulo();
        
        System.out.println("Inserta el radio:");
        circulo1.setRadio(sc.nextDouble());
        
        System.out.println(circulo1.getRadio());
        
        
        System.out.println("Pi: " + circulo1.getPi());
        
        System.out.println("Calcular area:");
        
        System.out.println(circulo1.calcularArea());
        
        System.out.println("Calcular longitud");
        
        System.out.println(circulo1.calcularLongitud());
    }
    
}
