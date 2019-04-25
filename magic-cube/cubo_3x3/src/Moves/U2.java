package Moves;

import cubo_3x3.CuboAtual;

public class U2{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count;
        //atualizando posição das quinas
        quina_temporaria = CuboAtual.quinas[0][0];
        CuboAtual.quinas[0][0] = CuboAtual.quinas[0][5];
        CuboAtual.quinas[0][5] = quina_temporaria;
        quina_temporaria = CuboAtual.quinas[0][1];
        CuboAtual.quinas[0][1] = CuboAtual.quinas[0][4];
        CuboAtual.quinas[0][4] = quina_temporaria;

        //atualizando orientação das quinas
        quina_temporaria = CuboAtual.quinas[1][0];
        CuboAtual.quinas[1][0] = CuboAtual.quinas[1][5];
        CuboAtual.quinas[1][5] = quina_temporaria;
        quina_temporaria = CuboAtual.quinas[1][1];
        CuboAtual.quinas[1][1] = CuboAtual.quinas[1][4];
        CuboAtual.quinas[1][4] = quina_temporaria;

        //atualizando posição dos meios
        meio_temporario = CuboAtual.meios[0][0];
        CuboAtual.meios[0][0] = CuboAtual.meios[0][8];
        CuboAtual.meios[0][8] = meio_temporario;
        meio_temporario = CuboAtual.meios[0][5];
        CuboAtual.meios[0][5] = CuboAtual.meios[0][4];
        CuboAtual.meios[0][4] = meio_temporario;

        //atualizando orientação dos meios
        meio_temporario = CuboAtual.meios[1][0];
        CuboAtual.meios[1][0] = CuboAtual.meios[1][8];
        CuboAtual.meios[1][8] = meio_temporario;
        meio_temporario = CuboAtual.meios[1][5];
        CuboAtual.meios[1][5] = CuboAtual.meios[1][4];
        CuboAtual.meios[1][4] = meio_temporario;

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " U2";
    }
}
