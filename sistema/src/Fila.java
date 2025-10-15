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

    public Elemento atenderProximo() {
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
}
