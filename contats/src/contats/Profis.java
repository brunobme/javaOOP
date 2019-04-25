package contats;
import java.util.ArrayList;
class Profis{
  String nom,email;
  protected ArrayList<Profis> cont = new ArrayList<>();
  
  void addcont(Profis ctt){
   cont.add(ctt);
  }

  void mostrCont(){
   System.out.println("####Contatos do "+
                       this.getClass().getSimpleName()+
                      " "+this.nom);  
   int k=1;
   for(Profis p:cont){
    System.out.println("Contato "+k+": "+
                        p.getClass().getSimpleName()+
                       " "+p.nom);
    k++;
   }
  }
  
}
