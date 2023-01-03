public class ContaPoupanca extends Conta implements Tributavel{


    public ContaPoupanca(float saldo, int agencia, int numero) {
        super(saldo, agencia, numero);
    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}
