public class Elemento {
    // Solicitação
    String id;
    String descricao;
    String dataHora;

    // Cliente
    String numeroIdentificacao;
    String nome;
    String motivoAtendimento;

    // Construtor para elemento solicitação
    public Elemento(String id, String descricao_nome, String dataHora_motivoAtendimento) {
        // analisar id
        String identificacao = id.substring(0, 3);
        if (identificacao.equals("CLI")) {
            this.numeroIdentificacao = id;
            this.nome = descricao_nome;
            this.motivoAtendimento = dataHora_motivoAtendimento;
        } else {
            this.id = id;
            this.descricao = descricao_nome;
            this.dataHora = dataHora_motivoAtendimento;
        }
    }

    public String obterIdAtendimento() {
        return this.numeroIdentificacao;
    }

    public String obterIdSolicitacao() {
        return this.id;
    }

    public void imprimirElemento() {
        // Se nome não for nulo quer dizer que é um cliente
        if (nome != null) {
            System.out.printf("Elemento Cliente: Nome= %s , NumeroIdentificacao= %s , MotivoAtendimento= %s\n",
                    nome, numeroIdentificacao, motivoAtendimento);
        }
        else {
            System.out.printf("Elemento Solicitacao: ID= %s , Descricao= %s , DataHora= %s\n",
                    id, descricao, dataHora);
        }
    }
}
