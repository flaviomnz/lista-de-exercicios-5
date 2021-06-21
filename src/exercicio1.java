import java.util.Scanner;

//Faça um programa para imprimir

/*       1
         2   2
         3   3   3
         .....
         n   n   n   n   n   n  ... n

  */
public class exercicio1 {
    public static void gerador(int valorinput) {
        for (int i = 0; i < valorinput; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int valorinput = sc.nextInt();
        gerador(valorinput);
    }
}