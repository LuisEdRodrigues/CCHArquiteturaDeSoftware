# Prototype

O padrão de projeto Prototype é utilizado para criar objetos a partir de um protótipo pré-existente. Esse padrão é especialmente útil quando a criação de objetos envolve processos complexos ou demorados, permitindo a clonagem de instâncias já existentes.

No exemplo apresentado, foi implementada uma estrutura de personagens para um jogo, onde cada tipo de personagem — Guerreiro, Mago e Arqueiro — herda de uma classe abstrata chamada Personagem. Essa classe define os atributos básicos de um personagem, como nome, vida, dano e agilidade, além de declarar métodos abstratos como display(), clone() e getCount(). Cada classe concreta implementa sua própria versão do método clone(), garantindo que novas instâncias sejam criadas a partir de um objeto já existente.

O método clone() permite criar réplicas dos personagens sem a necessidade de instanciá-los diretamente usando um construtor. Cada vez que um novo personagem é clonado, um contador é incrementado, e o nome do personagem é atualizado para refletir sua cópia..

O código inclui também uma classe Tropas, que gerencia uma lista de personagens clonados. No método main, são criados protótipos de cada tipo de personagem, e, a partir desses protótipos, são geradas cópias utilizando o método clone(). No final, o método display() é chamado para exibir as informações de todos os personagens clonados.

O principal objetivo do uso do padrão Prototype nesse contexto é facilitar a criação de grandes quantidades de personagens sem a necessidade de invocar repetidamente seus construtores. Isso não apenas melhora a eficiência do código, mas também permite uma maior flexibilidade para modificar os protótipos sem impactar diretamente a lógica de criação das instâncias clonadas. O resultado esperado é a exibição de um conjunto de personagens com atributos idênticos aos protótipos originais, mas com nomes distintos para diferenciar as instâncias clonadas.

# Proxy

O padrão de design Proxy é utilizado para fornecer um substituto ou representante de outro objeto, controlando o acesso a esse objeto. Ele serve como intermediário entre o cliente e o objeto real, permitindo a execução de operações adicionais, como controle de acesso, caching, ou até a adição de funcionalidade sem alterar o objeto real.

No exemplo fornecido, o padrão Proxy é implementado através da classe CachedPersonagemService. Essa classe funciona como um proxy para a classe RealPersonagemService, que é responsável por criar e retornar os objetos dos personagens. O objetivo do CachedPersonagemService é armazenar em cache os personagens que já foram recuperados anteriormente, evitando que a criação de objetos seja repetida, o que pode ser um processo caro. Quando um personagem é solicitado pela primeira vez, o CachedPersonagemService chama o RealPersonagemService para buscar os dados do personagem e, depois, armazena esse personagem no cache. Nas requisições subsequentes, o proxy verifica se o personagem já foi armazenado no cache e, se sim, retorna-o diretamente, sem precisar fazer a busca novamente, otimizando o processo.

O resultado esperado do uso do Proxy, neste caso, é uma melhoria no desempenho do sistema, já que a busca e criação dos personagens ocorre apenas uma vez, enquanto as próximas requisições utilizam os dados armazenados no cache. Isso é particularmente útil em sistemas que lidam com dados de difícil acesso ou que exigem processamento intensivo, como em jogos ou sistemas que necessitam de alta performance.

# Template Method

O padrão de projeto Template Method é um padrão comportamental que define a estrutura de um algoritmo na classe base, permitindo que as subclasses personalizem partes específicas desse algoritmo sem alterar sua estrutura geral. Ele é útil para evitar a repetição de código e garantir que o fluxo de execução seja seguido corretamente pelas subclasses.

No exemplo fornecido, a classe abstrata Personagem serve como base para diferentes tipos de personagens, como Guerreiro, Arqueiro e Mago. Essa classe define um método turno(), que representa a sequência de ações que cada personagem realiza durante um turno no jogo. O método inclui as etapas de exibição do status (display()), defesa (defesa()), ataque (ataque()) e um ataque especial (ataqueEspecial()). O detalhe importante é que ataqueEspecial() é um método abstrato, o que obriga as subclasses a implementarem sua própria versão desse ataque.

Cada classe concreta (Guerreiro, Arqueiro e Mago) herda de Personagem e pode fornecer uma implementação específica para ataqueEspecial(). O Arqueiro atira 10 flechas, o Mago gasta mana para causar dano em área, e o Guerreiro, nesse caso, não possui um ataque especial. Isso demonstra o poder do Template Method, pois permite que cada tipo de personagem tenha um comportamento distinto sem alterar a estrutura principal do turno.

O principal objetivo de usar o Template Method nesse contexto é garantir que todas as subclasses sigam a mesma sequência de ações em um turno, evitando a duplicação de código e garantindo que todas as classes sigam um fluxo coerente. Isso promove a reutilização de código e facilita a manutenção, pois qualquer mudança na estrutura do turno pode ser feita diretamente na classe base sem a necessidade de modificar cada classe concreta individualmente. O resultado esperado é que cada personagem realize seu turno seguindo a sequência estabelecida em turno() na classe abstrata Personagem. 