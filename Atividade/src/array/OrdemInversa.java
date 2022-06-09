/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
  public static void main(String[] args) {
    int[] vetor = { 0, 1, 2, 3, 4, 5 };

    for (int i = vetor.length - 1; i > 0; i--) {
      System.out.println(vetor[i]);
    }

  }
}
