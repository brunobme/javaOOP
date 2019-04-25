package cubo_3x3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marquesbruno
 */
import java.util.Scanner;

public class CuboAtual {
    public static int [][] quinas = new int[2][8];
    public static int [][] meios = new int[2][12];
    public static String movimentos = "";    
    public static void estadoInicial(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hey jovem, como está seu cubo mágico agora?");
        System.out.println("Comece falando das quinas...");
        for(int i=0; i<2; i++){
            for(int j=0; j<8; j++){
                quinas[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Agora os meios...");
        for(int i=0; i<2; i++){
            for(int j=0; j<12; j++){
                meios[i][j] = teclado.nextInt();
            }
        }
    }
    public static void mostraCubo(){
        System.out.println("+====== Cubo atual ======+");
        for(int i=0; i<2; i++){
            for(int j=0; j<8; j++){
                System.out.print(quinas[i][j]+" ");
            }
            System.out.println();
            for(int j=0; j<12; j++){
                System.out.print(meios[i][j]+" ");
            }
            System.out.println();
        }
    }
}
