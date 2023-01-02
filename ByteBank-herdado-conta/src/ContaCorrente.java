public class ContaCorrente  extends Conta{

    public ContaCorrente(float saldo, int agencia, int numero) {
        super(saldo, agencia, numero);
    }

    @Override
    public boolean sacar(float valor) {
        float valorASacar = valor + 0.2f;
        return super.sacar(valorASacar);
    }
}
