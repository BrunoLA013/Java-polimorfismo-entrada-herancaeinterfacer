package bit;

public class Gerente extends Funcionario{

    private int senha;

    public Gerente() {
    }

    public double getBonificacao() {
        System.out.println("bonificação Gerente");
        return super.getBonificacao() + super.getSalario();
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
