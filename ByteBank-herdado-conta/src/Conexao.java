public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo Conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }


    @Override
    public void close(){
        System.out.println("Fechando conexao");
    }
}
