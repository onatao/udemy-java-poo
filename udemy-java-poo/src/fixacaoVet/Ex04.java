package fixacaoVet;
    import java.util.Scanner;
    import java.util.Locale;
public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números serão digitados? ");
        int n = scan.nextInt();
        

        double[] number = new double[n];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Digite o número: ");
            number[i] = scan.nextInt();
        }

        double h = 0;
        int p = 0;

        for (int i = 0; i < n; i++) {
            if (number[i] > h) {
                h = number[i];
                p = i;
            }
        }

        System.out.println("Maior número digitado: " + h);
        System.out.println("Posição do maior número: " + p);

    }
    
}
