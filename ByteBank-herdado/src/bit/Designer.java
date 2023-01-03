package bit;

public class Designer extends Funcionario{

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do Designer");
        return 200;
    }
}
