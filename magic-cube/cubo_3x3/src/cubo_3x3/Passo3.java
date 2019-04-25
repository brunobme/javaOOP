/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo_3x3;
import Moves.*;
/**
 *
 * @author marquesbruno
 */
public class Passo3 {
    public static void passo3(){
        CuboAtual.movimentos+="\nPermutando a última camada:\n";
        while(CuboAtual.meios[0][0]!= 0 || CuboAtual.meios[0][4]!= 4 || CuboAtual.meios[0][5]!= 5 || CuboAtual.meios[0][8]!= 8 ||
            CuboAtual.quinas[0][0]!= 0 || CuboAtual.quinas[0][1]!= 1 || CuboAtual.quinas[0][4]!= 4 || CuboAtual.quinas[0][5]!= 5){
            for(int i = 0; i<4; i++){
                if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 8 && CuboAtual.meios[0][5]== 4 && CuboAtual.meios[0][8]== 5 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 5){
                    Rl.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Rl.movimento(); Ul.movimento(); Rl.movimento(); U.movimento(); R.movimento();//casoU
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 5 && CuboAtual.meios[0][5]== 8 && CuboAtual.meios[0][8]== 4 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 5){
                    R2.movimento(); Ul.movimento(); Rl.movimento(); Ul.movimento(); R.movimento(); U.movimento(); R.movimento(); U.movimento(); R.movimento(); Ul.movimento(); R.movimento();//casoU'
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 4 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 4 && CuboAtual.quinas[0][1]== 0 && CuboAtual.quinas[0][4]== 1 && CuboAtual.quinas[0][5]== 5){
                    Ll.movimento(); B.movimento(); Ll.movimento(); F2.movimento(); L.movimento(); Bl.movimento(); Ll.movimento(); F2.movimento(); L2.movimento();//casoA
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 4 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 1 && CuboAtual.quinas[0][1]== 5 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 0){
                    R.movimento(); Bl.movimento(); R.movimento(); F2.movimento(); Rl.movimento(); B.movimento(); R.movimento(); F2.movimento(); R2.movimento();//casoA'
                    break;
                }else if(CuboAtual.meios[0][0]== 8 && CuboAtual.meios[0][4]== 5 && CuboAtual.meios[0][5]== 4 && CuboAtual.meios[0][8]== 0 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 5){
                    L2.movimento(); R2.movimento(); D.movimento(); L2.movimento(); R2.movimento(); U2.movimento(); L2.movimento(); R2.movimento(); D.movimento(); R2.movimento(); L2.movimento();//casoH
                    break;
                }else if(CuboAtual.meios[0][0]== 5 && CuboAtual.meios[0][4]== 8 && CuboAtual.meios[0][5]== 0 && CuboAtual.meios[0][8]== 4 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 5){
                    L2.movimento(); R2.movimento(); D.movimento(); L2.movimento(); R2.movimento(); U.movimento(); Ll.movimento(); R.movimento(); B2.movimento(); R2.movimento(); L2.movimento(); F2.movimento(); Ll.movimento(); R.movimento(); U2.movimento();//casoZ
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 5 && CuboAtual.meios[0][5]== 4 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 5 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 1){
                    R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Rl.movimento(); F.movimento(); R2.movimento(); Ul.movimento(); Rl.movimento(); Ul.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Fl.movimento();//casoT
                    break;
                }else if(CuboAtual.meios[0][0]== 8 && CuboAtual.meios[0][4]== 4 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 0 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 5 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 1){
                    Rl.movimento(); Ul.movimento(); Fl.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Rl.movimento(); F.movimento(); R2.movimento(); Ul.movimento(); Rl.movimento(); Ul.movimento(); R.movimento(); U.movimento(); Rl.movimento(); U.movimento(); R.movimento();//casoF
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 8 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 4 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 4 && CuboAtual.quinas[0][4]== 1 && CuboAtual.quinas[0][5]== 5){
                    F.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); Ul.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Fl.movimento(); R.movimento();//casoY
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 4 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 4 && CuboAtual.quinas[0][1]== 5 && CuboAtual.quinas[0][4]== 0 && CuboAtual.quinas[0][5]== 1){
                    R.movimento(); Bl.movimento(); Rl.movimento(); F.movimento(); R.movimento(); B.movimento(); Rl.movimento(); Fl.movimento(); R.movimento(); B.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Bl.movimento(); Rl.movimento(); Fl.movimento();//casoE
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 4 && CuboAtual.meios[0][5]== 8 && CuboAtual.meios[0][8]== 5 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 4 && CuboAtual.quinas[0][4]== 1 && CuboAtual.quinas[0][5]== 5){
                    Rl.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Bl.movimento(); Rl.movimento(); B2.movimento(); Ul.movimento(); Bl.movimento(); U.movimento(); Bl.movimento(); R.movimento(); B.movimento(); R.movimento();//casoV
                    break;
                }else if(CuboAtual.meios[0][0]== 4 && CuboAtual.meios[0][4]== 0 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 5 && CuboAtual.quinas[0][5]== 4){
                    L.movimento(); U2.movimento(); Ll.movimento(); U2.movimento(); L.movimento(); Fl.movimento(); Ll.movimento(); Ul.movimento(); L.movimento(); U.movimento(); L.movimento(); F.movimento(); L2.movimento(); U.movimento();//casoR1
                    break;
                }else if(CuboAtual.meios[0][0]== 5 && CuboAtual.meios[0][4]== 4 && CuboAtual.meios[0][5]== 0 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 5 && CuboAtual.quinas[0][5]== 4){
                    Rl.movimento(); U2.movimento(); R.movimento(); U2.movimento(); Rl.movimento(); F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Rl.movimento(); Fl.movimento(); R2.movimento(); Ul.movimento();//casoR2
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 8 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 4 &&
                CuboAtual.quinas[0][0]== 4 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 0 && CuboAtual.quinas[0][5]== 5){
                    F2.movimento(); R.movimento(); U.movimento(); Rl.movimento(); F2.movimento(); L.movimento(); Dl.movimento(); L.movimento(); D.movimento(); L2.movimento();//casoJ1
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 4 && CuboAtual.meios[0][5]== 8 && CuboAtual.meios[0][8]== 5 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 5 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 1){
                    F2.movimento(); Ll.movimento(); Ul.movimento(); L.movimento(); F2.movimento(); Rl.movimento(); D.movimento(); Rl.movimento(); Dl.movimento(); R2.movimento();//casoJ2
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 5 && CuboAtual.meios[0][5]== 4 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 0 && CuboAtual.quinas[0][1]== 4 && CuboAtual.quinas[0][4]== 1 && CuboAtual.quinas[0][5]== 5){
                    Ul.movimento(); Rl.movimento(); U.movimento(); Ll.movimento(); U2.movimento(); R.movimento(); Ul.movimento(); L.movimento(); Rl.movimento(); U.movimento(); Ll.movimento(); U2.movimento(); R.movimento(); Ul.movimento(); L.movimento();//casoN1
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 5 && CuboAtual.meios[0][5]== 4 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 5 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 4 && CuboAtual.quinas[0][5]== 0){
                    U.movimento(); L.movimento(); Ul.movimento(); R.movimento(); U2.movimento(); Ll.movimento(); U.movimento(); Rl.movimento(); L.movimento(); Ul.movimento(); R.movimento(); U2.movimento(); Ll.movimento(); U.movimento(); Rl.movimento();//casoN2
                    break;
                }else if(CuboAtual.meios[0][0]== 0 && CuboAtual.meios[0][4]== 5 && CuboAtual.meios[0][5]== 8 && CuboAtual.meios[0][8]== 4 &&
                CuboAtual.quinas[0][0]== 4 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 5 && CuboAtual.quinas[0][5]== 0){
                    R2.movimento(); D.movimento(); Bl.movimento(); U.movimento(); Bl.movimento(); Ul.movimento(); B.movimento(); Dl.movimento(); R2.movimento(); Fl.movimento(); U.movimento(); F.movimento();//casoG1
                    break;
                }else if(CuboAtual.meios[0][0]== 4 && CuboAtual.meios[0][4]== 5 && CuboAtual.meios[0][5]== 0 && CuboAtual.meios[0][8]== 8 &&
                CuboAtual.quinas[0][0]== 1 && CuboAtual.quinas[0][1]== 4 && CuboAtual.quinas[0][4]== 0 && CuboAtual.quinas[0][5]== 5){
                    R2.movimento(); Dl.movimento(); F.movimento(); Ul.movimento(); F.movimento(); U.movimento(); Fl.movimento(); D.movimento(); R2.movimento(); B.movimento(); Ul.movimento(); Bl.movimento();//casoG2
                    break;
                }else if(CuboAtual.meios[0][0]== 8 && CuboAtual.meios[0][4]== 0 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 4 &&
                CuboAtual.quinas[0][0]== 4 && CuboAtual.quinas[0][1]== 1 && CuboAtual.quinas[0][4]== 5 && CuboAtual.quinas[0][5]== 0){
                    R.movimento(); U.movimento(); Rl.movimento(); F2.movimento(); Dl.movimento(); L.movimento(); Ul.movimento(); Ll.movimento(); U.movimento(); Ll.movimento(); D.movimento(); F2.movimento();//casoG3
                    break;
                }else if(CuboAtual.meios[0][0]== 4 && CuboAtual.meios[0][4]== 8 && CuboAtual.meios[0][5]== 5 && CuboAtual.meios[0][8]== 0 &&
                CuboAtual.quinas[0][0]== 1 && CuboAtual.quinas[0][1]== 4 && CuboAtual.quinas[0][4]== 0 && CuboAtual.quinas[0][5]== 5){
                    Rl.movimento(); Ul.movimento(); R.movimento(); B2.movimento(); D.movimento(); Ll.movimento(); U.movimento(); L.movimento(); Ul.movimento(); L.movimento(); Dl.movimento(); B2.movimento();//casoG4
                    break;
                }else{
                    FtoR.movimento();
                }
            }
            U.movimento();
        }
    }
}
