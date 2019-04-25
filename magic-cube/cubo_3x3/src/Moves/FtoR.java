package Moves;

import cubo_3x3.CuboAtual;

public class FtoR{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;
        //quinas
        //posição 
        quina_temporaria = CuboAtual.quinas[0][0];
        CuboAtual.quinas[0][0] = quinas_nF(CuboAtual.quinas[0][1], 1, 0);
        CuboAtual.quinas[0][1] = quinas_nF(CuboAtual.quinas[0][5], 5, 1);
        CuboAtual.quinas[0][5] = quinas_nF(CuboAtual.quinas[0][4], 4, 5);
        CuboAtual.quinas[0][4] = quinas_nF(quina_temporaria, 0, 4);
        quina_temporaria = CuboAtual.quinas[0][3];
        CuboAtual.quinas[0][3] = quinas_nF(CuboAtual.quinas[0][2], 2, 3);
        CuboAtual.quinas[0][2] = quinas_nF(CuboAtual.quinas[0][6], 6, 2);
        CuboAtual.quinas[0][6] = quinas_nF(CuboAtual.quinas[0][7], 7, 6);
        CuboAtual.quinas[0][7] = quinas_nF(quina_temporaria, 3, 7);
        //orientação 
        quina_temporaria = CuboAtual.quinas[1][0];
        CuboAtual.quinas[1][0] = CuboAtual.quinas[1][1];
        CuboAtual.quinas[1][1] = CuboAtual.quinas[1][5];
        CuboAtual.quinas[1][5] = CuboAtual.quinas[1][4];
        CuboAtual.quinas[1][4] = quina_temporaria;
        quina_temporaria = CuboAtual.quinas[1][3];
        CuboAtual.quinas[1][3] = CuboAtual.quinas[1][2];
        CuboAtual.quinas[1][2] = CuboAtual.quinas[1][6];
        CuboAtual.quinas[1][6] = CuboAtual.quinas[1][7];
        CuboAtual.quinas[1][7] = quina_temporaria;

        //meios
        //orientação
        meio_temporario = CuboAtual.meios[1][0];
        CuboAtual.meios[1][0] = CuboAtual.meios[1][5];
        CuboAtual.meios[1][5] = CuboAtual.meios[1][8];
        CuboAtual.meios[1][8] = CuboAtual.meios[1][4];
        CuboAtual.meios[1][4] = meio_temporario;
        meio_temporario = CuboAtual.meios[1][3];
        if(CuboAtual.meios[0][1] != 1 && CuboAtual.meios[0][1] != 3 && CuboAtual.meios[0][1] != 9 && CuboAtual.meios[0][1] != 11){
            if(CuboAtual.meios[1][1]==0){
                CuboAtual.meios[1][3] = 1;
            }else{
                CuboAtual.meios[1][3] = 0;
            }
        }else{
            CuboAtual.meios[1][3] = CuboAtual.meios[1][1];
        }

        if(CuboAtual.meios[0][9] != 1 && CuboAtual.meios[0][9] != 3 && CuboAtual.meios[0][9] != 9 && CuboAtual.meios[0][9] != 11){
            if(CuboAtual.meios[1][9]==0){
                CuboAtual.meios[1][1] = 1;
            }else{
                CuboAtual.meios[1][1] = 0;
            }
        }else{
            CuboAtual.meios[1][1] = CuboAtual.meios[1][9];
        }

        if(CuboAtual.meios[0][11] != 1 && CuboAtual.meios[0][11] != 3 && CuboAtual.meios[0][11] != 9 && CuboAtual.meios[0][11] != 11){
            if(CuboAtual.meios[1][11]==0){
                CuboAtual.meios[1][9] = 1;
            }else{
                CuboAtual.meios[1][9] = 0;
            }
        }else{
            CuboAtual.meios[1][9] = CuboAtual.meios[1][11];
        }

