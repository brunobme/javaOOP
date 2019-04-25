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
public class Passo1 {
    public static void passo1(){
        int meios_rest = 4;
            CuboAtual.movimentos+="Permutando a 2ª camada:\n";
            while((CuboAtual.meios[0][1] != 1 || CuboAtual.meios[0][9] != 9 || CuboAtual.meios[0][11] != 11 || CuboAtual.meios[0][3] != 3) || 
                    (CuboAtual.meios[1][1] != 0 || CuboAtual.meios[1][9] != 0 || CuboAtual.meios[1][11] != 0 || CuboAtual.meios[1][3] != 0)){
                if(CuboAtual.meios[0][1] == 1 || CuboAtual.meios[0][9] == 1 || CuboAtual.meios[0][11] == 1 || CuboAtual.meios[0][3] == 1){
                    if(CuboAtual.meios[0][1] == 1){
                        if(CuboAtual.meios[1][1] == 0){
                            FtoR.movimento();
                            meios_rest--;
                        }else{
                            R.movimento(); Ul.movimento(); Rl.movimento(); U.movimento(); Fl.movimento(); U2.movimento(); F.movimento(); U2.movimento(); Fl.movimento(); U.movimento(); F.movimento();
                            FtoR.movimento();
                            meios_rest--;
                        }
                    }else if(CuboAtual.meios[0][9]== 1){
                        R2.movimento(); U2.movimento(); R2.movimento(); U2.movimento(); R2.movimento();
                        if(CuboAtual.meios[1][1]== 0){
                            FtoR.movimento();
                            meios_rest--;
                        }
                    }else if(CuboAtual.meios[0][3]== 1 && meios_rest == 4){
                        F2.movimento(); U2.movimento(); F2.movimento(); U2.movimento(); F2.movimento();
                        if(CuboAtual.meios[1][1]== 0){
                            FtoR.movimento();
                            meios_rest--;
                        }
                    }else if(meios_rest > 2){
                        FtoR.movimento();
                    }else if(CuboAtual.meios[0][11]== 1 && CuboAtual.meios[0][1]==11 && meios_rest == 2){
                        R.movimento();
                        Ul.movimento();
                        Rl.movimento();
                        F.movimento();
                        Rl.movimento();
                        Fl.movimento();
                        R.movimento();
                        FtoR.movimento();
                        FtoR.movimento();
                    }else if(CuboAtual.meios[0][11]== 1 && CuboAtual.meios[0][1]==11 && CuboAtual.meios[0][9]== 3 && CuboAtual.meios[0][3]==9){
                        R.movimento();
                        Ul.movimento();
                        Rl.movimento();
                        F.movimento();
                        Rl.movimento();
                        Fl.movimento(); 
                        R.movimento();
                        FtoR.movimento();
                    }
                }else{
                    while(CuboAtual.meios[0][1] != 1){
                        if((CuboAtual.meios[0][8]==1 && CuboAtual.meios[1][8]==1)||(CuboAtual.meios[0][0]==1 && CuboAtual.meios[1][0]==1)||
                                (CuboAtual.meios[0][5]==1 && CuboAtual.meios[1][5]==0)||(CuboAtual.meios[0][4]==1 && CuboAtual.meios[1][4]==0)){
                            if(CuboAtual.meios[0][8]==1){
                                Fl.movimento();
                                U.movimento();
                                F.movimento();
                                Rl.movimento();
                                F.movimento();
                                R.movimento();
                                Fl.movimento();
                                FtoR.movimento();
                                meios_rest--;
                                break;
                            }else if(CuboAtual.meios[0][0]==1){
                                U2.movimento();
                            }else if(CuboAtual.meios[0][5]==1){
                                Ul.movimento();
                            }else if(CuboAtual.meios[0][4]==1){
                                U.movimento();
                            }
                        }else{
                            if(CuboAtual.meios[0][4] == 1){
                                R.movimento(); 
                                Ul.movimento(); 
                                Rl.movimento(); 
                                F.movimento();
                                Rl.movimento(); 
                                Fl.movimento(); 
                                R.movimento();
                                FtoR.movimento();
                                meios_rest--;
                                break;
                            }else if(CuboAtual.meios[0][8]==1){
                                Ul.movimento();
                            }else if(CuboAtual.meios[0][5]==1){
                                U2.movimento();
                            }else if(CuboAtual.meios[0][0]==1){
                                U.movimento();
                            }
                        }
                    }
                }
            }
    }
}
