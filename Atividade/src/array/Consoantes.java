import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] consoante = new String[6];

    int quantidadeConsoantes = 0;

    for (int i = 0; i < consoante.length; i++) {
      System.out.print("Letra: ");
      String letra = scan.next();
      if (!(letra.equalsIgnoreCase("a") ||
          letra.equalsIgnoreCase("e") ||
          letra.equalsIgnoreCase("i") ||
          letra.equalsIgnoreCase("o") ||
          letra.equalsIgnoreCase("u"))) {

        consoante[i] = letra;
        quantidadeConsoantes++;
      }
    }

    System.out.println("-------------------------------------------");
    for (int i = 0; i < consoante.length; i++) {
      if (consoante != null)
        System.out.println("Letras: " + consoante[i]);
    }
    System.out.println("Quantidade Consoantes: " + quantidadeConsoantes);
  }
}
