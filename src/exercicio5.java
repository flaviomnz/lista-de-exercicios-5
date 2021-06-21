import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        float valorProduto = sc.nextFloat();

        System.out.println("Digite o a taxa a ser aplicada sobre o produto");
        float taxaProduto = sc.nextFloat();

        float valorImposto = somaImposto(taxaProduto,valorProduto);
        float valorFinalProduto = alterar(valorImposto,valorProduto);
        System.out.println("Valor do Imposto:  R$" + valorImposto);
        System.out.println("Valor final do produto:  R$" +valorFinalProduto);
    }
    public static float somaImposto (float taxaImposto, float custoProduto){
        return custoProduto * (taxaImposto/100);
    }
    public static float alterar (float valorTaxaProduto,float custoProduto){
        return (valorTaxaProduto + custoProduto);
    }
}