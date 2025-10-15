public class Node {
    private Elemento dados;
    private Node proximo;

    public Node(Elemento dados) {
        this.dados = dados;
        this.proximo = null;
    }

    public Elemento obterDados() {
        return dados;
    }

    public Node obterProximo() {
        return proximo;
    }

    public void definirProxio(Node proximo) {
        this.proximo = proximo;
    }

    public void imprimir() {
        dados.imprimirElemento();
    }


}
