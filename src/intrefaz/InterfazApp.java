package intrefaz;

import java.util.ArrayList;
import java.util.Stack;
import mundo.Info;

public class InterfazApp 
{

    public static void main(String[] args) 
    { Stack <Info>stack;
      Info info, retirado, ultimo;
      
      ArrayList<Info> arrayAux = new ArrayList<Info>(); 
      
      stack = new Stack();
      
        System.out.println("\n STACK INICIAL \n");
      
      info = new Info(10, "Matapi");
      stack.push(info);      
      ultimo = stack.peek();
      System.out.println(ultimo.getName());

      info = new Info(8, "Titistar");
      stack.push(info);       
      info = (Info)stack.peek();
      System.out.println(info.getName());

      info = new Info(5, "Mercy");
      stack.push(info);            
      info = stack.peek();
      System.out.println(info.getName());
      
      info = new Info(7, "Carlos");
      stack.push(info);
      ultimo = stack.peek();
      System.out.println(ultimo.getName());
      
      info = new Info(11, "Santiago");
      stack.push(info);
      ultimo = stack.peek();
      System.out.println(ultimo.getName());
      
      int sizeStack = stack.size();
      int sizeAux = arrayAux.size();
      int auxID;
      String auxName;
      
        for (int i = 0; i < sizeStack; i++) {
            ultimo = stack.peek();
            arrayAux.add(ultimo);
            stack.pop();
        }

        System.out.println("\n STACK REVERTIDO \n");

        for (int i = 0; i < arrayAux.size(); i++) {
            auxID = arrayAux.get(i).getId();
            auxName = arrayAux.get(i).getName();
            
            info = new Info(auxID, auxName);
            stack.push(info);
            
            ultimo = stack.peek();
            System.out.println(ultimo.getName());
        }

        
    }
    
}
