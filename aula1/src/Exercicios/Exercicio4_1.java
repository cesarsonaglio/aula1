package Exercicios;
import java.util.Scanner;
public class Exercicio4_1 {
    public static void main(String[] args) {
        int cont=0;
        float valorcd=1;
        float valortotal=0;
        System.out.println(" DIGITE ZERO PARA SAIR ");
        while (valorcd != 0) {
            Scanner ler = new Scanner (System.in);
            System.out.println("Digite o valor do CD");
            valorcd = ler.nextFloat();
            valortotal=valorcd+valortotal;
            cont++;
        }
        cont = cont -1;
        System.out.println("A média de investimento foi:  "+valortotal/cont);
    }
    
}


/*
Faça um programa que calcule o valor total
investido por um colecionador em sua
coleção de CDs e o valor médio gasto em
cada um deles. O usuário deverá informar a
quantidade de CDs e o valor para em cada
um. */