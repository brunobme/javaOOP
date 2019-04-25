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
public class Passo2 {
    public static void passo2(){
        CuboAtual.movimentos+="\nOrientando a última camada:\n";
        while(CuboAtual.meios[1][0]!=0 || CuboAtual.meios[1][4]!=0 || CuboAtual.meios[1][5]!=0 || CuboAtual.meios[1][8]!=0 || 
            CuboAtual.quinas[1][0]!=0 || CuboAtual.quinas[1][1]!=0 || CuboAtual.quinas[1][4]!=0 || CuboAtual.quinas[1][5]!=0){
            if(CuboAtual.meios[1][0]==0 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==0){
                while(CuboAtual.quinas[1][0]!=0 || CuboAtual.quinas[1][1]!=0 || CuboAtual.quinas[1][4]!=0 || CuboAtual.quinas[1][5]!=0){
                    if(CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==-1){
                    R.movimento(); U.movimento(); Rl.movimento(); U.movimento(); R.movimento(); U2.movimento(); Rl.movimento();//caso1
                    }else if(CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==1){
                        Rl.movimento(); Ul.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); U2.movimento(); R.movimento();//caso2
                    }else if(CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==-1){
                        R.movimento(); U.movimento(); Rl.movimento(); U.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); U.movimento(); R.movimento(); U2.movimento(); Rl.movimento();//caso3
                    }else if(CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==1){
                        R.movimento(); U2.movimento(); R2.movimento(); Ul.movimento(); R2.movimento(); Ul.movimento(); R2.movimento(); U2.movimento(); R.movimento();//caso4
                    }else if(CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==1){
                        Rl.movimento(); Fl.movimento(); L.movimento(); F.movimento(); R.movimento(); Fl.movimento(); Ll.movimento(); F.movimento();//caso5
                    }else if(CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==0){
                        L.movimento(); F.movimento(); R.movimento(); Fl.movimento(); Ll.movimento(); F.movimento(); Rl.movimento(); Fl.movimento();//caso6
                    }else if(CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==1){
                        R2.movimento(); Dl.movimento(); R.movimento(); U2.movimento(); Rl.movimento(); D.movimento(); R.movimento(); U2.movimento(); R.movimento();//caso7
                    }else{
                        FtoR.movimento();
                    }
                }
            }else if(CuboAtual.meios[1][0]==1 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==1){
                while(CuboAtual.meios[1][0]!=0 || CuboAtual.meios[1][4]!=0 || CuboAtual.meios[1][5]!=0 || CuboAtual.meios[1][8]!=0 || 
                CuboAtual.quinas[1][0]!=0 || CuboAtual.quinas[1][1]!=0 || CuboAtual.quinas[1][4]!=0 || CuboAtual.quinas[1][5]!=0){
                    if(CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==0){
                    L.movimento(); F.movimento(); Rl.movimento(); F.movimento(); R.movimento(); F2.movimento(); L2.movimento(); Bl.movimento(); R.movimento(); Bl.movimento(); Rl.movimento(); B2.movimento(); L.movimento();//caso50
                    }else if(CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==-1){
                        L.movimento(); F2.movimento(); Rl.movimento(); Fl.movimento(); R.movimento(); Fl.movimento(); L2.movimento(); B2.movimento(); R.movimento(); B.movimento(); Rl.movimento(); B.movimento(); L.movimento();//caso51
                    }else if(CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==-1){
                        R.movimento(); U2.movimento(); R2.movimento(); F.movimento(); R.movimento(); Fl.movimento(); U2.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Fl.movimento();//caso52
                    }else if(CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==1){
                        F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento(); B.movimento(); U.movimento(); L.movimento(); Ul.movimento(); Ll.movimento(); Bl.movimento();//caso53
                    }else if(CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==-1){
                        B.movimento(); U.movimento(); L.movimento(); Ul.movimento(); Ll.movimento(); Bl.movimento(); Ul.movimento(); F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento();//caso54
                    }else if(CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==0){
                        B.movimento(); U.movimento(); L.movimento(); Ul.movimento(); Ll.movimento(); Bl.movimento(); U.movimento(); F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento();//caso55
                    }else if(CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==1){
                        R.movimento(); U.movimento(); Rl.movimento(); U.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Fl.movimento(); U2.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Fl.movimento(); //caso56
                    }else if(CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==0){
                        R.movimento(); Ll.movimento(); B.movimento(); R.movimento(); B.movimento(); Rl.movimento(); Bl.movimento(); R2.movimento(); L2.movimento(); F.movimento(); R.movimento(); Fl.movimento(); Ll.movimento();//caso57
                    }else{
                        FtoR.movimento();
                    }
                }
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==0){
                R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Fl.movimento();//caso8
            }else if(CuboAtual.meios[1][0]==1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==0){
                F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento();//caso9
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==0){
                B.movimento(); U.movimento(); L.movimento(); Ul.movimento(); Ll.movimento(); Bl.movimento();//caso10 
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==0){
                Rl.movimento(); Ul.movimento(); Fl.movimento(); U.movimento(); F.movimento(); R.movimento();//caso11 
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==0){
                L.movimento(); F2.movimento(); Rl.movimento(); Fl.movimento(); R.movimento(); Fl.movimento(); Ll.movimento();//caso12
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==-1){
                Ll.movimento(); B2.movimento(); R.movimento(); B.movimento(); Rl.movimento(); B.movimento(); L.movimento();//caso13
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==-1){
                L.movimento(); F.movimento(); Rl.movimento(); F.movimento(); R.movimento(); F2.movimento(); Ll.movimento();//caso14
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==1){
                Ll.movimento(); Bl.movimento(); R.movimento(); Bl.movimento(); Rl.movimento(); B2.movimento(); L.movimento();//caso15
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==-1){
                F.movimento(); U.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); U.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); Fl.movimento();//caso16
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==-1){
                F.movimento(); Rl.movimento(); Fl.movimento(); R.movimento(); U.movimento(); R.movimento(); Ul.movimento(); R.movimento();//caso17
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==1){
                F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento();//caso18
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==1){
                Fl.movimento(); Ll.movimento(); Ul.movimento(); L.movimento(); U.movimento(); Ll.movimento(); Ul.movimento(); L.movimento(); U.movimento(); F.movimento();//caso19
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==1){
                Ll.movimento(); B2.movimento(); R.movimento(); B.movimento(); Rl.movimento(); Bl.movimento(); R.movimento(); B.movimento(); Rl.movimento(); B.movimento(); L.movimento();//caso20
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==-1){
                L.movimento(); F.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Fl.movimento(); Rl.movimento(); F.movimento(); R.movimento(); F2.movimento(); Ll.movimento();//caso21
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==1){
                L.movimento(); Fl.movimento(); L2.movimento(); B.movimento(); L2.movimento(); F.movimento(); L2.movimento(); Bl.movimento(); L.movimento();//caso22
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==1){
                Ll.movimento(); B.movimento(); L2.movimento(); Fl.movimento(); L2.movimento(); Bl.movimento(); L2.movimento(); F.movimento(); Ll.movimento();//caso23
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==0){
                L.movimento();F.movimento(); Rl.movimento(); Fl.movimento(); Ll.movimento(); R.movimento(); U.movimento(); R.movimento(); Ul.movimento(); Rl.movimento();//caso24
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==0){
                R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); L.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Fl.movimento(); Ll.movimento();//caso25
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==0){
                R.movimento(); U.movimento(); Bl.movimento(); Ul.movimento(); Rl.movimento(); U.movimento(); R.movimento(); B.movimento(); Rl.movimento();//caso26
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==0 && 
                    CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==0){
                Rl.movimento(); Ul.movimento(); F.movimento(); U.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); Fl.movimento(); R.movimento();//caso27
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==1){
                L.movimento(); U2.movimento(); L2.movimento(); B.movimento(); L.movimento(); Bl.movimento(); L.movimento(); U2.movimento(); Ll.movimento();//caso28
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==-1){
                Rl.movimento(); Ul.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Fl.movimento(); U.movimento(); R.movimento();//caso29
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]== -1){
                R.movimento(); U.movimento(); R2.movimento(); Ul.movimento(); Rl.movimento(); F.movimento(); R.movimento(); U.movimento(); R.movimento(); Ul.movimento(); Fl.movimento();//caso30
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==-1){
                Rl.movimento(); U2.movimento(); R2.movimento(); U.movimento(); Rl.movimento(); U.movimento(); R.movimento(); U2.movimento(); Bl.movimento(); Rl.movimento(); B.movimento();//caso31
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==-1){
                R.movimento(); U.movimento(); Rl.movimento(); U.movimento(); R.movimento(); Ul.movimento(); B.movimento(); Ul.movimento(); Bl.movimento(); Rl.movimento();//caso32
            }else if(CuboAtual.meios[1][0]==1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==-1){
                Ll.movimento(); Bl.movimento(); L.movimento(); Ul.movimento(); Rl.movimento(); U.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); U.movimento(); Ll.movimento(); R.movimento(); B.movimento(); L.movimento();//caso33
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==0){
                R.movimento(); U.movimento(); Rl.movimento(); U.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); Ul.movimento(); Rl.movimento(); F.movimento(); R.movimento(); Fl.movimento();//caso34
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==1){
                Ll.movimento(); Ul.movimento(); L.movimento(); Ul.movimento(); Ll.movimento(); U.movimento(); L.movimento(); U.movimento(); L.movimento(); Fl.movimento(); Ll.movimento(); F.movimento();//caso35
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==1){
                Rl.movimento(); F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Fl.movimento(); R.movimento(); F.movimento(); Ul.movimento(); Fl.movimento();//caso36
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==-1){
                L.movimento(); Fl.movimento(); Ll.movimento(); Ul.movimento(); L.movimento(); F.movimento(); Ll.movimento(); Fl.movimento(); U.movimento(); F.movimento();//caso37
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==0){
                L.movimento(); F.movimento(); Ll.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); L.movimento(); Fl.movimento(); Ll.movimento();//caso38
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==-1){
                Rl.movimento(); Fl.movimento(); Ll.movimento(); R.movimento(); Ul.movimento(); L.movimento(); U.movimento(); Rl.movimento(); F.movimento(); R.movimento();//caso39
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==-1){
                Rl.movimento(); F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento(); U.movimento(); R.movimento();//caso40
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==0){
                R.movimento(); Bl.movimento(); Rl.movimento(); Ul.movimento(); R.movimento(); U.movimento(); B.movimento(); Ul.movimento(); Rl.movimento();//caso41
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==0){
                F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento(); R.movimento(); B.movimento(); U.movimento(); Bl.movimento(); Ul.movimento(); Rl.movimento();//caso42
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==0){
                L.movimento(); F.movimento(); Rl.movimento(); F.movimento(); Rl.movimento(); D.movimento(); R.movimento(); Dl.movimento(); R.movimento(); F2.movimento(); Ll.movimento();//caso43
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==0){
                R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); Fl.movimento(); Ul.movimento(); F.movimento(); R.movimento(); U.movimento(); Rl.movimento();//caso44
            }else if(CuboAtual.meios[1][0]== 0 && CuboAtual.meios[1][4]==1 && CuboAtual.meios[1][5]==0 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==0){
                B.movimento(); U.movimento(); L.movimento(); U2.movimento(); Ll.movimento(); Ul.movimento(); L.movimento(); U2.movimento(); Ll.movimento(); Ul.movimento(); Bl.movimento();//caso45
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==0 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==1){
                R.movimento(); U.movimento(); Rl.movimento(); U.movimento(); R.movimento(); U2.movimento(); Rl.movimento(); F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento();//caso46
            }else if(CuboAtual.meios[1][0]==0 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==0 && CuboAtual.quinas[1][5]==0){
                Rl.movimento(); Ul.movimento(); R.movimento(); Ul.movimento(); Rl.movimento(); U2.movimento(); R.movimento(); F.movimento(); R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento();//caso47
            }else if(CuboAtual.meios[1][0]==0 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==1 && 
                CuboAtual.quinas[1][0]==-1 && CuboAtual.quinas[1][1]==-1 && CuboAtual.quinas[1][4]==-1 && CuboAtual.quinas[1][5]==0){
                Rl.movimento(); Ul.movimento(); R.movimento(); U.movimento(); R.movimento(); Bl.movimento(); R2.movimento(); Ul.movimento(); R.movimento(); U.movimento(); B.movimento();//caso48
            }else if(CuboAtual.meios[1][0]== 1 && CuboAtual.meios[1][4]==0 && CuboAtual.meios[1][5]==1 && CuboAtual.meios[1][8]==0 && 
                CuboAtual.quinas[1][0]==1 && CuboAtual.quinas[1][1]==0 && CuboAtual.quinas[1][4]==1 && CuboAtual.quinas[1][5]==1){
                R.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Rl.movimento(); F.movimento(); R2.movimento(); U.movimento(); Rl.movimento(); Ul.movimento(); Fl.movimento();//caso49
            }else{
                FtoR.movimento();
            }
        }
    }
}
