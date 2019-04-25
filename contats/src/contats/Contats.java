package contats;
import java.util.Random;
public class Contats{
 public static void main(String[] args){
  Profis[] p = new Profis[3];
  
  p[0]=new Emp("Aldo","aldo@yahoo.com");
  p[1]=new Prf("Bete","bete@hotmail.com");
  p[2]=new Pol("Cleo","cleo@gmail.com");
  
  Random rnd = new Random();
  int i,j,cttsi,qualct;
  
  for(i=0;i<3;i++){
   cttsi = rnd.nextInt(4)+1;
   for(j=0;j<cttsi;j++){
    qualct = rnd.nextInt(2);
    p[i].addcont(p[qualct]);
    p[qualct].addcont(p[i]);
   }
  }   
 
  for(i=0;i<3;i++){
   p[i].mostrCont();
   System.out.println("\n");
  }
 }
}
