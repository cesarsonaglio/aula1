
package Aulas;
public class Aula1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0;
        int numero1 = 20;
        int numero2 = 30;
        soma = numero1 + numero2;
        System.out.println("Resultado da soma: "+soma);
        if (soma >= 100) {
            System.out.println("Soma maior que 100");
        }else{
            System.out.println("Soma menor que 100");
        }
    }
    
}
