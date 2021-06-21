import java.util.Scanner;

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