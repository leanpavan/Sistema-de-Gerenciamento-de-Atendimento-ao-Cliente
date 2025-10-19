public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    public Node obterTopo() {
        return this.topo;
    }

    public void inserir(Elemento elemento) {
        Node noElemento = new Node(elemento);
        noElemento.definirProximo(topo);
        topo = noElemento;
        //System.out.println("Solicitação adicionada ao histórico\n");
    }

    public Elemento remover() {
        if (vazia()) {
            System.out.println("Não foi possível remover um elemento, pois a pilha está vazia.\n");
        }
        Elemento elementoParaRemover = topo.obterDados();
        topo = topo.obterProximo();
        return elementoParaRemover;
    }

    public boolean vazia() {
        if (topo != null) { return false; }
        return true;
    }

    public void visualizarHistorico() {
        if (vazia()) {
            System.out.println("Não foi possível visualizar o histórico, pois a pilha está vazia\n");
        }
        System.out.println("\nHISTÓRICO DE SOLICITAÇÕES:");
        Node noAtual = topo;
        while (noAtual != null) {
            noAtual.imprimir();
            noAtual = noAtual.obterProximo();
        }
    }
}
