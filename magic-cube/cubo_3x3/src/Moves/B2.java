package Moves;

import cubo_3x3.CuboAtual;

public class B2{
    public static void movimento(){
        int quina_temporaria, meio_temporario, count;

        //atualizando posição e orientação das quinas e meios
        for(count=4; count<6; count++){
            //posição
            quina_temporaria = CuboAtual.quinas[0][count];
            CuboAtual.quinas[0][count] = CuboAtual.quinas[0][count+2];
            CuboAtual.quinas[0][count+2] = quina_temporaria;
            //orientação
            quina_temporaria = CuboAtual.quinas[1][count];
            CuboAtual.quinas[1][count] = CuboAtual.quinas[1][count+2];
            CuboAtual.quinas[1][count+2] = quina_temporaria;

            //posição
            meio_temporario = CuboAtual.meios[0][count+4];
            CuboAtual.meios[0][count+4] = CuboAtual.meios[0][count+6];
            CuboAtual.meios[0][count+6] = meio_temporario;
            //orientação
            meio_temporario = CuboAtual.meios[1][count+4];
            CuboAtual.meios[1][count+4] = CuboAtual.meios[1][count+6];
            CuboAtual.meios[1][count+6] = meio_temporario;
        }

        //atualizando os CuboAtual.movimentos
        CuboAtual.movimentos += " B2";
    }
}
