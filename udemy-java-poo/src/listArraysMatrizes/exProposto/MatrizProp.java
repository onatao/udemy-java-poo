package listArraysMatrizes.exProposto;

    import java.util.Scanner;
    
public class MatrizProp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        
        System.out.println("Digite o número de linhas: ");
        int m = scan.nextInt();
        System.out.println("Digite o número de colunas: ");
        int n = scan.nextInt();

        int[][] matriz = new int[m][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Digite o elemento da matriz: ");
        int x = scan.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down : " + matriz[i+1][j]);
                    }
                }
            }
        }

        scan.close();

    }
    
}
