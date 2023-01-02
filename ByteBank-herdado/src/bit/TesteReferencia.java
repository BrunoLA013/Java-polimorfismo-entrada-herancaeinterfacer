package bit;

public class TesteReferencia {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setSalario(5000.00);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(editorVideo);

        System.out.println(controle.getSoma());


    }
}
