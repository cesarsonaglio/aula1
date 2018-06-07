package Exercicios;

import java.util.Scanner;

public class Exercicio4_2 {
    public static void main(String[] args) {
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


/*
Faça um programa que peça para n pessoas
a sua idade, ao final o programa devera
verificar se a média de idade da turma varia
entre 0 e 25,26 e 60 e maior que 60; e então,
dizer se a turma é jovem, adulta ou idosa,
conforme a média calculada.
*/