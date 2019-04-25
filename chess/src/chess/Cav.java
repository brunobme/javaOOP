package chess;
class Cav extends Peça{
 public Cav(){
 }
 
 @Override
 void mv2(int N){
  switch (N){
   case 1: l=L+1;c=C-2;break;
   case 2: l=L+2;c=C-1;break;
   case 3: l=L+2;c=C+1;break;
   case 4: l=L+1;c=C+2;break;
   case 5: l=L-1;c=C+2;break;
   case 6: l=L-2;c=C+1;break;
   case 7: l=L-2;c=C-1;break;
   case 8: l=L-1;c=C-2;break;
  }
  
  //System.out.printf("%s%d%s%d\n","l=",l,"c=",c);
  
  if (l<0||l>7||c<0||c>7)
   throw new RuntimeException("Out of Tab!");
  else{L=l;C=c;}     
 }
}
