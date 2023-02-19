package listArraysMatrizes;

import java.util.Scanner;

public class Matriz01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Variavel ");
        int n = scan.nextInt();

        int[][] number = new int[n][n];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < n; j++) {
                number[i][j] = scan.nextInt();
            }
        }

        // Diagonal principal
        System.out.println("Main diagonal ");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i][i] + " ");
        }

        // Mostrar a quantidade de número negativos
        int negative = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < n; j++) {
                if (number[i][j] < 0) negative++;
            }
        }
        System.out.println("Negatives: " + negative);
        scan.close();
        
        
    }
    
}
