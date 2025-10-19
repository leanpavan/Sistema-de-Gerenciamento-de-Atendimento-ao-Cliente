# Sistema de Gerenciamento de Atendimento ao Cliente
Repositório para a ATIVIDADE PRATICA SUPERVISIONADA 1 RA01 - Fila E Pilha
<p>Nomes: Guilherme Arcanjo de Morais, Leandro José da Silva Pavan, Lucas da Costa Paula, Renan Americo Herculano</p>

<h2>Implementação</h2>
<p>Esse projeto tem como objetivo aprimorar conhecimento acerca de Pilhas, Filas e Filas Encadeadas, através da implementação de um sistema de gerenciamento de atendimento de clientes.</p>
<p>Essa implementação consiste em armazenar um histórico de solicitações de serviço em uma pilha, enquanto uma fila será usada gerenciar a ordem de atendimento dos clientes </p>

<h3>Classes</h3>
<p>Para a implementação, desenvolvemos 5 classes: Elemento, Node, Fila, Pilha, SistemaAtendimento</p>
<ul>
  <li>Elemento: Esta classe é usada para armazenar os dados de solicitações e atendimentos. Ela possui 6 atributos, sendo 3 para a solicitação (id, descricao e dataHora) e 3 para os clientes (nome, numeroIdentificacao e motivoAtendimento). O <strong> id <strong> e <strong> numeroIdentificacao <strong> armazenam os ids da solicitação e do atendimento do cliente, respectivamente. O atributo <strong> descricao <strong> guarda a descrição da solicitação de atendimento. O atributo <strong> dataHora <strong> guarda a data e hora do atendimento, no formato "YYYY-MM-DD HH:MM". O <strong> nome <strong> guarda o nome do cliente e o <strong> motivoAtendimento <strong> guarda o motivo do atendimento solicitado pelo cliente</li>
  <li>Node: Esta classe implementa a estrutura de um nó, que sera usada para o desenvolvimento de uma lista encadeada. Contém 2 atributos: <strong> dados <strong>, que guarda os Elementos dentro da lista e <strong> proximo <strong>, que guarda o próximo nó</li>
  <li>Fila: Classe para implementar a fila encadeada. Contem 2 atributos: <strong> frente <strong> e <strong> tras <strong>, que guardam o primeiro e o último elemento da fila encadeada, contendo também métodos para inserção, atender próximo cliente (uma remoção de elemento da fila) e exibir a fila. Além de um método de verificação de fila vazia e obtenção do tras.</li>
  <li>Pilha: Classe para implementar a pilha encadeada. Contem 1 atributo: <strong> topo <strong> que guarda o nó do topo da pilha. Contem também métodos para inserção, remoção e exibição da pilha, além de um método de verificação para a pilha vazia e obtenção do topo.</li>
  <li>SistemaAtendimento: Classe para a implementação do main do programa, que implementa uma interface para que o usuário possa utilizar o programa.</li>
</ul>
