public class TesteTribuaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100,123,654);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CaculadorDeImposto c1 = new CaculadorDeImposto();

        c1.registra(cc);
        c1.registra(seguroDeVida);

        System.out.println(c1.getTotalImposto());
    }
}
