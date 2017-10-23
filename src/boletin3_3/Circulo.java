package boletin3_3;

/**
 *
 * @author quique
 */
public class Circulo {
    
    double radio;
    public final double pi = 3.14;
    
    public Circulo() {}
    public Circulo(double radio){
   
        this.radio = radio;
        
    }
    
    public void setRadio(double radio){
    
        this.radio = radio;
    }
    
    
    public double getRadio(){
        
        return radio;
    }
    
    
   /* public void setPi (double pi) {
    
    }
    */
    
    public double getPi (){
    
        return pi;
    }
    
    public double calcularArea (){
    
    double area = pi * Math.pow(radio,2);
        
    return area;
    
    }
    
    public double calcularLongitud (){
        
        double longitud = 2*pi*radio;
        
        return longitud;
        
    }
}
