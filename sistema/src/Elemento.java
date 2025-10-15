// Classe para representar uma solicitação ou um cliente
public class Elemento {
    // Solicitação
    String id;
    String descricao;
    String dataHora;

    // Cliente
    String nome;
    int numeroIdentificacao;
    String motivoAtendimento;

    // Construtor para elemento solicitação
    public Elemento(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    // Construtor para elemento cliente
    public Elemento(String nome, int numeroIdentificacao, String motivoAtendimento) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.motivoAtendimento = motivoAtendimento;
    }

    public void imprimirElemento() {
        // Se nome não for nulo quer dizer que é um cliente
        if (nome != null) {
            System.out.printf("Elemento Cliente: Nome= %s , NumeroIdentificacao= %d , MotivoAtendimento= %s",
                    nome, numeroIdentificacao, motivoAtendimento);
        }
        else {
            System.out.printf("Elemento Solicitacao: ID= %s , Descricao= %s , DataHora= %s",
                    id, descricao, dataHora);
        }
    }
}
