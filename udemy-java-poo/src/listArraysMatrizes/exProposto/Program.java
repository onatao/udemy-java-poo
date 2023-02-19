package listArraysMatrizes.exProposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        
        System.out.println("Quantos funcionário serão cadastrados? ");
        int n = scan.nextInt();

        // Cadastro de funcionário
        for (int i = 0; i < n; i++) {
            System.out.println("ID: ");
            int id = scan.nextInt();
                
                while (hasId(list, id)) {
                    System.out.println("ID já registrado. Tente novamente: ");
                    id = scan.nextInt();
                }
            
            System.out.println("Nome: ");
            String nome = scan.nextLine();
            System.out.println("Salário: ");
            Double salario = scan.nextDouble();
            list.add(new Employee(nome, salario, id));
        }

        // Aumento de salário
        System.out.println("Digite o ID: ");
        int id = scan.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("ID inválido.");
        }else{
            System.out.println("Porcentagem de aumento: ");
            double porcentagem = scan.nextDouble();

            emp.aumentoSalario(porcentagem);
        }

        // Listando funcionários
        for (Employee funcionario: list) {
            System.out.println(funcionario);
        }

        scan.close();

    }

    // Comparar os IDs
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
    

