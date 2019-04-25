package Formas;


public abstract class Forma_Geo {
      public int numero;   
      public double centro_x, centro_y;
      
      //  - Um método abstrato é um método vazio da classe mãe. 
      //  - O método abstrato deve ser programado em todas as classes filhas
      //  - Quando uma classe contém um método abstrato 
      public abstract void le_dados();  
      public abstract void mostra_dados();
      public abstract double area();
      public abstract double perimetro();     
}
