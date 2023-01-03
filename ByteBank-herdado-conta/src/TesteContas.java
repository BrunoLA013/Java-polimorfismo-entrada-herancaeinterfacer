public class TesteContas {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(100, 111, 111);

        ContaPoupanca contaPoupanca = new ContaPoupanca(200, 222, 222);

        contaCorrente.tranfere(10,contaPoupanca);
        contaCorrente.deposita(600);

        System.out.println("CC: " +  contaCorrente.getSaldo());
        System.out.println("CP: " +  contaPoupanca.getSaldo());
    }
}
