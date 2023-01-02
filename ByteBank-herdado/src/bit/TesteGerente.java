package bit;

public class TesteGerente {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Bruno");
        g1.setCpf("465465416584");
        g1.setSalario(5000.00);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        System.out.println(g1.getBonificacao());


    }
}
