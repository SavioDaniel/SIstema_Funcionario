package dominio;

public class Funcionario {
    private String nome;
    private double salario;
    public final int ID;

    public Funcionario(double salario, String nome, int ID) {
        this.ID = ID;
        this.salario = salario;
        this.nome = nome;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.ID);
        System.out.println(this.salario);
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}