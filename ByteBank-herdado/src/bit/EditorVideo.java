package bit;

public class EditorVideo extends Funcionario {

    public EditorVideo() {
    }

    public double getBonificacao() {
        System.out.println("Editor de video");
        return super.getBonificacao() + 100;
    }


}
