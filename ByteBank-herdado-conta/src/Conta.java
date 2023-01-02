public class Conta {
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

    public boolean sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
         //   System.out.println(this.titular + ", Saque realizado com sucesso, seu sldo atual é de R$" + this.saldo);
            return true;
        } else {
          //  System.out.println(this.titular + ",Valor insufuciente para sacar, seu saldo é de R$" + this.saldo);
            return false;
        }
    }

    public void deposita(float depositar) {
        this.saldo = this.saldo + depositar;
    }

    public boolean tranfere(float valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
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
