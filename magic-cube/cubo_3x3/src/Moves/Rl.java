package Moves;

import cubo_3x3.CuboAtual;

public class Rl{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;
        //atualizando posição das quinas
        quina_temporaria = CuboAtual.quinas[0][5];
        CuboAtual.quinas[0][5] = CuboAtual.quinas[0][6];
        CuboAtual.quinas[0][6] = CuboAtual.quinas[0][2];
        CuboAtual.quinas[0][2] = CuboAtual.quinas[0][1];
        CuboAtual.quinas[0][1] = quina_temporaria;
        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas[1][6];
        if(CuboAtual.quinas[1][2] == 0){
            CuboAtual.quinas[1][6] = -1;
        }else if(CuboAtual.quinas[1][2] == -1){
            CuboAtual.quinas[1][6] = 1;
        }else{
            CuboAtual.quinas[1][6] = 0;
        }

        if(CuboAtual.quinas[1][1] == 0){
            CuboAtual.quinas[1][2] = 1;
        }else if(CuboAtual.quinas[1][1] == -1){
            CuboAtual.quinas[1][2] = 0;
        }else{
            CuboAtual.quinas[1][2] = -1;
        }

        if(CuboAtual.quinas[1][5] == 0){
            CuboAtual.quinas[1][1] = -1;
        }else if(CuboAtual.quinas[1][5] == -1){
            CuboAtual.quinas[1][1] = 1;
        }else{
            CuboAtual.quinas[1][1] = 0;
        }

        if(quina_temporaria == 0){
            CuboAtual.quinas[1][5] = 1;
        }else if(quina_temporaria == -1){
            CuboAtual.quinas[1][5] = 0;
        }else{
            CuboAtual.quinas[1][5] = -1;
        }

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][6];
        if(CuboAtual.meios[0][1] == 1 || CuboAtual.meios[0][1] == 3 || CuboAtual.meios[0][1] == 9 || 
                CuboAtual.meios[0][1] == 11){
                CuboAtual.meios[1][6] = CuboAtual.meios[1][1];
        }else{
            if(CuboAtual.meios[1][1] == 0){
                CuboAtual.meios[1][6] = 1;
            }else{
                CuboAtual.meios[1][6] = 0;
            }
        }

        if(CuboAtual.meios[0][5] == 1 || CuboAtual.meios[0][5] == 3 || CuboAtual.meios[0][5] == 9 || 
                CuboAtual.meios[0][5] == 11){
                CuboAtual.meios[1][1] = CuboAtual.meios[1][5];
        }else{
            if(CuboAtual.meios[1][5] == 0){
                CuboAtual.meios[1][1] = 1;
            }else{
                CuboAtual.meios[1][1] = 0;
            }
        }

        if(CuboAtual.meios[0][9] == 1 || CuboAtual.meios[0][9] == 3 || CuboAtual.meios[0][9] == 9 || 
                CuboAtual.meios[0][9] == 11){
                CuboAtual.meios[1][5] = CuboAtual.meios[1][9];
        }else{
            if(CuboAtual.meios[1][9] == 0){
                CuboAtual.meios[1][5] = 1;
            }else{
                CuboAtual.meios[1][5] = 0;
            }
        }

        if(CuboAtual.meios[0][6] == 1 || CuboAtual.meios[0][6] == 3 || CuboAtual.meios[0][6] == 9 || 
                CuboAtual.meios[0][6] == 11){
                CuboAtual.meios[1][9] = meio_temporario;
        }else{
            if(meio_temporario == 0){
                CuboAtual.meios[1][9] = 1;
            }else{
                CuboAtual.meios[1][9] = 0;
            }
        }

        //atualizando posição dos meios
        meio_temporario = CuboAtual.meios[0][1];
        CuboAtual.meios[0][1] = CuboAtual.meios[0][5];
        CuboAtual.meios[0][5] = CuboAtual.meios[0][9];
        CuboAtual.meios[0][9] = CuboAtual.meios[0][6];
        CuboAtual.meios[0][6] = meio_temporario;

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " R'";
    }
}
