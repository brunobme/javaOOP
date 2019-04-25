package Formas;



import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre.balan
 */
public class Circulo extends Forma_Geo {
    public double raio;
  
    public  Circulo(int numero) {
          this.numero = numero;
    }
    
    @Override
    public void le_dados() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com dados do Círculo");
        
        System.out.print("\t Raio: ");
        raio = leitor.nextDouble();
        System.out.print("\t Centro_X: ");
        centro_x = leitor.nextDouble();
        System.out.print("\t Centro_Y: ");
        centro_y = leitor.nextDouble();
    }

    
    @Override
    public void mostra_dados() {
        System.out.println("Dados do Círculo # " + numero);
        
        System.out.println("\t Número: " + numero);
        
        System.out.println("\t Raio: " + raio);
        
        System.out.println("\t Centro_X: " + centro_x + "  Centro_Y: " + centro_y);
        
        System.out.format("\t Area: %7.2f \n", area());
        System.out.format("\t Perimetro: %7.2f \n", perimetro());
        
        System.out.println("");
    }

    
    @Override
    public double area() {
         return Math.PI*raio*raio;
    }
   
    @Override
    public double perimetro() {
       return Math.PI*2*raio;
    }
    
}
