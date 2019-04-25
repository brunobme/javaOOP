package tirapoe;
//import javax.swing.JOptionPane;
class Fila{
 private int numel = 0;
 private int numax;
 public void ent(){numel++;}
 public void sai(){numel--;}
 public int  qts(){return numel;}
 public void setnumax(int n){numax=n;}
}
