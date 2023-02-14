package fixacaoVet;
    import java.util.Scanner;
import java.util.Vector;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Quantos números serão digitados? ");
        int n = scan.nextInt();

        if (n > 0 && n <= 10) n = n;
        
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            double number = scan.nextDouble();
            vect[i] = number;
        }

        for (int i = 0; i < vect.length; i++) System.out.print(vect[i] + " ");

        double sum = 0;
        for (double value: vect) {
            sum += value;
        }
        double avg = sum / n;

        System.out.println("Soma dos valores: " + sum);
        System.out.println("Média dos valores: " + avg);
    }
    
}
