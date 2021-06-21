import java.util.Scanner;

//Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.
public class exercicio3 {
    public static void main(String[] args) {
        int[] argumentos = new int[3];
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite três argumentos:");
        for (int i = 0; i < argumentos.length; i++) {
            argumentos[i] = scanner.nextInt();
        }
    }
    public static int somandoArgs (int[] argsNumeros){
        return (argsNumeros[0]+argsNumeros[1]+argsNumeros[2]);
    }
}
