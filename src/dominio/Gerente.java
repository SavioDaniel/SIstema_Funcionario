package dominio;

public class Gerente extends Funcionario{
    public Gerente(double salario, String nome, int ID) {
        super(salario, nome, ID);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.calcularBonus());
    }

}
