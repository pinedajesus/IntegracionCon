/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import javax.swing.JOptionPane;

/**
 *
 * @author SPARTAN11
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int edad, sumaEdad=0, conteoMayor18=0, contadorMayor175=0;
        float altura, sumaAltura=0, mediaEdad, mediaAltura;
        
        for(int i=1;i<=5;i++){
            
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\ndigite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\ndigite su estatura: "));
            
            sumaEdad += edad;
            sumaAltura += altura;
            
            if(edad > 18){
                conteoMayor18++;
            }
            if(altura > 1.75){
                contadorMayor175++;
            }
        
         }
        
        mediaEdad = (float) sumaEdad/5;
        mediaAltura = (float) sumaAltura/5;     
        
        System.out.println("La edad promedio es: "+mediaEdad);
         System.out.println("La estatura promedio es: "+mediaAltura);
          System.out.println("Cantidad de alumnos mayores a 18 años es: "+conteoMayor18);
           System.out.println("Cantidad de alumnos que miden mas de 1.75 es: "+contadorMayor175);
           
           
           // Primera actualizacion
    }
    
}
