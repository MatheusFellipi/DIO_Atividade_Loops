import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class NumerosAleatorios {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numAleatorios = new int[20];

    for (int i = 0; i < numAleatorios.length; i++) {
      int numero = random.nextInt(100);
      numAleatorios[i] = numero;
    }

    System.out.print("Numero Aleatorio: ");
    for (int i : numAleatorios) {
      System.out.print(i + " ");
    }

    System.out.print("\nSucessores Numero Aleatorio: ");
    for (int i : numAleatorios) {
      System.out.print((i + 1) + " ");
    }

    System.out.print("\nAntecessor Numero Aleatorio: ");
    for (int i : numAleatorios) {
      System.out.print((i - 1) + " ");
    }

  }

}
