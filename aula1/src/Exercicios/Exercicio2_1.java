package Exercicios;

public class Exercicio2_1 {
    public static void main(String[] args) {

        System.out.println("Parte 1:");
        for (int a=10 ; a<= 25 ; a++ ){
            System.out.println(a);
        }
        
        System.out.println("parte2:");
        int somab=0;
        for (int b=1 ; b<=100; b=b+2 ){
            somab = somab + b;
        }
        System.out.println("A soma é: "+somab);
        
        
        System.out.println("parte3:");
        int c = 0;
        int somac = 0;
        while(somac <= 100){
            System.out.println(c);
            somac = somac + c;
            c = c+1;
            System.out.println("A soma é: "+somac);
        }
        
    }
 
}


/**
1. Imprima todos os números inteiros de 10 a 25 utilizando uma estrutura de repetição.
2. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).
3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já impressos for menor que 100.
 */