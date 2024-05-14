public class TiposVarieaveis {
}

/* Tipos de dados 
 No Java, existem algumas palavras reservadas, para a representação dos tipos de dados básicos,
 que precisam ser manipulados, para a construção de programas. 
 Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).

 Os oito tipos primitivos em Java são:

int, byte, short, long, float, double, boolean e char 
– esses tipos não são considerados objetos e portanto representam valores brutos. 
Eles são armazenados diretamente na pilha de memória. (Memory stack)  */

/* Os tipos primitivos, que podem conter partes fracionárias
 float, double */

 /* O ponto mais relevante, em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. 
 Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou o salário de um funcionário?  */

 /* Declaração de Variáveis */
 /* A estrutura padrão para se declarar uma variável sempre é:
<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>  

Exemplos 
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

//Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. // 

public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	}
}

 Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia, 
podem estimular uma alteração de tipos de dados convencional. 
*/

/*  TiposEVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal; 

Por mais que tenhamos ciência do valor quenumeroNormal cabe é um short, o Java não permite correr o risco. */

/* Variáveis e Constantes */
/*Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. 
Em Java, esses valores são representados pela palavra reservada final, seguida do tipo. 
Por convenção, Constantes são sempre escritas em CAIXA ALTA. */

/* public class ExemploVariavel {
	public static void main(String[] args) {
		
		 * esta linha é considerada como declaração de variável iniciamos a existência
		 * variavel numero com valor 5 regra: tipo + nome + valor
		 
		int numero = 5;

		
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 
		numero = 10;

		System.out.print(numero);
		
		
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 
		final double VALOR_DE_PI = 3.14;
		
		VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
	}
}
Compreendemos que, para declarar uma variável como uma constante, 
utilizamos a palavra final, mas por convenção, esta variável deverá ser escrita toda em caixa alta. */

