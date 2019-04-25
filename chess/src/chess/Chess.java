package chess;
import java.util.Random;
import java.util.Scanner;
public class Chess{
 public static void main(String[] args){
  final String PUR = "\u001B[35m";
  final String YEL = "\u001B[33m";
  Random rd = new Random();
  Scanner s = new Scanner(System.in);
  String pause;
  boolean endofgame=false;
  int count=0;
  Peça d = new Cav();Peça h = new Cav();
  Peça D = new Cav();Peça H = new Cav();
  Tab t = new Tab();
  cleantab(t);
  D.L=0;D.C=1;H.L=0;H.C=6;
  d.L=7;d.C=1;h.L=7;h.C=6;
  while (!endofgame){
   t.m[D.L][D.C]=PUR+"D ";t.m[H.L][H.C]=PUR
           +"H ";
   t.m[d.L][d.C]=YEL+"d ";t.m[h.L][h.C]=YEL+"h ";
   if(D.ot==0){
    viewtab(t);
    pause = s.nextLine();
   }
   cleantab(t);
   try{D.mv2(rd.nextInt(8)+1);D.ot=0;}
   catch(RuntimeException e){
    D.ot++;
    //System.out.printf(e.toString());
   }
   count++;
   if (count==30) endofgame=true;
  }    
 } 
 
 static void cleantab(Tab T){
  final String CYA = "\u001B[36m";
  for (int i=0;i<8;i++){
   for (int j=0;j<8;j++){
    if ((i+j)%2==0) T.m[i][j]=CYA+"  ";
    else T.m[i][j]=CYA+"* "; 
   }
  }
 }
 static void viewtab(Tab T){
  System.out.println();
  for (int i=0;i<8;i++){
   for (int j=0;j<8;j++){
    if ((i+j)%2==0) 
     System.out.printf("%s",T.m[i][j]);
    else 
     System.out.printf("%s",T.m[i][j]); 
    }
   System.out.println();
  }
 } 
}   
/*
  final String RES = "\u001B[0m";
  final String BLA = "\u001B[30m";
  final String RED = "\u001B[31m";
  final String GRE = "\u001B[32m";
  final String YEL = "\u001B[33m";
  final String BLU = "\u001B[34m";
  final String PUR = "\u001B[35m";
  final String CYA = "\u001B[36m";
  final String WHI = "\u001B[37m";
*/