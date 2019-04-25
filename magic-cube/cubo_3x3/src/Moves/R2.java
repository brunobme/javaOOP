package Moves;

import cubo_3x3.CuboAtual;

public class R2{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;
        //atualizando posição das quinas
        quina_temporaria = CuboAtual.quinas[0][5];
        CuboAtual.quinas[0][5] = CuboAtual.quinas[0][2];
        CuboAtual.quinas[0][2] = quina_temporaria;
        quina_temporaria = CuboAtual.quinas[0][1];
        CuboAtual.quinas[0][1] = CuboAtual.quinas[0][6];
        CuboAtual.quinas[0][6] = quina_temporaria;

        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas[1][5];
        CuboAtual.quinas[1][5] = CuboAtual.quinas[1][2];
        CuboAtual.quinas[1][2] = quina_temporaria;
        quina_temporaria = CuboAtual.quinas[1][1];
        CuboAtual.quinas[1][1] = CuboAtual.quinas[1][6];
        CuboAtual.quinas[1][6] = quina_temporaria;

        //atualizando posição dos meios
        meio_temporario = CuboAtual.meios[0][1];
        CuboAtual.meios[0][1] = CuboAtual.meios[0][9];
        CuboAtual.meios[0][9] = meio_temporario;
        meio_temporario = CuboAtual.meios[0][5];
        CuboAtual.meios[0][5] = CuboAtual.meios[0][6];
        CuboAtual.meios[0][6] = meio_temporario;

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][1];
        CuboAtual.meios[1][1] = CuboAtual.meios[1][9];
        CuboAtual.meios[1][9] = meio_temporario;
        meio_temporario = CuboAtual.meios[1][5];
        CuboAtual.meios[1][5] = CuboAtual.meios[1][6];
        CuboAtual.meios[1][6] = meio_temporario;
        meio_temporario = CuboAtual.meios[1][6];

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " R2";
    }
}
