import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorEMedia {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double numero;
    double maior = 0d;
    double media;
    double soma = 0d;

    int i = 0;
    do {
      System.out.println("Numero: ");
      numero = scan.nextDouble();
      if (numero > maior)
        maior = numero;

      soma += numero;

      i++;
    } while (i < 5);

    System.out.println("Maior: " + maior);

    media = soma / 5;
    System.out.println("Media: " + media);
  }
}
