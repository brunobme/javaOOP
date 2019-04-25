package tirapoe;
import javax.swing.JOptionPane;
public class Tirapoe{
 public static void main(String[] args){
  Fila f1,f2; String m; int n,N;
  
  f1=new Fila();f2=new Fila();
  f1.setnumax(5); f2.setnumax(7);
  
  m = JOptionPane.showInputDialog("Qual Fila?","1");
  n = Integer.parseInt(m);
  
  if (n==1){
   m = JOptionPane.showInputDialog("Põe=1/Tira=2?","1");
   n = Integer.parseInt(m); 
   if (n==1){f1.ent();}
  }
    
  String F = String.format("A Fila 1 Tem %d",f1.qts());
  F += String.format(" Elemento(s)\n");
  F += String.format("A Fila 2 Tem %d",f2.qts());
  F += String.format(" Elemento(s)");
  JOptionPane.showMessageDialog(null,F);
 }    
}
