# Criando um Banco Digital com Java e Orientação a Objetos


Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Incrementações ao projeto original
Em geral, foram adicionados novos atributos ao Cliente, permitindo que o mesmo tenha um cartão de crédito e faça operações
sem afetar o saldo da Conta, além de ser caracteriizado como Pessoa Física ou Jurídica. Também o método de transferência 
foi alterado permtindo pagamentos por TED, Pix e Crédito (tendo no TED o desconto de 1% do valor da transferência).