package fixacaoVet;

    import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        int n = scan.nextInt();

        if (n > 0 && n <= 10) n = n;

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            int number = scan.nextInt();
            vect[i] = number;
        }

        double sum = 0;
        for (double value: vect) {
            sum += value;
        }

        double avg = sum / n;
        System.out.println(avg);
    
        

    }
    
}
