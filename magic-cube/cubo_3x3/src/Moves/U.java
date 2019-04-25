package Moves;

import cubo_3x3.CuboAtual;

public class U{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;
        //atualizando posição das quinas
        quina_temporaria = CuboAtual.quinas[0][0];
        CuboAtual.quinas[0][0] = CuboAtual.quinas[0][1];
        CuboAtual.quinas[0][1] = CuboAtual.quinas[0][5];
        CuboAtual.quinas[0][5] = CuboAtual.quinas[0][4];
        CuboAtual.quinas[0][4] = quina_temporaria;

        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas[1][0];
        CuboAtual.quinas[1][0] = CuboAtual.quinas[1][1];
        CuboAtual.quinas[1][1] = CuboAtual.quinas[1][5];
        CuboAtual.quinas[1][5] = CuboAtual.quinas[1][4];
        CuboAtual.quinas[1][4] = quina_temporaria;

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][0];
        if(CuboAtual.meios[0][5] != 1 && CuboAtual.meios[0][5] != 3 && CuboAtual.meios[0][5] != 9 && 
                CuboAtual.meios[0][5] != 11){
                CuboAtual.meios[1][0] = CuboAtual.meios[1][5];
        }else{
            if(CuboAtual.meios[1][5] == 0){
                CuboAtual.meios[1][0] = 1;
            }else{
                CuboAtual.meios[1][0] = 0;
            }
        }

        if(CuboAtual.meios[0][8] != 1 && CuboAtual.meios[0][8] != 3 && CuboAtual.meios[0][8] != 9 && 
                CuboAtual.meios[0][8] != 11){
                CuboAtual.meios[1][5] = CuboAtual.meios[1][8];
        }else{
            if(CuboAtual.meios[1][8] == 0){
                CuboAtual.meios[1][5] = 1;
            }else{
                CuboAtual.meios[1][5] = 0;
            }
        }

        if(CuboAtual.meios[0][4] != 1 && CuboAtual.meios[0][4] != 3 && CuboAtual.meios[0][4] != 9 && 
                CuboAtual.meios[0][4] != 11){
                CuboAtual.meios[1][8] = CuboAtual.meios[1][4];
        }else{
            if(CuboAtual.meios[1][4] == 0){
                CuboAtual.meios[1][8] = 1;
            }else{
                CuboAtual.meios[1][8] = 0;
            }
        }

        if(CuboAtual.meios[0][0] != 1 && CuboAtual.meios[0][0] != 3 && CuboAtual.meios[0][0] != 9 && 
                CuboAtual.meios[0][0] != 11){
                CuboAtual.meios[1][4] = meio_temporario;
        }else{
            if(meio_temporario == 0){
                CuboAtual.meios[1][4] = 1;
            }else{
                CuboAtual.meios[1][4] = 0;
            }
        }

        //atualizando posição dos meios
        meio_temporario = CuboAtual.meios[0][0];
        CuboAtual.meios[0][0] = CuboAtual.meios[0][5];
        CuboAtual.meios[0][5] = CuboAtual.meios[0][8];
        CuboAtual.meios[0][8] = CuboAtual.meios[0][4];
        CuboAtual.meios[0][4] = meio_temporario;

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " U";
    }
}
