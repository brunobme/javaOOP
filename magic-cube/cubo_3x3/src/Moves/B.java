package Moves;

import cubo_3x3.CuboAtual;

public class B{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;

        quina_temporaria = CuboAtual.quinas[0][4];
        meio_temporario = CuboAtual.meios[0][8];
        //atualizando posição das quinas e meios
        for(count = 4; count<7; count++){
            CuboAtual.quinas[0][count] = CuboAtual.quinas[0][count+1];
            CuboAtual.meios[0][count+4] = CuboAtual.meios[0][count+5];
        }
        CuboAtual.quinas[0][7] = quina_temporaria;
        CuboAtual.meios[0][11] = meio_temporario;

        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas [1][7];
        if(CuboAtual.quinas[1][4] == 0){
            CuboAtual.quinas[1][7] = -1;
        }else if(CuboAtual.quinas[1][4] == -1){
            CuboAtual.quinas[1][7] = 1;
        }else{
            CuboAtual.quinas[1][7] = 0;
        }

        if(CuboAtual.quinas[1][5] == 0){
            CuboAtual.quinas[1][4] = 1;
        }else if(CuboAtual.quinas[1][5] == -1){
            CuboAtual.quinas[1][4] = 0;
        }else{
            CuboAtual.quinas[1][4] = -1;
        }

        if(CuboAtual.quinas[1][6] == 0){
            CuboAtual.quinas[1][5] = -1;
        }else if(CuboAtual.quinas[1][6] == -1){
            CuboAtual.quinas[1][5] = 1;
        }else{
            CuboAtual.quinas[1][5] = 0;
        }

        if(quina_temporaria == 0){
            CuboAtual.quinas[1][6] = 1;
        }else if(quina_temporaria == -1){
            CuboAtual.quinas[1][6] = 0;
        }else{
            CuboAtual.quinas[1][6] = -1;
        }

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][8];

        for(count = 8; count<11; count++){
            CuboAtual.meios[1][count] = CuboAtual.meios[1][count+1];
        }
        CuboAtual.meios[1][11] = meio_temporario;

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " B";
    }
}
