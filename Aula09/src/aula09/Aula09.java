
package aula09;

import java.util.Scanner;

/**
 *
 * @author 17252092682
 */
public class Aula09 {

  
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
       
        
        System.out.println("Informe o valor de A:");
        float a = ler.nextFloat();
                
                
        System.out.println("Informe o valor de B:");
        float b= ler.nextFloat();
                

       if( a>b){
       
       System.out.println("Maior");
       
       }else if (a<b){
           
       System.out.println("Menor");
       
       }else{
           
           System.out.println("Igual");    
       
       
       }
    }
    
}
    

