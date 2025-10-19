# Sistema de Gerenciamento de Atendimento ao Cliente
Repositório para a ATIVIDADE PRATICA SUPERVISIONADA 1 RA01 - Fila E Pilha
<p>Nomes: Guilherme Arcanjo de Morais, Leandro José da Silva Pavan, Lucas da Costa Paula, Renan Americo Herculano</p>

<h2>Implementação</h2>
<p>Esse projeto tem como objetivo aprimorar conhecimento acerca de Pilhas, Filas e Filas Encadeadas, através da implementação de um sistema de gerenciamento de atendimento de clientes.</p>
<p>Essa implementação consiste em armazenar um histórico de solicitações de serviço em uma pilha, enquanto uma fila será usada gerenciar a ordem de atendimento dos clientes </p>

<h3>Classes</h3>
<p>Para a implementação, desenvolvemos 5 classes: Elemento, Node, Fila, Pilha, SistemaAtendimento</p>
<ul>
  <li>Elemento: Esta classe é usada para armazenar os dados de solicitações e atendimentos. Ela possui 6 atributos, sendo 3 para a solicitação (id, descricao e dataHora) e 3 para os clientes (nome, numeroIdentificacao e motivoAtendimento). O <strong> id </strong> e <strong> numeroIdentificacao </strong> armazenam os ids da solicitação e do atendimento do cliente, respectivamente. O atributo <strong> descricao </strong> guarda a descrição da solicitação de atendimento. O atributo <strong> dataHora </strong> guarda a data e hora do atendimento, no formato "YYYY-MM-DD HH:MM". O <strong> nome </strong> guarda o nome do cliente e o <strong> motivoAtendimento </strong> guarda o motivo do atendimento solicitado pelo cliente</li>
  <li>Node: Esta classe implementa a estrutura de um nó, que sera usada para o desenvolvimento de uma lista encadeada. Contém 2 atributos: <strong> dados </strong>, que guarda os Elementos dentro da lista e <strong> proximo </strong>, que guarda o próximo nó</li>
  <li>Fila: Classe para implementar a fila encadeada. Contem 2 atributos: <strong> frente </strong> e <strong> tras </strong>, que guardam o primeiro e o último elemento da fila encadeada, contendo também métodos para inserção, atender próximo cliente (uma remoção de elemento da fila) e exibir a fila. Além de um método de verificação de fila vazia e obtenção do tras.</li>
  <li>Pilha: Classe para implementar a pilha encadeada. Contem 1 atributo: <strong> topo </strong> que guarda o nó do topo da pilha. Contem também métodos para inserção, remoção e exibição da pilha, além de um método de verificação para a pilha vazia e obtenção do topo.</li>
  <li>SistemaAtendimento: Classe para a implementação do main do programa, que implementa uma interface para que o usuário possa utilizar o programa.</li>
</ul>

<h3>Métodos</h3>
<p>Foram implementados varios métodos dentro das classes para o funcionamento deste projeto.</p>

<h4>Elemento</h4>
<ul>
  <li>Construtor: Esse é o construtor da classe Elemento, ela faz uma verificação através do id para identificar se o elemento é um atendimento de cliente ou uma solicitação. O código analisa, através do uso de uma substring, qual os 3 primeiros caracteres do id. Se for "CLI", trata-se de um atendimento de cliente; Se for "REQ", é uma solicitação.</li>
  <li>imprimirElemento: Verifica se o atributo <strong> nome </strong> esta preenchida, caso esteja imprime o atendimento do cliente, caso contrario imprime a solicitação.</li>
  <li>obterIdAtendimento e obterIdSolicitacao: Retornam os valores do id do atendimento e da solicitação do elemento.</li>
</ul>

<h4>Node</h4>
<ul>
  <li>Construtor: Inicializa os dados e o proximo</li>
  <li>obterDados, obterProximo: Retorna os valores de dados e proximo</li>
  <li>definirProximo: Defini um nó como próximo</li>
  <li>imprimir: Imprime o nó</li>
</ul>

<h4>Fila</h4>
<ul>
  <li>Construtor: Inicializa os nós frente e trás como nulo</li>
  <li>vazia: Verifica se a fila esta vazia, retornando true, caso esteja vazia, caso contrario, false</li>
  <li>inserir: Insere um novo nó na fila, tratando os nós de frente e trás de acordo a a execução, de modo a sempre fazer com que o frente aponte para o primeiro elemento e o tras, para o último</li>
  <li>atenderProximo: Remove o primeiro elemento da fila, simulando o atendimento do cliente, tratando do nó frente, para que aponte para o próximo elemento e o tras, caso seja o último elemento</li>
  <li>visualizarOrdemAtendimento: Percorre a lista encadeada apartir do primeiro nó, o frente, e exibe suas informações</li>
</ul>

<h4>Pilha</h4>
<ul>
  <li>Construtor: Inicializa os nó topo como nulo</li>
  <li>vazia: Verifica se a pilha esta vazia, retornando true, caso esteja vazia, caso contrario, false</li>
  <li>inserir: Insere um novo nó na pilha</li>
  <li>remover: Remove o último elemento da pilha</li>
  <li>visualizarHistorico: Percorre a lista encadeada apartir do topo e exibe suas informações</li>
</ul>

<h4>sistemaAtendimento</h4>
<ul>
  <li>main: Inicializa a fila e a pilha através de vetores de dados do tipo Elemento e implementa uma interface de usuário que permite acessar as funcionalidades de inserção, exibição e remoção de atendimentos e solicitações</li>
</ul>

<h3>Conclusão</h3>
<p>Através desse projeto, fomos capazes de utilizarmos nosso conhecimento acerca das estruturas de pilha, fila e lista encadeada em conjunto de modo a obter um sistema funcional que permite a gerência otimizada de atendimento à clientes.</p>
