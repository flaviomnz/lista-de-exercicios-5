import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    //Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de
        // caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo

        System.out.println("Digite um número:");
        Scanner scanner = new Scanner(System.in);
        int numeros = scanner.nextInt();
        System.out.println(verificarPosiNegativ(numeros));
    }
    public static String verificarPosiNegativ(int numero) { //nome do metodo "verificadorPosiNegativ".
        String msGs;
        if (numero > 0) {
            msGs = "Número positivo.";
        } else if (numero < 0) {
            msGs = "Número negativo.";
        } else {
            msGs = "O número é zero.";
        }
        return msGs;
    }
}
