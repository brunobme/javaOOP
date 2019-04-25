

import Formas.*;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author andre.balan
 */
public class ObjetosGeometricos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        
        byte opcao = 1;
        
        ArrayList<Forma_Geo> objetos = new ArrayList<Forma_Geo>();
        
        Forma_Geo novo_objeto;
        int num = 1;
        
        while (opcao!=0) { 
            System.out.println(""); 
            System.out.println("Entre com a opção: ");
            System.out.println("\t 1 - Adiciona Circulo");
            System.out.println("\t 2 - Adiciona Retângulo ");
            System.out.println("\t 3 - Mostra dados ");
            System.out.println("\t 4 - Area Total ");
            System.out.println("\t 0 - Sair ");
            
            opcao = leitor.nextByte();
            
            switch (opcao) {
                case 1: novo_objeto = new Circulo(num++);
                        novo_objeto.le_dados();
                        objetos.add(novo_objeto);
                        break;    
                
                case 2: novo_objeto = new Retangulo(num++);
                        novo_objeto.le_dados();
                        objetos.add(novo_objeto);                
                        break;  
               
                case 3: for (Forma_Geo obj : objetos)  obj.mostra_dados();                      
                        break; 
                
                case 4: double soma = 0;
                        for (Forma_Geo obj : objetos)  soma += obj.area();  
                        System.out.format("A soma total é: %7.2f" + soma);
                        break;    
                    
                case 0: return;
                
            }
        }
        
    }
}
