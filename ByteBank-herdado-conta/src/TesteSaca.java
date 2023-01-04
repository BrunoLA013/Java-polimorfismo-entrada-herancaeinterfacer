public class TesteSaca {
    public static void main(String[] args) {

        Conta conta = new ContaCorrente(200, 13245, 465464);
        try {
            conta.sacar(210f);
        }catch (SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
