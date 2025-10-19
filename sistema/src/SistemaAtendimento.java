import java.util.Scanner;

public class SistemaAtendimento {
    public static void main(String[] args) {
        // Inicialização de fila de atendimento de clientes
        Elemento[] filaAtendimento = new Elemento[] {
                new Elemento("CLI001", "Maria Silva", "Dúvida sobre produto"),
                new Elemento("CLI002", "João Souza", "Reclamação de serviço"),
                new Elemento("CLI003", "Ana Costa", "Solicitação de reembolso"),
                new Elemento("CLI004", "Pedro Alves", "Informações de entrega"),
                new Elemento("CLI005", "Carla Dias", "Agendamento de visita"),
                new Elemento("CLI006", "Lucas Martins", "Alteração de pedido"),
                new Elemento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
                new Elemento("CLI008", "Rafael Lima", "Renovação de assinatura"),
                new Elemento("CLI009", "Fernanda Gomes", "Suporte para instalação"),
                new Elemento("CLI010", "Carlos Eduardo", "Pedido de orçamento")
        };

        // inserção de dados na fila
        Fila fila = new Fila();
        for(int i=0; i<10; i++) {
            fila.inserir(filaAtendimento[i]);
        }

        // Inicialização de histórico de solicitações
        Elemento[] historico = new Elemento[]{
                new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"),
                new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
                new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
                new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00"),
                new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
                new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
                new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
                new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00"),
                new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30"),
                new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00")
        };

        // inserção de dados na pilha
        Pilha pilha = new Pilha();
        for (int i=0; i<10; i++) {
            pilha.inserir(historico[i]);
        }

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Atendimento ao Cliente!");

        boolean execucao = true;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\n---------------------------------------------------------------------");
            System.out.println("Menu de Operações:");
            System.out.println("1. Inserir atendimento de cliente na fila");
            System.out.println("2. Inserir solicitação na pilha");
            System.out.println("3. Exibir atendimentos de clientes");
            System.out.println("4. Exibir histórico de solicitações");
            System.out.println("5. Atender proximo cliente");
            System.out.println("6. Remover ultima sólicitação do histórico");
            System.out.println("7. Sair");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Escolha a operação: ");


            int escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {

                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = teclado.nextLine();

                    String idAnteriorAtendimento = fila.obterTras().obterDados().obterIdAtendimento();

                    System.out.print("Digite o ID (Último id: "+idAnteriorAtendimento+"): ");
                    String idAtendimento = teclado.nextLine();

                    System.out.print("Motivo de Atendimento: ");
                    String motivoAtendimento = teclado.nextLine();

                    System.out.println("Adicionando atendimento...");
                    fila.inserir(new Elemento(idAtendimento, nome, motivoAtendimento));
                    System.out.println("Atendimento de "+ nome +" adicionado");
                    break;

                case 2:

                    String idAnteriorSolicitacao = pilha.obterTopo().obterDados().obterIdSolicitacao();

                    System.out.print("Digite o ID (Último id:"+idAnteriorSolicitacao+"): ");
                    String idSolicitacao = teclado.nextLine();

                    System.out.print("Digite a descrição da solicitação: ");
                    String descricao = teclado.nextLine();

                    System.out.print("Digite a data e horario (Ex.: 2024-08-20 10:30): ");
                    String data = teclado.nextLine();

                    System.out.println("Adicionando solicitação no histórico...");
                    pilha.inserir(new Elemento(idSolicitacao, descricao, data));
                    System.out.println("Solicitação adicionada");
                    break;

                case 3:
                    fila.visualizarOrdemAtendimento();
                    break;

                case 4:
                    pilha.visualizarHistorico();
                    break;

                case 5:
                    System.out.println("\nAtendendo cliente...");
                    Elemento proximo = fila.atenderProximo();
                    System.out.println("Atendimento de " + proximo.nome + " finalizado.");
                    break;

                case 6:
                    System.out.println("\nRemovendo último elemento do histórico");
                    Elemento remover = pilha.remover();
                    System.out.println("Histórico removido: " + remover.id);
                    break;

                case 7:
                    System.out.println("\nEncerrando programa...");
                    teclado.close();
                    execucao = false;
                    break;
            }

        } while (execucao);


    }
}
