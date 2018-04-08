import javax.swing.*;
public class AppBloco
{
   public static void main (String args [])
   {
      BlocoDeNotas bloquinho = new BlocoDeNotas();
      
      int menu;
      int del;
      int Index;
      String nota;
      String posNota;
      
      do
      {
         menu = Integer.parseInt(JOptionPane.showInputDialog("1. Insira uma nota.\n2. Remova uma nota.\n3. Altere uma nota.\n4. Listar notas.\n5. Sair do programa."));
         if(menu == 1)
         {
            nota = JOptionPane.showInputDialog("Digite sua nota:");
            posNota = JOptionPane.showInputDialog("Digite a posicao da sua nota:");
            
            bloquinho.addNota(nota);
         }
         else if(menu == 2)
         {
            del = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota que deseja remover:"));
            bloquinho.removeNota(del);
            if(bloquinho.removeNota(del))
            {
               JOptionPane.showMessageDialog(null, "Nota removida.");
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Nota nao encontrada.");
            }
         }
         else if(menu == 3)
         {
            nota = JOptionPane.showInputDialog("Digite sua nova nota: ");
            Index = 0;
            bloquinho.changeNota(Index, nota);
         }
         else if(menu == 4)
         {
            System.out.println(bloquinho.printNotas(nota));
         }
      }
      while(menu != 5);
   }
}
