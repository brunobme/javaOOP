package Moves;

import cubo_3x3.CuboAtual;

public class D{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;
        //atualizando posição das quinas
        quina_temporaria = CuboAtual.quinas[0][3];
        CuboAtual.quinas[0][3] = CuboAtual.quinas[0][7];
        CuboAtual.quinas[0][7] = CuboAtual.quinas[0][6];
        CuboAtual.quinas[0][6] = CuboAtual.quinas[0][2];
        CuboAtual.quinas[0][2] = quina_temporaria;

        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas[1][3];
        CuboAtual.quinas[1][3] = CuboAtual.quinas[1][7];
        CuboAtual.quinas[1][7] = CuboAtual.quinas[1][6];
        CuboAtual.quinas[1][6] = CuboAtual.quinas[1][2];
        CuboAtual.quinas[1][2] = quina_temporaria;

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][2];
        if(CuboAtual.meios[0][7] != 1 && CuboAtual.meios[0][7] != 3 && CuboAtual.meios[0][7] != 9 && 
                CuboAtual.meios[0][7] != 11){
                CuboAtual.meios[1][2] = CuboAtual.meios[1][7];
        }else{
            if(CuboAtual.meios[1][7] == 0){
                CuboAtual.meios[1][2] = 1;
            }else{
                CuboAtual.meios[1][2] = 0;
            }
        }

        if(CuboAtual.meios[0][10] != 1 && CuboAtual.meios[0][10] != 3 && CuboAtual.meios[0][10] != 9 && 
                CuboAtual.meios[0][10] != 11){
                CuboAtual.meios[1][7] = CuboAtual.meios[1][10];
        }else{
            if(CuboAtual.meios[1][10] == 0){
                CuboAtual.meios[1][7] = 1;
            }else{
                CuboAtual.meios[1][7] = 0;
            }
        }

        if(CuboAtual.meios[0][6] != 1 && CuboAtual.meios[0][6] != 3 && CuboAtual.meios[0][6] != 9 && 
                CuboAtual.meios[0][6] != 11){
                CuboAtual.meios[1][10] = CuboAtual.meios[1][6];
        }else{
            if(CuboAtual.meios[1][6] == 0){
                CuboAtual.meios[1][10] = 1;
            }else{
                CuboAtual.meios[1][10] = 0;
            }
        }

        if(CuboAtual.meios[0][2] != 1 && CuboAtual.meios[0][2] != 3 && CuboAtual.meios[0][2] != 9 && 
                CuboAtual.meios[0][2] != 11){
                CuboAtual.meios[1][6] = meio_temporario;
        }else{
            if(meio_temporario == 0){
                CuboAtual.meios[1][6] = 1;
            }else{
                CuboAtual.meios[1][6] = 0;
            }
        }

        //atualizando posição dos meios
        meio_temporario = CuboAtual.meios[0][2];
        CuboAtual.meios[0][2] = CuboAtual.meios[0][7];
        CuboAtual.meios[0][7] = CuboAtual.meios[0][10];
        CuboAtual.meios[0][10] = CuboAtual.meios[0][6];
        CuboAtual.meios[0][6] = meio_temporario;

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " D";
    }
}
