package Moves;

import cubo_3x3.CuboAtual;

public class F{
    public static void movimento(){
        int quina_temporaria, meio_temporario, count;
        quina_temporaria = CuboAtual.quinas[0][3];
        meio_temporario = CuboAtual.meios[0][3];
        //atualizando posição das quinas e meios
        for(count = 3; count>0; count--){
            CuboAtual.quinas[0][count] = CuboAtual.quinas[0][count-1];
            CuboAtual.meios[0][count] = CuboAtual.meios[0][count-1];
        }
        CuboAtual.quinas[0][0] = quina_temporaria;
        CuboAtual.meios[0][0] = meio_temporario;

        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas[1][0];
        if(CuboAtual.quinas[1][3] == 0){
            CuboAtual.quinas[1][0] = -1;
        }else if(CuboAtual.quinas[1][3] == -1){
            CuboAtual.quinas[1][0] = 1;
        }else{
            CuboAtual.quinas[1][0] = 0;
        }

        if(CuboAtual.quinas[1][2] == 0){
            CuboAtual.quinas[1][3] = 1;
        }else if(CuboAtual.quinas[1][2] == -1){
            CuboAtual.quinas[1][3] = 0;
        }else{
            CuboAtual.quinas[1][3] = -1;
        }

        if(CuboAtual.quinas[1][1] == 0){
            CuboAtual.quinas[1][2] = -1;
        }else if(CuboAtual.quinas[1][1] == -1){
            CuboAtual.quinas[1][2] = 1;
        }else{
            CuboAtual.quinas[1][2] = 0;
        }

        if(quina_temporaria == 0){
            CuboAtual.quinas[1][1] = 1;
        }else if(quina_temporaria == -1){
            CuboAtual.quinas[1][1] = 0;
        }else{
            CuboAtual.quinas[1][1] = -1;
        }

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][3];

        for(count = 3; count>0; count--){
            CuboAtual.meios[1][count] = CuboAtual.meios[1][count-1];
        }
        CuboAtual.meios[1][0] = meio_temporario;

        //atualizando os movimentos
        CuboAtual.movimentos += " F";
    }
}
