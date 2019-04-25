/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo_3x3;
import Moves.*;

/**
 Exemplo de entrada de dados:
5 1 2 3 4 0 6 7 
1 1 0 0 1 0 0 0
9 4 2 1 8 3 6 7 5 0 10 11
1 0 0 0 1 1 0 0 1 1 0 0
* 
 * @author marquesbruno
 */
public class Cubo_3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuboAtual.estadoInicial();
        Passo1.passo1();
        Passo2.passo2();
        Passo3.passo3();
        System.out.println("\n\n\n+=============== Movimentos ===============+\n\n" + CuboAtual.movimentos); 
        CuboAtual.mostraCubo();

        
    }
    
}
