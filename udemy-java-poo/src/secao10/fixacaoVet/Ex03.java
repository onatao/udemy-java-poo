package secao10.fixacaoVet;
    import java.util.Locale;
    import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serão cadastradas? ");
        int n = scan.nextInt();

        String[] name = new String[n];
        int[] age = new int [n];
        double[] height = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do usuário:\n ", 1 + i);
            System.out.println("Digite o nome: ");
            name[i] = scan.next();
            System.out.println("Informe a idade: ");
            age[i] = scan.nextInt();
            System.out.println("Informe a altura: ");
            height[i] = scan.nextDouble();
        }

        double total_height = 0;
        int min_age = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) min_age++;
            total_height += height[i];
        }

        double avg_height = total_height / n;
        double min = ((double) min_age / n) * 100;

        System.out.printf("Média de alturas: " + avg_height);
        System.out.println("Porcentagem de menores: " + min);
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) System.out.println("Nome: " + name[i]);
        }

        scan.close();
    }
    
}
