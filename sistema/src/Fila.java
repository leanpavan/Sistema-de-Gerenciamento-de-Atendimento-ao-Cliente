public class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    public boolean vazia() {
        if (frente != null) { return false; }
        return true;
    }

    public Node obterTras(){
        return this.tras;
    }

    public void inserir(Elemento elemento) {
        Node novoNo = new Node(elemento);
        if (vazia()) {
            this.frente = novoNo;
            this.tras = novoNo;
        } else {
            tras.definirProximo(novoNo);
            tras = novoNo;
        }
        //System.out.println("Elemento adicionado a fila com sucesso.\n");
    }

    public Elemento atenderProximo() { // Remover elemento da fila
        if (vazia()) {
            System.out.println("Não foi possível atender o próximo elemento da lista, pois ela está vazia");
            return null;
        }
        Elemento elementoAtendido = frente.obterDados();
        frente = frente.obterProximo();

        if (frente == null) {
            tras = null;
        }
        return elementoAtendido;
    }

    public void visualizarOrdemAtendimento() {
        if (vazia()) {
            System.out.println("Não foi possível visualizar a ordem de atendimento, pois a fila está vazia\n");
        }

        System.out.println("\nORDEM DE ATENDIMENTO:");
        Node noAtual = frente;
        int indice = 1;

        while (noAtual != null) {
            noAtual.obterDados().imprimirElemento();
            noAtual = noAtual.obterProximo();
            indice++;
        }
    }
}
