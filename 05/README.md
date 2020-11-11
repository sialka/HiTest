# :books: Direct Talk - Processo Seletivo


## :five: Resposta:

### Analise a solução, considerando concorrência entre chamadas e escopo de transações.



**Concorrência entre chamadas** 

Trata-se de processos executados simultaneamente por muitos usuários, no exemplo deste exercício o banco de dados deverá administrar o controle de concorrência entre as informações que estão sendo acessadas pelos usuários.



**Escopo de transações**

E quando todo o processo de uma transação segue algumas etapas e se houve algum problema entre estas etapas a transação não é efetuada.



**Conclusão**



Para que os métodos *debitar* e *creditar* possam executar bem o seu proposito:



1. O banco de dados tem que aguentar a alta demanda de acessos cumprindo com a **concorrência entre chamadas**.

2. Para que o **escopo de transação** funcione os métodos devem observar os seguintes passos:



> **Ao Debitar**

**Inicio da transação**

- [x] A conta existe
- [x] Tem saldo
- [x] Debita o valor
- [x] Atualiza o saldo

**Fim da transação (efetivar)**



> **Ao Creditar**

**Inicio da transação**

- [x] A conta existe
- [x] Credite o valor
- [x] Atualiza o saldo

**Fim da transação (efetivar)**