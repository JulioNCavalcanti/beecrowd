/*
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e
B atribuindo o seu resultado na variável X. Imprima X.
 */

import java.util.Scanner;

public class Beecrowd1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = A + B;

        System.out.println("X = " + X);

        sc.close();
    }
}