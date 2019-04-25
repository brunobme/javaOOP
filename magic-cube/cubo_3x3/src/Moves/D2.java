package Moves;

import cubo_3x3.CuboAtual;

public class D2{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;
        //atualizando posição das quinas
        quina_temporaria = CuboAtual.quinas[0][3];
        CuboAtual.quinas[0][3] = CuboAtual.quinas[0][6];
        CuboAtual.quinas[0][6] = quina_temporaria;
        quina_temporaria = CuboAtual.quinas[0][2];
        CuboAtual.quinas[0][2] = CuboAtual.quinas[0][7];
        CuboAtual.quinas[0][7] = quina_temporaria;

        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas[1][3];
        CuboAtual.quinas[1][3] = CuboAtual.quinas[1][6];
        CuboAtual.quinas[1][6] = quina_temporaria;
        quina_temporaria = CuboAtual.quinas[1][2];
        CuboAtual.quinas[1][2] = CuboAtual.quinas[1][7];
        CuboAtual.quinas[1][7] = quina_temporaria;

        //atualizando posição dos meios
        meio_temporario = CuboAtual.meios[0][2];
        CuboAtual.meios[0][2] = CuboAtual.meios[0][10];
        CuboAtual.meios[0][10] = meio_temporario;
        meio_temporario = CuboAtual.meios[0][6];
        CuboAtual.meios[0][6] = CuboAtual.meios[0][7];
        CuboAtual.meios[0][7] = meio_temporario;

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][2];
        CuboAtual.meios[1][2] = CuboAtual.meios[1][10];
        CuboAtual.meios[1][10] = meio_temporario;
        meio_temporario = CuboAtual.meios[1][6];
        CuboAtual.meios[1][6] = CuboAtual.meios[1][7];
        CuboAtual.meios[1][7] = meio_temporario;

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " D2";
    }
}
