
package aula.pkg13;

import java.util.Scanner;


/**
 *22/08/2023
 * @author Clara Amorim Trega
 * Linguagem de programação
 * Exercício 2
 */
public class Aula13 {

    public static void main(String[] args) {
       
        Scanner ler =new Scanner(System.in); 
        int numero;
        
        System.out.println ("Digite um número inteiro:");
        numero= ler.nextInt();
        
        numero= numero % 2;
        
        if (numero !=0){
            
            System.out.println("O numero é impar");
                    
                    }else{
            System.out.println("O número é par");
        }
        }
        


    }
    

