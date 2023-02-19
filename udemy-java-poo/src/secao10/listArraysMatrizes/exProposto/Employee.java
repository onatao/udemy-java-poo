package secao10.listArraysMatrizes.exProposto;

public class Employee {
    
    private Integer id;
    private String nome;
    private Double salario;

    public Employee (String nome, Double salario, Integer id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
     }
 
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return "\nNome: " + this.getNome() +
               "\nSalário: " + this.getSalario() +
               "\nID: " + this.getId();
    }

    public void aumentoSalario(double porcentagem) {
        salario+=salario*porcentagem/100;
    }
}
