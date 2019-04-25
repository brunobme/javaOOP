package Moves;

import cubo_3x3.CuboAtual;

public class F2{
    public static void movimento(){
        int quina_temporaria,meio_temporario, count, i;

        //atualizando posição e orientação das quinas e meios
        for(count=0; count<2;count++){
            //posição
            quina_temporaria = CuboAtual.quinas[0][count];
            CuboAtual.quinas[0][count] = CuboAtual.quinas[0][count+2];
            CuboAtual.quinas[0][count+2] = quina_temporaria;
            //orientação
            quina_temporaria = CuboAtual.quinas[1][count];
            CuboAtual.quinas[1][count] = CuboAtual.quinas[1][count+2];
            CuboAtual.quinas[1][count+2] = quina_temporaria;

            //posição
            meio_temporario = CuboAtual.meios[0][count];
            CuboAtual.meios[0][count] = CuboAtual.meios[0][count+2];
            CuboAtual.meios[0][count+2] = meio_temporario;
            //orientação
            meio_temporario = CuboAtual.meios[1][count];
            CuboAtual.meios[1][count] = CuboAtual.meios[1][count+2];
            CuboAtual.meios[1][count+2] = meio_temporario;
        }

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " F2";
    }
}
