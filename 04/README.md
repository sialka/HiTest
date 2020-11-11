# :books: Direct Talk - Processo Seletivo


## :four: Resposta:

### a) É boa prática definir um tipo específico de exceção que estende da classe Exception? Se sim, em quais casos?



Sim é uma boa prática lançar Exception especificas, dessa forma podemos evitar desperdício de recursos. Devemos fazer naqueles casos onde queremos indicar que um erro especifico ocorreu.



### b) Quando você capturaria uma exceção através de clausulas try e catch? Por que?



Quando precisamos executar uma tarefa e na sua execução podemos ter um erro inesperado.

Se o mesmo não for tratado podemos interromper o fluxo da aplicação.




### c) Em quais situações você lançaria uma exceção? Cite exemplos.



Podemos lançar exceção para :



- conexões com servidor;

- consulta a banco de dados;

- leitura de arquivo;

- tentar salvar arquivo onde não temos permissão de escrita;

  