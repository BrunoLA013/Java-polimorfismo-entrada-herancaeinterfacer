public abstract class Conta {
    private float saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;



    public Conta(float saldo, int agencia, int numero) {
        total++;
   //     System.out.println("O total de contas abertas são : "  + Conta.total);
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void sacar(float valor) throws SaldoInsuficienteException {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void deposita(float depositar) {
        this.saldo = this.saldo + depositar;
    }

    public void tranfere(float valor, Conta destino) throws SaldoInsuficienteException {
        this.sacar(valor);
            destino.deposita(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                '}';
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}
