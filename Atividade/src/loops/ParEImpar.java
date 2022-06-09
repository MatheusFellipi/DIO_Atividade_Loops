import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantidadePar = 0, quantidadeImpar = 0;

    int quantidadeNumeros;
    System.out.println("quando numeros voce vai entrar?");
    quantidadeNumeros = scan.nextInt();

    int numero;
    int i = 0;
    do {
      System.out.println("entre com seu numeros");
      numero = scan.nextInt();

      if (numero % 2 == 0)
        quantidadePar++;
      else
        quantidadeImpar++;

      i++;
    } while (i < quantidadeNumeros);
    System.out.println("Quantidade de par e:" + quantidadePar);
    System.out.println("Quantidade de impares e:" + quantidadeImpar);
  }
}
