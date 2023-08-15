
package aula07;

import java.util.Scanner;

/**
 * Disciplina - Linguagem de programação
 *Data 15/08/2023
 *@author Clara Amorim Trega
 */
public class Aula07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float soma, media = 0;
        
        System.out.println("Qual nome do aluno?");
        
        String nome= ler.next();
        System.out.println("Informe as 4 notas");
        
        float nota1 = ler.nextFloat();
        float nota2 = ler.nextFloat();
        float nota3 = ler.nextFloat();
        float nota4 = ler.nextFloat();
        
        soma = nota1+nota2+nota3+nota4;
        media = soma/4; 
        
        System.out.println("O valor da média é:" + media);
                
                
     
        
        
                
        
    }
    
}
