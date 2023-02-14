package secao10;

    import java.util.Scanner;
    import java.util.Locale;

public class Vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            scan.nextLine();
            System.out.println("Digite o nome do produto: ");
            String name = scan.nextLine();
            System.out.println("Digite o valor do produto: ");
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum/n;
        System.out.println(avg);

    }
    
}
