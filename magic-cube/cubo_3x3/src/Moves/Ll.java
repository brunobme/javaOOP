package Moves;

import cubo_3x3.CuboAtual;

public class Ll{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;
        //atualizando posição das quinas
        quina_temporaria = CuboAtual.quinas[0][0];
        CuboAtual.quinas[0][0] = CuboAtual.quinas[0][3];
        CuboAtual.quinas[0][3] = CuboAtual.quinas[0][7];
        CuboAtual.quinas[0][7] = CuboAtual.quinas[0][4];
        CuboAtual.quinas[0][4] = quina_temporaria;
        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas[1][4];
        if(CuboAtual.quinas[1][0] == 0){
            CuboAtual.quinas[1][4] = -1;
        }else if(CuboAtual.quinas[1][0] == -1){
            CuboAtual.quinas[1][4] = 1;
        }else{
            CuboAtual.quinas[1][4] = 0;
        }

        if(CuboAtual.quinas[1][3] == 0){
            CuboAtual.quinas[1][0] = 1;
        }else if(CuboAtual.quinas[1][3] == -1){
            CuboAtual.quinas[1][0] = 0;
        }else{
            CuboAtual.quinas[1][0] = -1;
        }

        if(CuboAtual.quinas[1][7] == 0){
            CuboAtual.quinas[1][3] = -1;
        }else if(CuboAtual.quinas[1][7] == -1){
            CuboAtual.quinas[1][3] = 1;
        }else{
            CuboAtual.quinas[1][3] = 0;
        }

        if(quina_temporaria == 0){
            CuboAtual.quinas[1][7] = 1;
        }else if(quina_temporaria == -1){
            CuboAtual.quinas[1][7] = 0;
        }else{
            CuboAtual.quinas[1][7] = -1;
        }

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][4];
        if(CuboAtual.meios[0][3] == 1 || CuboAtual.meios[0][3] == 3 || CuboAtual.meios[0][3] == 9 || 
                CuboAtual.meios[0][3] == 11){
                CuboAtual.meios[1][4] = CuboAtual.meios[1][3];
        }else{
            if(CuboAtual.meios[1][3] == 0){
                CuboAtual.meios[1][4] = 1;
            }else{
                CuboAtual.meios[1][4] = 0;
            }
        }

        if(CuboAtual.meios[0][7] == 1 || CuboAtual.meios[0][7] == 3 || CuboAtual.meios[0][7] == 9 || 
                CuboAtual.meios[0][7] == 11){
                CuboAtual.meios[1][3] = CuboAtual.meios[1][7];
        }else{
            if(CuboAtual.meios[1][7] == 0){
                CuboAtual.meios[1][3] = 1;
            }else{
                CuboAtual.meios[1][3] = 0;
            }
        }

        if(CuboAtual.meios[0][11] == 1 || CuboAtual.meios[0][11] == 3 || CuboAtual.meios[0][11] == 9 || 
                CuboAtual.meios[0][11] == 11){
                CuboAtual.meios[1][7] = CuboAtual.meios[1][11];
        }else{
            if(CuboAtual.meios[1][11] == 0){
                CuboAtual.meios[1][7] = 1;
            }else{
                CuboAtual.meios[1][7] = 0;
            }
        }

        if(CuboAtual.meios[0][4] == 1 || CuboAtual.meios[0][4] == 3 || CuboAtual.meios[0][4] == 9 || 
                CuboAtual.meios[0][4] == 11){
                CuboAtual.meios[1][11] = meio_temporario;
        }else{
            if(meio_temporario == 0){
                CuboAtual.meios[1][11] = 1;
            }else{
                CuboAtual.meios[1][11] = 0;
            }
        }

        //atualizando posição dos meios
        meio_temporario = CuboAtual.meios[0][3];
        CuboAtual.meios[0][3] = CuboAtual.meios[0][7];
        CuboAtual.meios[0][7] = CuboAtual.meios[0][11];
        CuboAtual.meios[0][11] = CuboAtual.meios[0][4];
        CuboAtual.meios[0][4] = meio_temporario;

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " L'";
    }
}
