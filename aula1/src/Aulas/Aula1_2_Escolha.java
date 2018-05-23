
package Aulas;
import java.util.Scanner;
public class Aula1_2_Escolha {
        public static void main(String[] args) {
            int dia;
            Scanner ler = new Scanner (System.in);
            System.out.print("DIGITE UM VALOR: ");
            dia = ler.nextInt();
            switch (dia){
                case 1:{
                    System.out.println("digitou 1");
                    break;
                }
                case 2:{
                    System.out.println("digitou 2");
                    break;
                }
                case 3:{
                    System.out.println("digitou 3");
                    break;
                }
                case 4: {
                    System.out.println("digitou 4");
                    break;
                }
                default :{
                    System.out.println("Deu zica");
                }
            }
        }
}
