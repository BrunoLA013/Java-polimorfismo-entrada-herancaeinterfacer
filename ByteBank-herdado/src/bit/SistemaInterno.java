package bit;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel fi) {
        boolean autenticou = fi.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode estrar no sistema!");
        } else {
            System.out.println("Não pode entrar no sistema" + "");
        }
    }
}
