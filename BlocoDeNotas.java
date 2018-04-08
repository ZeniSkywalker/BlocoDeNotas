import java.util.ArrayList;

public class BlocoDeNotas
{
   private ArrayList<String> notas;
   
   public BlocoDeNotas()
   {
      notas = new ArrayList<>();
   }
      
   public void addNota(String nota)
   {
      this.notas.add(nota);
   }
   
   public boolean removeNota(int Index)
   {
      this.notas.remove(Index);
      return false;
   }
   
   public String getNota(int Index)
   {
      return notas.get(Index);
   }
     
   public void changeNota(int Index, String nota)
   {
      this.notas.set(Index, nota);
   }
      
   public void printNotas()
   {
     
      for(int i = 0; i < notas.size(); i++){
         System.out.println(this.getNota(i));
         
      }
     
   }  
}
