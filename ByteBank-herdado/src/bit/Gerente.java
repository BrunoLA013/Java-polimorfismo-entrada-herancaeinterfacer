package bit;

public class Gerente extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Gerente() {
        AutenticacaoUtil util = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("bonificação Gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticador.autentica(senha);
    }
}
