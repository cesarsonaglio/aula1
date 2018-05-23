
package Exercicios;
import java.util.Scanner;
public class Exercicio1_3 {
           public static void main(String[] args){
               int idade;
               Scanner ler = new Scanner (System.in);
               System.out.println("Digite a idade do hospede:");
               idade = ler.nextInt();
               System.out.println("valor digitado é: "+idade);
               if (idade > 130 && idade < 0){
                   System.out.println("IDADE INVÁLIDA!");
               }else {
                   if (idade >=0 && idade <=3){
                       System.out.println("Hospede RECANTO");
                   }
                   if (idade >=4 && idade <=11){
                       System.out.println("Hospede INFANTIL");
                   }
                   if (idade >=12 && idade <=17){
                       System.out.println("Hospede JUVENIL");
                   }
                   if (idade >=18 && idade <=50){
                       System.out.println("Hospede ADULTO");
                   }
               }
               
               
           }
}