        if(CuboAtual.meios[0][3] != 1 && CuboAtual.meios[0][3] != 3 && CuboAtual.meios[0][3] != 9 && CuboAtual.meios[0][3] != 11){
            if(meio_temporario==0){
                CuboAtual.meios[1][11] = 1;
            }else{
                CuboAtual.meios[1][11] = 0;
            }
        }else{
            CuboAtual.meios[1][11] = meio_temporario;
        }

        meio_temporario = CuboAtual.meios[1][2];
        CuboAtual.meios[1][2] = CuboAtual.meios[1][6];
        CuboAtual.meios[1][6] = CuboAtual.meios[1][10];
        CuboAtual.meios[1][10] = CuboAtual.meios[1][7];
        CuboAtual.meios[1][7] = meio_temporario;

        //posição
        meio_temporario = CuboAtual.meios[0][0];
        CuboAtual.meios[0][0] = meios_nF(CuboAtual.meios[0][5], 5, 0);
        CuboAtual.meios[0][5] = meios_nF(CuboAtual.meios[0][8], 8, 5);
        CuboAtual.meios[0][8] = meios_nF(CuboAtual.meios[0][4], 4, 8);
        CuboAtual.meios[0][4] = meios_nF(meio_temporario, 0, 4);
        meio_temporario = CuboAtual.meios[0][1];
        CuboAtual.meios[0][1] = meios_nF(CuboAtual.meios[0][9], 9, 1);
        CuboAtual.meios[0][9] = meios_nF(CuboAtual.meios[0][11], 11, 9);
        CuboAtual.meios[0][11] = meios_nF(CuboAtual.meios[0][3], 3, 11);
        CuboAtual.meios[0][3] = meios_nF(meio_temporario, 1, 3);
        meio_temporario = CuboAtual.meios[0][2];
        CuboAtual.meios[0][2] = meios_nF(CuboAtual.meios[0][6], 6, 2);
        CuboAtual.meios[0][6] = meios_nF(CuboAtual.meios[0][10], 10, 6);
        CuboAtual.meios[0][10] = meios_nF(CuboAtual.meios[0][7], 7, 10);
        CuboAtual.meios[0][7] = meios_nF(meio_temporario, 2, 7);

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " (F->R)";
    }
    static int quinas_nF(int val_quina_anterior, int coluna_anterior, int coluna){
        int val_novo = 0;
        if(val_quina_anterior == coluna_anterior){
            val_novo = coluna;
        }else if(val_quina_anterior == 7){
            val_novo = 6;
        }else if(val_quina_anterior == 6){
            val_novo = 2;
        }else if(val_quina_anterior == 5){
            val_novo = 1;
        }else if(val_quina_anterior == 4){
            val_novo = 5;
        }else if(val_quina_anterior == 3){
            val_novo = 7;
        }else if(val_quina_anterior == 2){
            val_novo = 3;
        }else if(val_quina_anterior == 1){
            val_novo = 0;
        }else if(val_quina_anterior == 0){
            val_novo = 4;
        }
        return val_novo;
    }

    static int meios_nF(int val_meio_anterior, int coluna_anterior, int coluna){
        int val_novo = 0;
        if(val_meio_anterior == coluna_anterior){
            val_novo = coluna;
        }else if(val_meio_anterior == 0){
            val_novo = 4;
        }else if(val_meio_anterior == 1){
            val_novo = 3;
        }else if(val_meio_anterior == 2){
            val_novo = 7;
        }else if(val_meio_anterior == 3){
            val_novo = 11;
        }else if(val_meio_anterior == 4){
            val_novo = 8;
        }else if(val_meio_anterior == 5){
            val_novo = 0;
        }else if(val_meio_anterior == 6){
            val_novo = 2;
        }else if(val_meio_anterior == 7){
            val_novo = 10;
        }else if(val_meio_anterior == 8){
            val_novo = 5;
        }else if(val_meio_anterior == 9){
            val_novo = 1;
        }else if(val_meio_anterior == 10){
            val_novo = 6;
        }else if(val_meio_anterior == 11){
            val_novo = 9;
        }
        return val_novo;
    }
}
