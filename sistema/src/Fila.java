// Classe para representar uma fila usando lista encadeada
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

    public void inserir(Elemento elemento) {
        Node novoNo = new Node(elemento);
        if (vazia()) {
            this.frente = novoNo;
            this.tras = novoNo;
        } else {
            tras.definirProximo(novoNo);
            tras = novoNo;
        }
        System.out.println("Elemento adicionado a fila com sucesso.\n");
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

        System.out.println("ORDEM DE ATENDIMENTO\n");
        Node noAtual = frente;
        int indice = 1;

        while (noAtual != null) {
            System.out.printf("Posição: %s", noAtual.obterDados());
            noAtual = noAtual.obterProximo();
            indice++;
            System.out.println("-----------------------------------\n");
        }
    }
}
