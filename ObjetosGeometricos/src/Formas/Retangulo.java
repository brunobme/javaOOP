package Formas;

import java.util.Scanner;


public class Retangulo extends Forma_Geo {
    
    public double lado1, lado2;
    
    public  Retangulo(int numero) {
          this.numero = numero;
    }
    
    
    @Override
    public void le_dados() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com dados do Retângulo");
        
        System.out.print("\t Lado1: ");
        lado1 = leitor.nextDouble();
        System.out.print("\t Lado2: ");
        lado2 = leitor.nextDouble();
        System.out.print("\t Centro_X: ");
        centro_x = leitor.nextDouble();
        System.out.print("\t Centro_Y: ");
        centro_y = leitor.nextDouble();
        
        
    }
    

    @Override
    public void mostra_dados() {
        if (lado1==lado2) System.out.println("Dados do Quadrado # " + numero);
        else  System.out.println("Dados do Retângulo # " + numero);     
        
        System.out.println("\t Número: " + numero);
        
        System.out.println("\t Lado1: " + lado1);
        System.out.println("\t Lado2: " + lado2);
        
        System.out.println("\t Centro_X: " + centro_x + "  Centro_Y: " + centro_y);
        
        System.out.format("\t Area: %7.2f \n", area());
        System.out.format("\t Perimetro: %7.2f \n", perimetro());
        
        System.out.println(""); 
    }

    @Override
    public double area() {
        return lado1*lado2;
    }

    @Override
    public double perimetro() {
        return (lado1+lado2)*2;
    }
    
}
