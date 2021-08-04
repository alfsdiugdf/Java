/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.aula;

/**
 *
 * @author joao.schramm
 */
public class TesteAula {
int a = 6;
int b = 7;

    public static void main(String[] args) {
     TesteAula Val = new TesteAula();
     String strl = "Ola mundo   ";
     String strl2 = "Ola mundo \n";
     int [] ListNum = {1, 2, 3, 4, 6, 8, 10};
     int resp = 11;
      
     System.out.print(strl);
     System.out.print(strl2);
     System.out.print(strl2 + strl);
     System.out.printf("soma da variaveis a e b = %d \n", (Val.a + Val.b));
      if(ListNum[0] + ListNum[6] == resp){
         System.out.printf("primeiro numero eh %d ",ListNum[6]);
         System.out.printf("segundo numero eh %d ",ListNum[0]);
         System.out.printf("a resposta eh %d ",resp);
      }
     else{
         System.out.print("resposta incorreta");
         
         
    
     
        
    }
    
}
