public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(float saldo, int agencia, int numero) {

        super(saldo, agencia, numero);
    }

    @Override
    public void sacar(float valor) throws SaldoInsuficienteException {
        float valorASacar = valor + 0.2f;
        super.sacar(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
}
