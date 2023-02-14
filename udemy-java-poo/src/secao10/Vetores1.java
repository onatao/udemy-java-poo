package secao10;

    import java.util.Locale;
    import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de valores");
        int n = scan.nextInt();
        double [] vect = new double[n]; // vetor do tipo double com tamanho de n 

        for(int i = 0; i < n; i++) { // percorre o array
            vect[i] = scan.nextDouble();
        }

        double value = 0;
        for (Double valor: vect) {
            value += valor; 
        }
        
        System.out.println(value/n); // media

        
    }
}
