package secao10.fixacaoVet;
    import java.util.Scanner;
    import java.util.Locale;
public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How much numbers will be used? ");
        int n = scan.nextInt();
        

        double[] number = new double[n];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Type a number: ");
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

        System.out.println("Highest number: " + h);
        System.out.println("number position: " + p);

    }
    
}
