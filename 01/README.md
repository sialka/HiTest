# :books: Direct Talk - Processo Seletivo


## :one: Resposta:

### a) Usar uma interface ou uma classe abstrata? Por que? Cite exemplos.

Uma **interface** representa um contrato onde necessariamente temos que implementar todos os seus atributos e métodos, em uma interface seus métodos possuem somente a assinatura. 

Ao passo que uma classe **abstrata** representa uma entidade, não pode ser instanciada. Na pratica herdamos todos os seus atributos e métodos, podendo subscrever seus métodos, e não podemos 

**Por que usar uma Interface**

Quando queremos obrigar uma classe a ter certos atributos e métodos, uma classe pode implementar várias interfaces.

**Exemplo:**

```java
public interface Contrato {
 	String nome; 
	public boolean assinar(String assinatura);
}

// A classe ContratoDoPaulo obrigatórimente terá que implementar os atributos e métodos.

public class ContratoDoPaulo implements Contrato {

 String nome;
 
 public boolean assinar(String assinatura){
    // Código 
 }
    
}
```



**Por que usar uma Classe Abstrata**

Na prática quando alguns atributos e métodos são comuns para algumas outras classes, podemos criar uma super classe que contem esses atributos e métodos e compartilhar (herdar).

E as classes que são estendidas de uma classe abstrata herdam seus atributos e métodos.

**Exemplo:**

```java
abstract class Cachorro {
    public void latir() {
        System.out.println("Cachorro Latindo...");
    }
}

class Poodle extends Cachorro {}
class Sharpei extends Cachorro {}

public class Test {

    public static void main(String[] args) {
	Poodle dog1 = new Poodle();	
	Sharpei dog2 = new Sharpei();	
	
	dog1.latir();
	dog2.latir();
    }

}
```

### b) Usar herança ou delegação a outros objetos? Por que? Cite exemplos.

O uso de herança é útil quando queremos reutilizar código. Já a delegação é para aqueles casos onde uma classe precisar usar a outra mais não são do mesmo tipo, ou seja aquele caso onde precisamos utilizar da especialidade da outra classe, mas não herdar seus métodos  e atributos.

**Exemplo de Herança**

Exemplo clássico de herança, onde podemos reutilizar o comportamento da classe animal para as classes leao, macaco e cachorro.

```java
class Animal { // Código }

class Leao extends Animal { // Código }
class Macaco extends Animal{ // Código }
class Cachorro extends Animal{ // Código }
```

**Exemplo de Delegação**

Neste exemplo a classe *usuario* precisa fazer apenas uma consulta no banco de dados e por essa razão precisa utilizar a classe *MySqlConnection* que é especializada em se comunicar com o banco de dados. Não precisamos herda os seus métodos e atributos.

```java
class MySqlConnection { // Código }

class Usuario extends MySqlConnection
{
  // Código
}
```